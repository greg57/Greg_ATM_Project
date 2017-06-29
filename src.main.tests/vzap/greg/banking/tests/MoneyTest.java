package vzap.greg.banking.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vzap.greg.banking.*;

public class MoneyTest
{
	Money m1 = null, m2 = null, m3 = null;

	@Before
	public void setUp() throws Exception
	{
		m1 = new Money(100, 50);
		m2 = new Money(10, 25);
		m3 = new Money(110, 0);
	}

	@Test
	public void testGetNotes()
	{
		assertTrue(m1.getNotes() == 100);
	}

	@Test
	public void testGetCents()
	{
		assertTrue(m2.getCents() == 25);
	}

	@Test
	public void testAddMoney()
	{
		Money addedMoney = Money.addMoney(m1, m2);
		System.out.println("note = " + addedMoney.getNotes());
		assertEquals(110, addedMoney.getNotes(), 0);
		System.out.println("cents = " + addedMoney.getCents());
		assertEquals(75, addedMoney.getCents(), 0);
	}

	@Test
	public void testSubtractMoney1()
	{
		Money subtractedMoney = Money.subtractMoney(m1, m2);
		assertEquals(90, subtractedMoney.getNotes(), 0);

		assertEquals(25, subtractedMoney.getCents(), 0);
	}

	@Test(expected = NullPointerException.class)
	public void testSubtractMoney2()
	{

		Money subtractedMoney = Money.subtractMoney(m1, m3);
		System.out.println("subtractedMoney = " + subtractedMoney);
		subtractedMoney.equals(m3);

	}

	@Test
	public void testEqualsObject()
	{
		assertFalse(m1.equals(m2));
	}

}
