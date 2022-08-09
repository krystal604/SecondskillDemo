package com.example.webapp.response.entity;

import com.Entity.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductResponse extends AbstractResponse{
    Product product;
}
