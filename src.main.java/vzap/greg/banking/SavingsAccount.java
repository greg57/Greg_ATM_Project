package vzap.greg.banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Properties;

import vzap.greg.enums.AccountType;
import vzap.greg.exception.MoneyException;

public class SavingsAccount extends Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Money minimumBalance = null;
	private double interestRateOnSavings = 0.0;
	
	public SavingsAccount(int accountNumber, AccountType accountType, String dateCreated, Money balance, String isFrozen,
			String isActive)
	{
		super(accountNumber, accountType, dateCreated, balance, isFrozen, isActive);
		Properties accountRates = new Properties();
		try
		{
			FileInputStream input = new FileInputStream("./resources/bankAccountRates.properties");
			accountRates.load(input);
			String minimumBalanceFromFile = accountRates.getProperty("minimumBalanceOnSavings");
			double minBalance = Double.parseDouble(minimumBalanceFromFile);
			int rands = (int)minBalance;
			int cents = (int)((minBalance - rands) * 100);
			minimumBalance = new Money(rands, cents);
			String interestRateFromFile = accountRates.getProperty("interestRateSavings");
			interestRateOnSavings = Double.parseDouble(interestRateFromFile);
			input.close();
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

	
	public double getInterestRateOnSavings()
	{
		return this.interestRateOnSavings;
	}

	public void setInterestRateOnSavings(double interestRateOnSavings)
	{
		this.interestRateOnSavings = interestRateOnSavings;
	}

	@Override
	public boolean withDraw(Money withDraw) throws MoneyException
	{
		if((this.getIsActive().equals("n")) || (this.getIsFrozen().equals("y")))
		{
			throw new MoneyException("Account is disabled..>>>");
		}
		Money balance = this.getBalance();
		Money result = Money.subtractMoney(balance, withDraw);
		result = Money.subtractMoney(result, this.getBankCharges());
		if(result.getRands() < 1000)
		{
			throw new MoneyException("Insufficient Funds");
		}
		this.setBalance(result);
		return true;
	}

	@Override
	public boolean deposit(Money deposit) throws MoneyException
	{
		if((this.getIsActive().equals("n")) || (this.getIsFrozen().equals("y")))
		{
			throw new MoneyException("Account is disabled..>>>");
		}
		Money actual = Money.addMoney(this.getBalance(), deposit);
		actual = Money.subtractMoney(actual, this.getBankCharges());
		this.setBalance(actual);
		
		return true;
	}
	
	
	
	@Override
	public String toString()
	{
		return super.toString() +
				"\nSavingsAccount" +
				"\nminimumBalance=" + this.minimumBalance + 
				"\ninterestRateOnSavings="	+ this.interestRateOnSavings;
	}


	public static void main(String[] args) 
	{
		SavingsAccount sa;
		sa = new SavingsAccount(1, AccountType.SAVINGS_ACCOUNT, "2017-10-23", new Money(3200,99), "n", "y");
		System.out.println("\n--------------Original Account Values-------------------------");
		System.out.println(sa.toString());
		try
		{
			sa.deposit(new Money(1000, 0));
			System.out.println("\n--------------After Deposit-------------------------");
			System.out.println(sa.toString());
		}
		catch (MoneyException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			sa.withDraw(new Money(8000, 44));
			System.out.println("\n--------------After Withdrawel-------------------------");
			System.out.println(sa.toString());
		}
		catch (MoneyException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
