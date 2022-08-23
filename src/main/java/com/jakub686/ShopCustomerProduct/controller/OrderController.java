package com.jakub686.ShopCustomerProduct.controller;

import com.jakub686.ShopCustomerProduct.dto.OrderRequest;
import com.jakub686.ShopCustomerProduct.dto.OrderResponse;
import com.jakub686.ShopCustomerProduct.entity.Customer;
import com.jakub686.ShopCustomerProduct.repository.CustomerRepository;
import com.jakub686.ShopCustomerProduct.repository.ProductRepository;
import com.jakub686.ShopCustomerProduct.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return orderService.saveCustomer(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return orderService.findAllOrders();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
        return orderService.getJoinInformation();
    }
}