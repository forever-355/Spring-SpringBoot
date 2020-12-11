package com.example1.springbootdemo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(HttpServletRequest request,String username,String password){
        if ("admin".equals(username) && "666666".equals(password)){
            request.getSession().setAttribute("username","admin");
            return "redirect:/view/index"; //客户端跳转
        } else{
            request.setAttribute("errorMsg", "用户名或密码有误");
            return "login";//服务器跳转
        }
    }
}
