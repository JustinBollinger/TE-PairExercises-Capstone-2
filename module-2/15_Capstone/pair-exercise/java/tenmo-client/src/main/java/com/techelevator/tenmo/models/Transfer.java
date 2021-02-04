package com.techelevator.tenmo.models;

import java.math.BigDecimal;
import java.math.RoundingMode;
// not sure if we need - would this be like the desposit.java done in auction review code? //


public class Transfer
{
	private int id;
	private int typeId;
	private int statusId;
	private int accountFrom;
	private int accountTo;
	private double amount;

public Transfer()
{
	
}
public Transfer (int type, int status, int from, int to, double amount)
{
	this.typeId = type;
	this.statusId = status;
	this.accountFrom = from; 
	this.accountTo = to;
	this.amount = amount;
}


public int getId()
{
	return id;
}

public int getStatusId()
{
	return statusId;
}

public int getTypeId()
{
	return typeId;
}

 public int getAccountTo()
 {
	 return accountTo;
 }

public int getAccountFrom()
{
	return accountFrom;
}

public double getAmount()
{
	return amount;
}
public void setId(int id)
{
	this.id = id;
}
public void setAmount(double amount)
{
	this.amount = amount;
}

public void setStatusId(int statusId)
{
	this.statusId = statusId;
}
public void setAccountFrom(int accountFrom)
{
	this.accountFrom = accountFrom;
}

public void setAccountTo(int accountTo)
{
	this.accountTo = accountTo;
}


public String toString (User user)
{
	if (user.getId() == this.getAccountFrom())
		
	{
		return this.id + "\t" + "From: " +user.getUsername() + "\t$" + 
	new BigDecimal(this.amount).setScale(2, RoundingMode.HALF_UP);
	}
	
	else if (user.getId() == this.getAccountTo()) {
		return this.id + "\t" + "To: " +user.getUsername() + "\t$"
	+ new BigDecimal(this.amount).setScale(2, RoundingMode.HALF_UP);
	}
	
	else return "invalid transaction";
}
}

