package com.up.exam.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.servlet.KaptchaServlet;
import com.google.code.kaptcha.util.Config;
import com.up.exam.dao.TeacherDao;
import com.up.exam.dao.dataobject.Student;
import com.up.exam.dao.dataobject.Teacher;
import com.up.exam.dao.impl.StudentDaoImpl;
import com.up.exam.dao.impl.TeacherDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Properties;

@Controller

public class LoginController {

    @Autowired
    private DefaultKaptcha kaptcha;
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    StudentDaoImpl studentDao;
    @Autowired
    TeacherDaoImpl teacherDao;

    String kaptchaText = new String();
    static String emailCaptcha;


    @ResponseBody
    @RequestMapping("/login/student")
    public String loginStudent(HttpSession session,@RequestParam("id")String id,@RequestParam("password")String password){
        Student student = studentDao.selectByID(id);
        if (student!=null){
            if (student.getStudentPwd().equals(password)){
                session.setAttribute("student",student);
                return "1";
            }
            return "-2";
        }
        return "-1";

    }
    @ResponseBody
    @RequestMapping("/login/teacher")
    public String loginTeacher(HttpSession session,@RequestParam("id")String id,@RequestParam("password")String password){
        Teacher teacher = teacherDao.selectByID(id);
        if (teacher!=null){
            if (teacher.getteacherPwd().equals(password)){
                session.setAttribute("teacher",teacher);
                return "1";
            }
            return "-2";
        }
        return "-1";

    }
    @ResponseBody
    @RequestMapping("/login/forgetStudent")
    public String forgetStudent(@RequestParam("id")String id,@RequestParam("newPassword")String password,@RequestParam("verificationCode")String verificationCode){
        if (verificationCode.equals(emailCaptcha)){
            Student student = studentDao.selectByID(id);
            if (student!=null){
                student.setStudentPwd(password);
                if (studentDao.update(student)){
                    return "1";
                }
            }
            return "-2";
        }
        return "-1";
    }

    @ResponseBody
    @RequestMapping("/login/forgetTeacher")
    public String forgetTeacher(@RequestParam("id")String id,@RequestParam("newPassword")String password,@RequestParam("verificationCode")String verificationCode){
        if (verificationCode.equals(emailCaptcha)){
            Teacher teacher = teacherDao.selectByID(id);
            if (teacher!=null){
                teacher.setteacherPwd(password);
                if (teacherDao.update(teacher)){
                    return "1";
                }
            }
            return "-2";
        }
        return "-1";
    }

    @RequestMapping("/login/sendUserEmail")
    @ResponseBody
    public String sendUserEmail(HttpSession session,@RequestParam("id")String id, @RequestParam("email")String email){
        Student student = studentDao.selectByID(id);
        if (student!=null){
            if (student.getStudentEmail().equals(email)){
                sendEmail(session,email);
                return "1";
            }
            return "-2";
        }
        return "-1";
    }



    public  void  sendEmail(HttpSession session,String email){
        //邮件传输对象
        SimpleMailMessage message = new SimpleMailMessage();
        //发
        message.setFrom("zhouyujun1310@163.com");
        //收
        message.setTo(email);
        //设置邮件内容
        //标题
        message.setSubject("考试验证码");
        //随机数并且加入cookie
        String code = kaptcha.createText();
        session.setAttribute("emailCode",code);
        //内容
        message.setText("验证码:" + code);

        //发送
        mailSender.send(message);
    }
    @Bean
    public DefaultKaptcha initKaptcha(){
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }

    //添加响应头信息
    @ResponseBody
    @RequestMapping(path = "/captcha")
    public void getCaptcha(HttpServletResponse response, HttpSession session) throws IOException {

        //设置Http Cache 响应头
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        //设置返回图片的格式
        // return a jpeg
        response.setContentType("image/png");
        // create the text for the image
        //产生随机数
        String capText = kaptcha.createText();
        kaptchaText = capText;
        // store the text in the session
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text
        //转换成图片并且输出
        BufferedImage bi = kaptcha.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(bi, "png", out);
        try {
            out.flush();
        } finally {
            out.close();
        }

    }

}
