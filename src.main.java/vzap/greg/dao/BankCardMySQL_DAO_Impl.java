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
	public boolean closeConnection()
	{
		try
		{
			if(dbConnection != null)
			{
				mysqlConnection.closeConnection();
				//System.out.println("mysql connection closed..>>>>");
				return true;
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean validateBankCard(BankCard bankCard)
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
			}
			if(rowsAffected > 0)
			{
				this.closeConnection();
				return true;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			this.closeConnection();
			return false;
		}
		finally
		{
			this.closeConnection();
		}
		return false;
	}

	public MySQL_Connection getMysqlConnection()
	{
		return this.mysqlConnection;
	}

	public Connection getDbConnection()
	{
		return this.dbConnection;
	}

	public static void main(String[] args)
	{
		BankCardMySQL_DAO_Impl card = new BankCardMySQL_DAO_Impl();
		
	}
	
}
