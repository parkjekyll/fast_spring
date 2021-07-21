package com.example.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component("base74Encoder")//bean으로 등록해!
public class Base64Encoder implements IEncoder{

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
