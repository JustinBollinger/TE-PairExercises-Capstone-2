package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class Account 
{

	
//	private Integer acountId;
//	private Integer userId;
//	private BigDecimal balance;
	
//	public Integer getAccountId()
//	{
//		return accountId;
//	}
	
//}
 	private int accountId;
 	private int userId;
    private BigDecimal balance;
    
    public Account()
    {
    	
    }

public Account (int accountId, int userId, BigDecimal balance)
{
this.accountId = accountId;
this.userId = userId;
this.balance = balance;
}


public int getAccountId()
{
	return accountId;
}

public int getUserId()
{
	return userId;
}

public BigDecimal getBalance()
{
	return balance;
}
}