package com.example.webapp.response.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OutOfTimeResponse extends AbstractResponse{
    public OutOfTimeResponse() {
        this.code = "102";
        this.message = "out of time";
    }
}
