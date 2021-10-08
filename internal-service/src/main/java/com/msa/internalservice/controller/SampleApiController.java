package com.msa.internalservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleApiController {

    @GetMapping("/sample/api1")
    public SampleResponse api1(){
//
        throw new RuntimeException("I/O Exception");
//        return SampleResponse.builder().status(HttpStatus.OK.value()).message("OK").build();
    }
}
