package com.niit.a.crm.dao;
import java.util.List;

import com.niit.a.crm.model.Customer;

public interface CustomerDAO {

	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();

}
