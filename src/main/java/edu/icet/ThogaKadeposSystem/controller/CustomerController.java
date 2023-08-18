package edu.icet.ThogaKadeposSystem.controller;

import edu.icet.ThogaKadeposSystem.dto.Customer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    public List<Customer> getAllCustomer(){
        return new ArrayList<>();
    }
}
