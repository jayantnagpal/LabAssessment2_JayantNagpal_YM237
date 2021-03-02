package com.customerapp.model.service;

import java.util.Optional;

import com.customerapp.model.dao.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id);

}
