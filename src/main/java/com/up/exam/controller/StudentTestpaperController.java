package com.up.exam.controller;

import com.up.exam.dao.QuestionsDao;
import com.up.exam.dao.TestpaperDao;
import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.dataobject.Testpaper;
import com.up.exam.entity.QuestionsLook;
import com.up.exam.util.ConstantPool;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentTestpaperController {

    @Autowired
    TestpaperDao testpaperDao;
    @Autowired
    QuestionsDao questionsDao;

    @RequestMapping("/student/getTestPaper")
    public Map getTestPaper(HttpSession session){
        int count = 1;
        String testPaperID = (String) session.getAttribute("testPaperID");
        Map testPaperMap = new HashMap();
        Testpaper testpaper = testpaperDao.selectByID(testPaperID);
        String[] questionIDs = testpaper.gettestpaperQuestion().split(ConstantPool.spiltSymbol);
        String[] questionNumbers = testpaper.gettestpaperQuestionNumber().split(ConstantPool.spiltSymbol);
        String[] questionScores = testpaper.gettestpaperQuestionScore().split(ConstantPool.spiltSymbol);
        testPaperMap.put("number",questionNumbers);
        testPaperMap.put("scores",questionScores);
        HashMap<String,List> questionMap = new HashMap<>();
        for (int i = 1; i < questionIDs.length; i++) {
            Questions questions = questionsDao.selectByID(questionIDs[i]);
            List questionsList = questionMap.get(questions.getquestionsType());
            if (questionsList==null){
                questionsList = new ArrayList<>();
            }
            List<String> option = new ArrayList<>();
            if (questions.getquestionsType().equals("a")||questions.getquestionsType().equals('b')){
                String[] options =  questions.getquestionsOption().split(ConstantPool.spiltSymbol);
                for (int j = 1; j < options.length; j++) {
                    option.add(options[j]);
                }
                QuestionsLook questionsLook = new QuestionsLook( questions.getquestionsID(),count + "、" + questions.getquestionsStems(),option);
                count++;
                questionsList.add(questionsLook);
            }
            questionMap.put(questions.getquestionsType(),questionsList);
        }

        testPaperMap.put("questions",questionMap);
        return testPaperMap;
    }
}
