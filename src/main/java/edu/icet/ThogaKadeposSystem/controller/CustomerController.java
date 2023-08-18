package edu.icet.ThogaKadeposSystem.controller;

import edu.icet.ThogaKadeposSystem.dto.custom.Customer;
import edu.icet.ThogaKadeposSystem.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/getCustomers")
    public List<Customer> getAllCustomer(){
        return customerService.getAll();
    }
    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.add(customer);

    }
}
