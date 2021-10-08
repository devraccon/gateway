package com.msa.gateway.controller;

import com.msa.gateway.GatewayApplication;
import org.springframework.boot.SpringApplication;

import java.util.Base64;

public class TestMain {

    public static void main(String[] args) {
//        String apiKey = Base64.getEncoder().encodeToString(("ceo:EW6=?XQhqk$J").getBytes());
//        System.out.println(apiKey);
        try {
            boolean test1 = true;
            Boolean test2 = null;
            Boolean test3 = Boolean.TRUE;
            if (test1 != test2 || test3) {
                System.out.println("11111");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
