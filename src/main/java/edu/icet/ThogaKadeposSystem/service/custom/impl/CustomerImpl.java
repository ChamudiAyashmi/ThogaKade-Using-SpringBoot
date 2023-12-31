package edu.icet.ThogaKadeposSystem.service.custom.impl;

import edu.icet.ThogaKadeposSystem.dto.custom.Customer;
import edu.icet.ThogaKadeposSystem.service.custom.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerImpl implements CustomerService {

    ArrayList<Customer> customerList;
    public CustomerImpl() {
        customerList=new ArrayList<>();
        customerList.add(new Customer("C001","Danapala","Panadura",45000));
        customerList.add(new Customer("C002","Gunapala","Galle",75000));
        customerList.add(new Customer("C003","Somapala","Matara",54000));
    }
    @Override
    public List<Customer> getAll() {
        return this.customerList;
    }

    @Override
    public Customer search(String s) {
       return null;
    }

    @Override
    public Customer add(Customer customer) {
        customerList.add(customer);
        return customer;
    }
}
