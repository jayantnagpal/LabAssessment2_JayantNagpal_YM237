package com.customerapp.model.service;

import java.util.Optional;

import com.customerapp.model.dao.Customer;
import com.customerapp.model.dao.CustomerDao;
import com.customerapp.model.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}
	

}
