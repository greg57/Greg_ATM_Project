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
			dbProperties = new Properties();
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
			mysqlConnection = new MySQL_Connection(databaseName, username, password);
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
	
	public boolean closeConnection()
	{
		try
		{
			if(dbConnection != null)
			{
				mysqlConnection.closeConnection();
				System.out.println("mysql connection closed..>>>>");
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

	public Properties getDbProperties()
	{
		return this.dbProperties;
	}

	public String getUsername()
	{
		return this.username;
	}

	public String getPassword()
	{
		return this.password;
	}

	public String getDatabaseName()
	{
		return this.databaseName;
	}

	public String getIpAddress()
	{
		return this.ipAddress;
	}

	public String getPortNumber()
	{
		return this.portNumber;
	}

	public String getUrl()
	{
		return this.url;
	}
	public static void main(String[] args)
	{
		BankCardMySQL_DAO_Impl card = new BankCardMySQL_DAO_Impl();
		
	}
	
}
