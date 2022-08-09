package com.example.webapp.response.entity;

public class SuccessResponse extends AbstractResponse{
    public SuccessResponse() {
        this.code = "200";
        this.message = "success";
    }
}
