package com.example.Spring.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("view2")
public class ViewController {

    //http://localhost:8080/view2/complextoolbar

    @RequestMapping(value = "/{path1}")
    public String view1(@PathVariable("path1")String path1) {
        return path1;
    }

}
