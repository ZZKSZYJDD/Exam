package com.up.exam.controller;

import com.up.exam.dao.QuestionsDao;
import com.up.exam.dao.TestpaperDao;
import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.dataobject.Testpaper;
import com.up.exam.entity.QuestionsChoose;
import com.up.exam.entity.QuestionsOther;
import com.up.exam.util.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
            if (questions.getquestionsType().equals("a")||questions.getquestionsType().equals("b")){
                String[] options =  questions.getquestionsOption().split(ConstantPool.spiltSymbol);
                for (int j = 1; j < options.length; j++) {
                    option.add(options[j]);
                }
                QuestionsChoose questionsChoose = new QuestionsChoose( questions.getquestionsID(),count + "、" + questions.getquestionsStems(),option,count);
                count++;
                questionsList.add(questionsChoose);
            }
            if (questions.getquestionsType().equals("c")||questions.getquestionsType().equals("e")){
                QuestionsOther questionsOther = new QuestionsOther(count+ "、" + questions.getquestionsStems(),questions.getquestionsID(),count);
                count++;
                questionsList.add(questionsOther);
            }
            if (questions.getquestionsType().equals("d")){
                QuestionsOther questionsOther = new QuestionsOther(count+ "、" + questions.getquestionsStems().replaceAll(ConstantPool.spiltSymbol,"<input :name=\""+questions.getquestionsID()+"\" style=\"border-top: 1px; border-right: 1px; border-left: 1px; width: 100px;\">")
                        ,questions.getquestionsID(),count);
                count++;
                questionsList.add(questionsOther);
            }
            questionMap.put(questions.getquestionsType(),questionsList);
        }
        testPaperMap.put("questions",questionMap);
        return testPaperMap;
    }
}
