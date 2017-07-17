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
	private BankCard bankCard = null;
	private BankClient bankClient = null;
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
				String firstname = rs.getString(2);
				String surname = rs.getString(3);
				String email = rs.getString(4);
				String cellnumber = rs.getString(5);
				String isActive = rs.getString(6);
				bankClient = new BankClient(bClientID, firstname, surname, email, cellnumber, isActive,bankCard);
				//return bClient;
			}
			//System.out.println("in BanlClientDAO card = " + bankCard.getCardNumber());
			return bankClient;
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
