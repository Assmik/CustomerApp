package com.example.customerapp.services;

import com.example.customerapp.repositorie.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.customerapp.entiti.Customer;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CustomerService {
    private final CustomerRepository customerRepository;
    public List<Customer> getCustomers(){
        return  customerRepository.findAll();
    }
}
