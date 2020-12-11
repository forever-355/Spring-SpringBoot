package com.example1.springbootdemo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("view")
public class ViewController {

    //http://localhost:8080/view2/complextoolbar

    @RequestMapping(value = "/{path1}")
    public String view1(@PathVariable("path1")String path1) {
        return path1;
    }

}
