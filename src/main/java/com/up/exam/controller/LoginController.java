package com.up.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @ResponseBody
    @RequestMapping("/student")
    public String loginStudent(){
        return "hello";
    }
}
