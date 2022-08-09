package com.example.webapp.response.entity;

import org.springframework.stereotype.Component;

@Component
public class FalseResponse extends AbstractResponse{
    public FalseResponse() {
        this.code = AbstractResponse.FALSE_CODE;
        this.message = "false";
    }
}
