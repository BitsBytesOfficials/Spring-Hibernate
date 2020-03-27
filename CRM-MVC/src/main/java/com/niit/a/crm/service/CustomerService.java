package com.niit.a.crm.service;

import java.util.List;

import com.niit.a.crm.model.Customer;

public interface CustomerService {
 public void saveCustomer(Customer theCustomer);
 public List<Customer> getCustomers();

}
