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
	private Properties dbProperties = null; 
	private String username = null;
	private String password = null;
	private String databaseName = null;
	private String ipAddress = null;
	private String portNumber = null;
	private String url = null;
	
	public static final String SEARCH_FOR_BANK_CARD = "select * from bank_card where cardNo = ?";
	
	public BankCardMySQL_DAO_Impl()
	{
		
		try
		{
			FileInputStream input = new FileInputStream("./resources/dbConfig.properties");

			// load a properties file
			dbProperties.load(input);
			input.close();

			this.username = dbProperties.getProperty("username");
			this.password = dbProperties.getProperty("password");
			this.databaseName = dbProperties.getProperty("databasename");
			this.ipAddress = dbProperties.getProperty("ipAddress");
			this.portNumber = dbProperties.getProperty("portnumber");
			url = "jdbc:mysql://" + this.ipAddress + ":" + this.portNumber + "/" + this.databaseName;
			System.out.println("url = " + url);
			mysqlConnection = new MySQL_Connection(url, username, password);
			dbConnection = mysqlConnection.getConnection();
			System.out.println("Connected to database;");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		try
		{
			if(dbConnection != null)
			{
				mysqlConnection.closeConnection();
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			this.closeConnection();
			return false;
		}
		finally
		{
			this.closeConnection();
		}
		return false;
	}
	
}
