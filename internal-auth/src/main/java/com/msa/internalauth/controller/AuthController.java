package com.msa.internalauth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AuthController {

    @RequestMapping("/auth-service/login")
    public String login(){
        return "OK";
    }
}
