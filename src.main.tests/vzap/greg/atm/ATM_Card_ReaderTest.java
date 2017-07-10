package vzap.greg.atm;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vzap.greg.exception.BankCardException;

@SuppressWarnings("all")
public class ATM_Card_ReaderTest
{

	@Test(expected=BankCardException.class)
	public void testReadCard_Pin1() throws BankCardException
	{
		ATM_Card_Reader cr = new ATM_Card_Reader();
		cr.readCard("1234", "123445");
	}
	@Test(expected=BankCardException.class)
	public void testReadCard_Pin2() throws BankCardException
	{
		ATM_Card_Reader cr = new ATM_Card_Reader();
		cr.readCard("1234", "1AB3");
	}
	@Test(expected=BankCardException.class)
	public void testReadCard_BankCard1() throws BankCardException
	{
		ATM_Card_Reader cr = new ATM_Card_Reader();
		cr.readCard("1234567", "1234");
	}
	@Test(expected=BankCardException.class)
	public void testReadCard_BankCard2() throws BankCardException
	{
		ATM_Card_Reader cr = new ATM_Card_Reader();
		cr.readCard("1AD4", "1234");
	}
	
	@Test
	public void testEjectCard( ) throws Exception
	{
		ATM_Card_Reader cr = new ATM_Card_Reader();
		cr.readCard("1234", "1234");
		cr.ejectCard();
		assertNull(cr.getBankCard() == null);
	}

}
