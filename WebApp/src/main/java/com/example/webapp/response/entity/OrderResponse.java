package com.example.webapp.response.entity;

import com.Entity.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderResponse extends AbstractResponse{
    private Order order;
}
