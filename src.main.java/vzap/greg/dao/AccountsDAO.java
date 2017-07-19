package vzap.greg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vzap.greg.banking.Account;
import vzap.greg.banking.CurrentAccount;
import vzap.greg.banking.Money;
import vzap.greg.banking.SavingsAccount;
import vzap.greg.connection.MySQL_Connection;
import vzap.greg.enums.AccountType;

public class AccountsDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	private Vector<Account> accounts = null;
	
	public static final String SEARCH_FOR_ACCOUNTS = "select * from accounttable where clientid = ?";
	
	public AccountsDAO()
	{
		
		try
		{
			mysqlConnection = new MySQL_Connection();
			dbConnection = mysqlConnection.getConnection();
			accounts = new Vector<Account>();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public Vector getAccounts(int clientID)
	{
		try
		{
			prepStmt = dbConnection.prepareStatement(SEARCH_FOR_ACCOUNTS);
			prepStmt.setInt(1, clientID);
			rs = prepStmt.executeQuery();
			while(rs.next())
			{
				int accountNumber = rs.getInt(1);
				String accountType = rs.getString(2);
				int cliendid = rs.getInt(3);
				double balance = rs.getDouble(4);
				String dateCreated = rs.getString(5);
				double minimumBalance = rs.getDouble(6);
				String isFrozen = rs.getString(7);
				String isActive = rs.getString(8);
				if(accountType.equals("sa"))
				{
					SavingsAccount sa = new SavingsAccount(accountNumber, AccountType.SAVINGS_ACCOUNT, dateCreated, new Money(balance), isFrozen, isActive);
					accounts.addElement(sa);
				}
				if(accountType.equals("ca"))
				{
					CurrentAccount ca = new CurrentAccount(accountNumber, AccountType.CURRENT_ACCOUNT, dateCreated, new Money(balance), isFrozen, isActive);
					accounts.addElement(ca);
				}
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return accounts;
	}
}
