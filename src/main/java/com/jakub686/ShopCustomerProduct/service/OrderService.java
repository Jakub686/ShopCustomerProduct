package com.jakub686.ShopCustomerProduct.service;

import com.jakub686.ShopCustomerProduct.dto.OrderResponse;
import com.jakub686.ShopCustomerProduct.entity.Customer;
import com.jakub686.ShopCustomerProduct.repository.CustomerRepository;
import com.jakub686.ShopCustomerProduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }

    public void delete(Integer id) {
        boolean  exists = customerRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("employee is not exists");
        }
        customerRepository.deleteById(id);
    }

}
