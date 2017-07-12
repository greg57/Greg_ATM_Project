package vzap.greg.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankCardMySQL_DAO_ImplTest
{
	private BankCardMySQL_DAO_Impl bankCardDAO;
	
	@Before
	public void setupTesty() throws Exception
	{
		bankCardDAO = new BankCardMySQL_DAO_Impl();
	}
	@Test
	public void test()
	{
		//assertTrue(bankCardDAO.getDbConnection() != null);
		//assertTrue(bankCardDAO.closeConnection() == true);
	}

}
