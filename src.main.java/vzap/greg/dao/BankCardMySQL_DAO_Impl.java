package vzap.greg.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import vzap.greg.banking.BankCard;
import vzap.greg.connection.MySQL_Connection;

public class BankCardMySQL_DAO_Impl implements BankCardDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	
	public static final String SEARCH_FOR_BANK_CARD = "select * from cardtable where cardNumber = ?";
	
	public BankCardMySQL_DAO_Impl()
	{
		
		try
		{
			mysqlConnection = new MySQL_Connection();
			dbConnection = mysqlConnection.getConnection();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public BankCard validateBankCard(BankCard bankCard)
	{
		int rowsAffected = 0;
		try
		{
			prepStmt = dbConnection.prepareStatement(SEARCH_FOR_BANK_CARD);
			String cardNo = bankCard.getCardNumber();
			prepStmt.setString(1, cardNo);
			rs = prepStmt.executeQuery();
			while(rs.next())
			{
				rowsAffected++;
				String cardNumber = rs.getString(1);
				int pinNumber = rs.getInt(2);
				int clientID = rs.getInt(3);
				String isAdmin = rs.getString(4);
				String isFrozen = rs.getString(5);
				BankCard bc = new BankCard()
			}
			if(rowsAffected > 0)
			{
				mysqlConnection.closeConnection();
				return true;
			}
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
			return false;
		}
		finally
		{
			try
			{
				mysqlConnection.closeConnection();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		BankCardMySQL_DAO_Impl card = new BankCardMySQL_DAO_Impl();
		
	}
	
}
