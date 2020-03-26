package com.niit.a.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.a.crm.model.Customer;

@Controller
@RequestMapping("/customer")
public class MainController {
	
	

	@GetMapping("/showForm")
	public String showFormForAdd(ModelMap theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
}
