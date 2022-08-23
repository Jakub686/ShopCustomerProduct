package com.jakub686.ShopCustomerProduct.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true) // ignore price field
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // it will not return price field in json(postman)
public class OrderResponse {

    private String name;
    private String productName;

    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }
    private int price;
}