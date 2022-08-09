package com.example.webapp.response.factory;

import com.Entity.Entity;
import com.example.webapp.response.entity.AbstractResponse;

public interface ResponseFactory {
    AbstractResponse createResponse ();
    void setEntity(Entity entity);
}
