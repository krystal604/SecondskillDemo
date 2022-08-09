package com.example.webapp.controller;


import com.alibaba.fastjson.JSON;
import com.Entity.Product;
import com.example.webapp.RateLimiter.RateLimiterAnnotation;
import com.example.webapp.response.ResponseFactoryStore;
import com.example.webapp.response.entity.AbstractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    ResponseFactoryStore responseFactoryStore;

    @RateLimiterAnnotation(name = "getProductById" , count = 100.0)
    @GetMapping("/getProductById")
    public String getProductById(String id){
        AbstractResponse response = responseFactoryStore.getResponse(ResponseFactoryStore.ProductResponse, new Product());
        return JSON.toJSONString(response);
    }


    @RateLimiterAnnotation(name = "kill" , count = 100.0)
    @PostMapping("/buyProductById")
    public String buyProductById(String userId , String productId , String token){
        return "";
    }


}
