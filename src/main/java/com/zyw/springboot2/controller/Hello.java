package com.zyw.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Hello {
    @RequestMapping(value = "/index")
    @ResponseBody
    public String test1(){
        return "hello";
    }
}
