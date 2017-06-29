package vzap.greg.dao;

import java.sql.*;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.connection.MySQL_Connection;

@SuppressWarnings("all")
public class ATM_MachineDAO_Impl implements ATM_MachineDB_DAO
{
	private MySQL_Connection mysqlConnection  = null;
	private Connection dbConnection = null;
	private PreparedStatement prepStmt = null;
	
	public static final String SEARCH_ATM_MACHINE = "select * from atm_machine where atm_id = ?";
	private ResultSet rs;
	
	public ATM_MachineDAO_Impl()
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

	@Override
	public boolean insertNewATM_Machine(ATM_Machine atmMachine)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteATM_Machine(int atmID)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateATM_MachineDetails(ATM_Machine atmMachine)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ATM_Machine searchForATM_Machine(String atmID)
	{
		rs = null;
		try
		{
			prepStmt = dbConnection.prepareStatement(SEARCH_ATM_MACHINE);
			prepStmt.setString(1, "a35/2013");
			
			rs = prepStmt.executeQuery();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean activateATM(int atmID)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
