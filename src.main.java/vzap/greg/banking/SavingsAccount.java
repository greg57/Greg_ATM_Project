package vzap.greg.banking;

import java.io.Serializable;
import java.util.Date;

public class SavingsAccount extends Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	private double minimumBalance = 0.0;
	private double interestRateOnSavings = 0.0;
	
	
	
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

}
