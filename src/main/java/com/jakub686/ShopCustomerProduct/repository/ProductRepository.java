package com.jakub686.ShopCustomerProduct.repository;


import com.jakub686.ShopCustomerProduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
