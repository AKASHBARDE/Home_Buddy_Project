package com.home_buddy_backend.managment.Controller;

import com.home_buddy_backend.managment.Entity.Customer;
import com.home_buddy_backend.managment.Repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

        @Autowired
        private CustomerRepository customerRepository;

        @GetMapping
        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }

        @PostMapping
        public Customer createCustomer(@RequestBody Customer customer) {
            return customerRepository.save(customer);
        }
    }

