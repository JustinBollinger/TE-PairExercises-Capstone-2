package com.techelevator.tenmo.dao;

import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.tenmo.model.Account;

@Service
public class AccountSqlDAO implements AccountDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public AccountSqlDAO()
	{
		
	}
	
	public void AccountSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public BigDecimal getBalance(int userId)
	{
		BigDecimal balance = null;
		
		// build the query
		String sql = "SELECT balance " + 
					 "FROM accounts " + 
					 "WHERE user_id = ?;";
		
		// execute sql statement
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, userId);
		
		if (row.next())
		{
			balance = row.getBigDecimal("balance");
		}
		
		return balance;
	}


	@Override
	public BigDecimal addToBalance(BigDecimal amountToAdd, int id)
	{
		return null;
	}

	@Override
	public BigDecimal subtractFromBalance(BigDecimal amountToSubtract, int id)
	{
		return null;
	}

	@Override
	public Account findUserById(int userId)
	{
		return null;
	}

	@Override
	public Account findAccountById(int id)
	{
		return null;
	}
	
	private Account mapRowToAccount(SqlRowSet row)
	{
		Account account = new Account();

		account.setAccountId(row.getInt("accountId"));
		account.setUserId(row.getInt("userId"));
		account.setBalance(row.getBigDecimal("balance"));

		return account;
	}
}