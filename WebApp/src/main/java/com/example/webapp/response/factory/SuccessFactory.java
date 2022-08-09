package com.example.webapp.response.factory;

import com.example.webapp.Entity.Entity;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.entity.SuccessResponse;

public class SuccessFactory implements ResponseFactory{
    @Override
    public AbstractResponse createResponse() {
        return new SuccessResponse();
    }

    @Override
    public void setEntity(Entity entity) {

    }
}
