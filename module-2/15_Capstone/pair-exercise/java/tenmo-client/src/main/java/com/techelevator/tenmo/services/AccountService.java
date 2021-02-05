package com.techelevator.tenmo.services;

import java.math.BigDecimal;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.tenmo.models.Account;
import com.techelevator.tenmo.models.AuthenticatedUser;

public class AccountService
{

	private String BASE_URL;
	private RestTemplate restTemplate = new RestTemplate();
	private AuthenticatedUser currentUser;

	public AccountService(String url, AuthenticatedUser currentUser)
	{
		this.currentUser = currentUser;
		BASE_URL = url;
	}

	public BigDecimal getBalance()
	{
		String url = BASE_URL + "/account";
		BigDecimal balance = restTemplate.getForObject(url, BigDecimal.class);

		return balance;
	}

	private HttpEntity makeAuthEntity()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(currentUser.getToken());
		HttpEntity entity = new HttpEntity<>(headers);
		return entity;
	}

}