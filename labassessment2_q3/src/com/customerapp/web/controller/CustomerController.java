package com.customerapp.web.controller;

import java.sql.Date;
import java.util.Optional;

import com.customerapp.model.dao.Customer;
import com.customerapp.model.service.CustomerService;
import com.customerapp.model.service.CustomerServiceImpl;

public class CustomerController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();
		
		Optional<Customer> cust=customerService.getCustomerById(1);
		System.out.println(cust);
		
		Date dob=new Date(1999-04-11);
		Customer customer=new Customer("Jay", "Gurgaon", "9898231", dob);
		customerService.addCustomer(customer);
	}

}
