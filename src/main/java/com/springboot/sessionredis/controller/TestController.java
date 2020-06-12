package com.springboot.sessionredis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/setSession")
    public String setSession(HttpSession httpSession){
        httpSession.setAttribute("name", "hong");
        return   port;
    }
    @GetMapping("/getSession")
    public String getSession(HttpSession httpSession){
        Object name = httpSession.getAttribute("name");
        if(name !=null){
            return name.toString();
        }
    return port;
    }

}
