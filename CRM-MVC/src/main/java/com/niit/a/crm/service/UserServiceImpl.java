package com.niit.a.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.a.crm.dao.UserDAO;
import com.niit.a.crm.model.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public User checkUser(User theUser) {
		// TODO Auto-generated method stub
		return userDAO.checkUser(theUser); 
	}

}
