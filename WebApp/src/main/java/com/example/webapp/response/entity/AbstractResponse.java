package com.example.webapp.response.entity;

import lombok.Data;

@Data
public abstract class AbstractResponse {
    protected static final String FALSE_CODE = "509";
    protected static final String SUCCEED_CODE = "509";

    String code;
    String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
