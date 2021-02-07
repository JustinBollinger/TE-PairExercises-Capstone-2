package com.techelevator.tenmo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techelevator.tenmo.model.LoginDTO;

public class LoginDTOTest
{
	
	
	LoginDTO login = new LoginDTO();
	
	@Test
	public void getUserName_equals_Hello()
	{
		login.setUsername("Hello!");
		assertEquals(login.getUsername(), "Hello!");
	}
	
	@Test
	public void getPassword_equals_Hello()
	{
		login.setPassword("Hello!");
		assertEquals(login.getPassword(), "Hello!");
	}
}
