package com.example.customerapp.repositorie;

import com.example.customerapp.entiti.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}
