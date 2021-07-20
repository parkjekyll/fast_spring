package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntitiy
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User(); // 자바 11버전부터 추가된 것
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
