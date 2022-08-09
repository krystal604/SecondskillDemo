package com.example.webapp.response.factory;


import com.example.webapp.Entity.Entity;
import com.example.webapp.Entity.Product;
import com.example.webapp.response.entity.AbstractResponse;
import com.example.webapp.response.entity.OrderResponse;
import com.example.webapp.response.entity.ProductResponse;
import lombok.Data;

@Data
public class ProductFactory implements ResponseFactory{

    private Product product;

    @Override
    public AbstractResponse createResponse() {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProduct(this.product);
        productResponse.setCode("200");
        productResponse.setMessage("success");
        return new OrderResponse();
    }

    @Override
    public void setEntity(Entity entity) {
        product = (Product) entity;
    }
//    public AbstractResponse createResponse(Product product) {
//        ProductResponse productResponse = new ProductResponse();
//        productResponse.setProduct(product);
//        productResponse.setCode("200");
//        productResponse.setMessage("success");
//        return productResponse;
//    }
}
