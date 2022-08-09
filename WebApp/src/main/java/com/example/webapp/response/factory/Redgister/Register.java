package com.example.webapp.response.factory.Redgister;


import com.example.webapp.response.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Register {

    @Autowired
    RegisterMap registerMap;

    @Bean
    public void registerAllFactory(){
        registerMap.register("orderResponse" , new OrderFactory());
        registerMap.register("productResponse" , new ProductFactory());
        registerMap.register("successResponse" , new SuccessFactory());
        registerMap.register("outOfTimeResponse" , new OutOfTimeFactory());
        registerMap.register("falseResponse" , new FalseFactory());
    }
}
