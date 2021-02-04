package com.techelevator.tenmo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.tenmo.dao.AccountDAO;
import com.techelevator.tenmo.dao.UserDAO;

@RestController
@PreAuthorize("isAuthenticated()")
@RequestMapping(path = "/accounts")
public class AccountController
{

	AccountDAO dao;

	UserDAO userDAO;
	
	@GetMapping("/{accountId}")
	public BigDecimal getBalance(@PathVariable int accountId)
	{
		BigDecimal balance = dao.getBalance(accountId);
		return balance;
	}
	
}
