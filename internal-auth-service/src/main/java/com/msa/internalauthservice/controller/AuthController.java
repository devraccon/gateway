package com.msa.internalauthservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class AuthController {



    @RequestMapping("/v3/shop-owners/ceo/{testNumber}")
    public String test(@PathVariable(name="testNumber") String testNumber ,  HttpServletRequest request){
//        throw new RuntimeException("failed");
        try{
            Thread.sleep(500000000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("request server port : {}" , request.getServerPort());
        return "OK";
    }

    @RequestMapping("/v3/shops/ceo")
    public String test1(HttpServletRequest request){
//        throw new RuntimeException("failed");
        try{
            Thread.sleep(100000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("request server port : {}" , request.getServerPort());
        return "OK";
    }

    @RequestMapping("/auth-service/login")
    public String authlogin(HttpServletRequest request){
//        throw new RuntimeException("failed");
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("request server port : {}" , request.getServerPort());
        return "TEST-OK";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }

        log.info("request server port : {}" , request.getServerPort());
        return "OK";
    }
}
