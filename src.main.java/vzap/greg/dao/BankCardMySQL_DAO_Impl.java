package vzap.greg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vzap.greg.banking.BankCard;
import vzap.greg.connection.MySQL_Connection;

public class BankCardDAO_Impl implements BankCardDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	
	public static final String SEARCH_FOR_BANK_CARD = "select * from bank_card where cardNo = ?";
	
	public BankCardDAO_Impl()
	{
		try
		{
			mysqlConnection = new MySQL_Connection("atm_bank_db", "root", "root");
			dbConnection = mysqlConnection.getConnection();
		}
		catch (ClassNotFoundException | SQLException e)
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
