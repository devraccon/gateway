package com.msa.gateway.controller;

import com.msa.gateway.GatewayApplication;
import org.springframework.boot.SpringApplication;

import java.util.Base64;
import java.util.UUID;

public class TestMain {

    public static void main(String[] args) {
//        String apiKey = Base64.getEncoder().encodeToString(("ceo:EW6=?XQhqk$J").getBytes());
//        System.out.println(apiKey);
        try {
//            boolean test1 = true;
//            Boolean test2 = null;
//            Boolean test3 = Boolean.TRUE;
//            if (test1 != test2 || test3) {
//                System.out.println("11111");
//            }

            System.out.println(UUID.fromString("3051a8d7-aea7-1801-e0bf-bc539dd60cf3").toString());
        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
