package com.techelevator.tenmo.model;

import java.math.BigDecimal;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


import com.techelevator.tenmo.dao.AccountDAO;

public class JDBCAccountDAO  implements AccountDAO
{

	
	private JdbcTemplate jdbcTemplate;
	

	public JDBCAccountDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public BigDecimal getBalance(int accountId)
	{
		BigDecimal balance = null;
		
		String sql = "SELECT balance FROM accounts WHERE account_id = ?";
		
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, accountId);
		result.next();
		
		balance = result.getBigDecimal("balance");
		
		return balance;
				
	}
	
	public Integer getAccountId(int userId)
	{
		Integer accountId = null;
		String sql = "SELECT account_id FROM acounts WHERE user_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, userId);
		result.next();
		
		accountId = result.getInt("account_id");
		return accountId;
	}
}


