package vzap.greg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import vzap.greg.banking.BankCard;
import vzap.greg.banking.BankClient;
import vzap.greg.connection.MySQL_Connection;
import vzap.greg.exception.BankCardException;

public class BankClientDAO_Impl implements BankClientDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	private BankCard bankCard = null;
	private BankClient bankClient = null;
	
	public static final String SEARCH_FOR_CLIENT = "select * from clienttable where cardNumber = ?";
	public static final String LIST_ALL_CLIENTS = "select * from clienttable";
	
	
	
	public BankClientDAO_Impl() 
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

	@Override
	public List<BankClient> listBankClients()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankClient searchForBankClient(String surname, String idNumber)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBankClient(BankClient bankClient)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBankClient(BankClient bankClient)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertNewBankClient(BankClient bankClient)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BankClient searchForBankClient(BankCard bankCard)
	{
		int rowsAffected = 0;
		try
		{
			prepStmt = dbConnection.prepareStatement(SEARCH_FOR_CLIENT);
			String cardNo = bankCard.getCardNumber();
			prepStmt.setString(1, cardNo);
			rs = prepStmt.executeQuery();
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

	public static void main(String[] args)
	{
		BankClientDAO_Impl bcd = new BankClientDAO_Impl();
		BankCard bankCard = new BankCard("4701", "1234");
		BankClient bankClient = bcd.searchForBankClient(bankCard);
		System.out.println(bankClient.toString());
	}
}
