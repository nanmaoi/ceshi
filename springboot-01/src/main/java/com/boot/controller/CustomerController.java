package com.boot.controller;

import com.boot.mapper.CustomerMapper;
import com.boot.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/queryCusList")
    private List<Customer> queryCusList(){
        List<Customer> customers = customerMapper.queryCusList();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        return customers;
    }
}
