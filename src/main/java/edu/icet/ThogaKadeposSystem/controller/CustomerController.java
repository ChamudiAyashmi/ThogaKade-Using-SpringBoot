package edu.icet.ThogaKadeposSystem.controller;

import edu.icet.ThogaKadeposSystem.dto.custom.Customer;
import edu.icet.ThogaKadeposSystem.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;
    public List<Customer> getAllCustomer(){
        return new ArrayList<Customer>();
    }
}
