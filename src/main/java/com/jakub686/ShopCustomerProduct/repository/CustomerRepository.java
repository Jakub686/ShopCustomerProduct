package com.jakub686.ShopCustomerProduct.repository;


import com.jakub686.ShopCustomerProduct.dto.OrderResponse;
import com.jakub686.ShopCustomerProduct.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.jakub686.ShopCustomerProduct.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}


