package com.example1.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {


    //在浏览器输入http://localhost:8080/hello访问
    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "hello world---";
    }


}