package com.niit.a.crm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.a.crm.dao.CustomerDAO;
import com.niit.a.crm.model.Customer;


@Service
public class CustomerServiceImp implements CustomerService {

	
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub

		customerDAO.saveCustomer(theCustomer);
	}
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
