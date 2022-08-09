package com.example.webapp.response.factory.Redgister;

import com.example.webapp.controller.Main;
import com.example.webapp.response.factory.ResponseFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RegisterMap {

    public static Map<String , ResponseFactory> registerMap ;
    static {
        registerMap = new ConcurrentHashMap<>();
    }
    public void register(String type,ResponseFactory responseFactory){
        registerMap.put(type , responseFactory);
    }
    public ResponseFactory getFactory(String type){
        return registerMap.get(type);
    }

}
