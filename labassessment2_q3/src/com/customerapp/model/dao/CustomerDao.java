package com.customerapp.model.dao;

import java.util.Optional;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id);

}
