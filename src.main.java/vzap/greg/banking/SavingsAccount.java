package vzap.greg.banking;

import java.io.Serializable;
import java.util.Date;

public class SavingsAccount extends Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	private double interestRateOnSavings = 6.6;
	
	public SavingsAccount(Date dateCreated, Money bankCharges, Money balance)
	{
		super(dateCreated, bankCharges, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double getInterestRateOnSavings()
	{
		return this.interestRateOnSavings;
	}

	public void setInterestRateOnSavings(double interestRateOnSavings)
	{
		this.interestRateOnSavings = interestRateOnSavings;
	}

	@Override
	public Money withDraw(Money withDraw)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Money deposit(Money deposit)
	{
		// TODO Auto-generated method stub
		return null;
	}
	public 

}
