package com.msa.internalservice.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class SampleResponse {
    private int status;
    private String message;
}
