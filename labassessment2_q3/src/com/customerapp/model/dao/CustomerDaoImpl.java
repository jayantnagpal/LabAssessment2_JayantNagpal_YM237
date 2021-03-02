package com.customerapp.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.customerapp.model.exceptions.CustomerNotFoundException;
import com.customerapp.model.exceptions.DataAccessException;

public class CustomerDaoImpl implements CustomerDao {
	
	private Connection connection;
	
	public CustomerDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public void addCustomer(Customer customer) {
		PreparedStatement pstmt;
		try {
			pstmt=connection.prepareStatement("insert into cust1(name,address,mobileNo, dob) values(?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getMobileNo());
			pstmt.setDate(4, customer.getDob());
			
			int no=pstmt.executeUpdate();
		} catch(SQLException ex){
			throw new DataAccessException("Unable to add customer");
		}
		
		
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		PreparedStatement pstmt;
		Customer customer=null;
		
		try {
			pstmt=connection.prepareStatement("Select * from cust1 where id=?");
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				customer=new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("mobileNo"), rs.getDate("dob"));
			}
		} catch(SQLException ex) {
			throw new CustomerNotFoundException("Customer with id " + id + " not found.");
		}
		return Optional.ofNullable(customer);
	}
	

}
