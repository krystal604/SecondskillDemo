package com.example.webapp.response;

import com.example.webapp.Entity.Entity;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.factory.Redgister.RegisterMap;
import com.example.webapp.response.factory.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactoryStore {
    public static final String FalseResponse = "falseResponse";
    public static final String OrderResponse = "orderResponse";
    public static final String OutOfTimeResponse = "outOfTimeResponse";
    public static final String ProductResponse = "productResponse";
    public static final String SuccessResponse = "successResponse";


    @Autowired
    RegisterMap registerMap;

    public AbstractResponse getResponse(String type){
        return registerMap.getFactory(type).createResponse();
    }

    public AbstractResponse getResponse(String type , Entity entity){
        ResponseFactory factory = registerMap.getFactory(type);
        factory.setEntity(entity);
        return factory.createResponse();
    }

}
