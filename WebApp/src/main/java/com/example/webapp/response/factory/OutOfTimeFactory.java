package com.example.webapp.response.factory;

import com.Entity.Entity;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.entity.OutOfTimeResponse;

public class OutOfTimeFactory implements ResponseFactory{
    @Override
    public AbstractResponse createResponse() {
        return new OutOfTimeResponse();
    }

    @Override
    public void setEntity(Entity entity) {

    }
}
