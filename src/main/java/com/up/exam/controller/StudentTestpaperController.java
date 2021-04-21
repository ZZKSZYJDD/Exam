package com.up.exam.controller;

import com.up.exam.dao.QuestionsDao;
import com.up.exam.dao.TestpaperDao;
import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.dataobject.Testpaper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentTestpaperController {

    @Autowired
    TestpaperDao testpaperDao;
    @Autowired
    QuestionsDao questionsDao;

    @RequestMapping("/student/getTestPaper")
    public Map getTestPaper(HttpSession session){
        String testPaperID = (String) session.getAttribute("testPaperID");
        Map testPaperMap = new HashMap();
        Testpaper testpaper = testpaperDao.selectByID(testPaperID);
        String[] questionIDs = testpaper.gettestpaperQuestion().split("@");
        String[] questionNumbers = testpaper.gettestpaperQuestionNumber().split("@");
        String[] questionScores = testpaper.gettestpaperQuestionScore().split("@");
        testPaperMap.put("number",questionNumbers);
        testPaperMap.put("scores",questionScores);
        HashMap<Integer,Questions> questionMap = new HashMap<>();
        for (int i = 0; i < questionIDs.length; i++) {
            Questions questions = questionsDao.selectByID(questionIDs[i]);
            questionMap.put(questions.getquestionsType(),questions);
        }
        testPaperMap.put("questions",questionMap);
        return testPaperMap;
    }
}
