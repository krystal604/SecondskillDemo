package com.example.webapp.response.factory;

import com.example.webapp.Entity.Entity;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.entity.FalseResponse;

public class FalseFactory implements ResponseFactory{
    @Override
    public AbstractResponse createResponse() {
        return new FalseResponse();
    }

    @Override
    public void setEntity(Entity entity) {

    }
}
