package com.niit.a.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.a.crm.model.User;
import com.niit.a.crm.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	
	@Autowired
	UserService userService;
	
	@GetMapping("/loginForm")
	public String showLoginForm(Model theModel) {
		
		
		User theUser=new User();
		System.out.println("hello Check User run123");
		theModel.addAttribute("user",theUser);
		return "login-customer";
	}
	
	@RequestMapping(value="/loginUser",method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute User theUser) {
		System.out.println("hello Check User run");
		User usr=userService.checkUser(theUser);
		
		ModelAndView model=null;
		
		if(usr==null) {
			
			model=new ModelAndView("login-customer");
			model.addObject("error","Invalid Username or Password");
			
			
		}
		
		else
		{
			
			model=new ModelAndView("Welcome");
			model.addObject("user",usr);
			
			
		}
		return model;
	}
}
