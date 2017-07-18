package vzap.greg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vzap.greg.banking.Account;
import vzap.greg.banking.BankCard;
import vzap.greg.banking.BankClient;
import vzap.greg.connection.MySQL_Connection;

public class BankClientAccountDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	private ArrayList<Account> bankAcounts;
	
	public static final String SEARCH_FOR_CLIENT_ACCOUNTS = "select * from accounttable where clientID = ?";
	public static final String LIST_ALL_CLIENTS = "select * from accounttable";
	
	
	
	public BankClientAccountDAO() 
	{
		super();
		try
		{
			mysqlConnection = new MySQL_Connection();
			dbConnection = mysqlConnection.getConnection();
		}
		catch (ClassNotFoundException | SQLException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Account searchForClientAccount(BankCard bankCard)
	{
		int rowsAffected = 0;
		try
		{
			prepStmt = dbConnection.prepareStatement(SEARCH_FOR_CLIENT_ACCOUNTS);
			int clientID = bankCard.getClientid();
			prepStmt.setInt(1, clientID);
			rs = prepStmt.executeQuery();
			while (rs.next())
			{
				int accountNUmber = rs.getInt(1);
				String accountType = rs.getString(2);
				int clientid = rs.getInt(3);
				double balance = rs.getDouble(4);
				String dateCreated = rs.getString(5);
				double minimumBalance = rs.getDouble(6);
				String isFrozen = rs.getString(7);
				String isActive = rs.getString(8);
				
				//Account account = new 
			}
			//System.out.println("in BanlClientDAO card = " + bankCard.getCardNumber());
			return null;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			try
			{
				mysqlConnection.closeConnection();
			}
			catch (SQLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return null;
		}
		
	}

}
