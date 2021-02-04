package com.techelevator.tenmo.services;

import java.math.BigDecimal;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.tenmo.models.AuthenticatedUser;

import okhttp3.internal.http.HttpMethod;

public class AccountService
{
	public static String AUTH_TOKEN = "";
	private String BASE_URL;
	private  RestTemplate restTemplate = new RestTemplate();
	// should it be private final or just private? 

	public AccountService(String url)
	{
		this.BASE_URL = url;	
	}
	
	public BigDecimal getBalance(AuthenticatedUser currentUser)
	

		
	{
		BigDecimal balance = null;
		AUTH_TOKEN = currentUser.getToken();
		
	
		
		try
		{
			balance = restTemplate.exchange(BASE_URL + "/users/accounts" + currentUser.getUser().getId(), HttpMethod.GET, 
					makeAuthEntity(), BigDecimal.class).getBody();
		}
		
		
		catch (RestClientResponseException e) 
		{
			System.out.println(e.getRawStatusCode());
		}
		
		
		
		return balance;
	}
	
	public Integer getAccountId(AuthenticatedUser currentUser)
	{
		Integer accountId = null;
		try
		{
			accountId = restTemplate.exchange(BASE_URL + "/users/accounts/ids" + currentUser.getUser().getId(), HttpMethod.GET, 
					makeAuthEntity(), BigDecimal.class).getBody();
		}
		
		
		catch (RestClientResponseException e) 
		{
			System.out.println(e.getRawStatusCode());
		}
		
	
	return accountId;
}

	
//	private HttpEntity<Deposit> makeEntity(Deposit deposit)
//	{
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// add bearer token if user is logged in
//		if(user != null)
//		{
//			headers.setBearerAuth(user.getToken());
//		}
//		
//		HttpEntity<Deposit> entity = new HttpEntity<Deposit>(deposit, headers);
		
//		return entity;
//	}
	
	
	
}
