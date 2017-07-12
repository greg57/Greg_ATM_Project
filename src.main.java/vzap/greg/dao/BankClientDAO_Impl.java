package vzap.greg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import vzap.greg.banking.BankCard;
import vzap.greg.banking.BankClient;
import vzap.greg.connection.MySQL_Connection;

public class BankClientDAO_Impl implements BankClientDAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	private ResultSet rs = null;
	private BankCard bankCard = null;
	
	public static final String SEARCH_FOR_CLIENT = "select * from clienttable where cardNumber = ?";
	public static final String LIST_ALL_CLIENTS = "select * from clienttable";

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
	public static void main(String[] args)
	{
		
	}
}
