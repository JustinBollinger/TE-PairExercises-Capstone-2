package com.techelevator.tenmo.dao;
import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.tenmo.model.Account;




public class AccountSqlDAO implements AccountDAO{

private static final Object accountId = null;
private JdbcTemplate jdbcTemplate;

	public void JDBCAccountSqlDAO(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public BigDecimal getBalance(int accountId)
	{	
	// build the query
	String sqlFindAccountsById= "SELECT *" + 
					 "FROM accounts" + 
					 "WHERE account_id = ?;";
	return null;
	
		       
	}

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


	@Override
	public BigDecimal addToBalance(BigDecimal amountToAdd, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal subtractFromBalance(BigDecimal amountToSubtract, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}