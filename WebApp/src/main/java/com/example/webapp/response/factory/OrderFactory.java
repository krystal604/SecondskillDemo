package com.example.webapp.response.factory;

import com.example.webapp.Entity.Entity;
import com.example.webapp.Entity.Order;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.entity.OrderResponse;
import lombok.Data;

@Data
public class OrderFactory implements ResponseFactory{
    private Order order;
    @Override
    public AbstractResponse createResponse() {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrder(this.order);
        orderResponse.setCode("200");
        orderResponse.setMessage("success");
        return orderResponse;
    }

    @Override
    public void setEntity(Entity entity) {
        order = (Order) entity;
    }
//    public AbstractResponse createResponse(Order order) {
//        OrderResponse orderResponse = new OrderResponse();
//        orderResponse.setOrder(order);
//        orderResponse.setCode("200");
//        orderResponse.setMessage("success");
//        return orderResponse;
//    }

}
