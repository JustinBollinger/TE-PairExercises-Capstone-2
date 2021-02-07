package com.techelevator.tenmo.controller;

import java.math.BigDecimal; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.tenmo.dao.AccountDAO;
import com.techelevator.tenmo.dao.UserDAO;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.User;

@RestController
@PreAuthorize("isAuthenticated()")
public class AccountController {


	private AccountDAO accountDAO;

	private UserDAO userDAO;


	@RequestMapping(path = "user/{userId}", method = RequestMethod.GET)
	public BigDecimal getBalance(@PathVariable int userId) {
		BigDecimal balance = accountDAO.getBalance(userId);
		return balance;
	}
	
	@RequestMapping(path = "listusers", method = RequestMethod.GET)
	public List <User> listUsers() {
		List <User> users = userDAO.findAll();
		return users;
	}
	
}