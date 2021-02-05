//package com.techelevator.tenmo.dao;
//
//import java.math.BigDecimal;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
//
//import com.techelevator.tenmo.model.Account;
//
//public class AccountSqlDAO implements AccountDAO
//{
//	private JdbcTemplate jdbcTemplate;
//	
//	public Account getBalance(int accountId)
//	{
//		Account balance = null;
//		
//		// build the query
//		String sql = "SELECT *" + 
//					 "FROM accounts" + 
//					 "WHERE account_id = ?;";
//		
//		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, accountId);
//		
//		if (row.next())
//		{
//			balance = mapRowToAccount(row);
//		}
//		
//		return balance;
//		
//	}
//
//	@Override
//	public BigDecimal addToBalance(BigDecimal amountToAdd, int id)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public BigDecimal subtractFromBalance(BigDecimal amountToSubtract, int id)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Account findUserById(int userId)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Account findAccountById(int id)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	private Account mapRowToAccount(SqlRowSet row)
//	{
//		Account account = new Account();
//		
//		account.setAccountId(row.getInt("accountId"));
//		account.setUserId(row.getInt("userId"));
//		account.setBalance(row.getBigDecimal("balance"));
//		
//		return account;	
//	}
//	
//	
//}
