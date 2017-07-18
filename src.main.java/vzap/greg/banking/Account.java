package vzap.greg.banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import vzap.greg.enums.AccountType;
import vzap.greg.exception.MoneyException;

public abstract class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	//private BankCard bankCard;
	private int accountNumber = 0;
	private AccountType accountType;
	private String dateCreated = null;
	private Money bankCharges = null;
	private Money balance = null;
	private String isFrozen = null;
	private String isActive = null;
	
	
	public Account(int accountNumber, AccountType accountType, String dateCreated, Money balance, String isFrozen,
			String isActive)
	{
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.dateCreated = dateCreated;
		this.balance = balance;
		this.isFrozen = isFrozen;
		this.isActive = isActive;
		
		Properties accountRates = new Properties();
		try
		{
			FileInputStream input = new FileInputStream("./resources/bankAccountRates.properties");
			accountRates.load(input);
			String bankChargesFromFile = accountRates.getProperty("bankCharges");
			double charges = Double.parseDouble(bankChargesFromFile);
			int rands = (int)charges;
			int cents = (int)((charges - rands) * 100);
			bankCharges = new Money(rands, cents);
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
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType()
	{
		return this.accountType;
	}

	public void setAccountType(AccountType accountType)
	{
		this.accountType = accountType;
	}

	public String getDateCreated()
	{
		return this.dateCreated;
	}

	public void setDateCreated(String dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public Money getBalance()
	{
		return this.balance;
	}

	public void setBalance(Money balance)
	{
		this.balance = balance;
	}

	public String getIsFrozen()
	{
		return this.isFrozen;
	}

	public void setIsFrozen(String isFrozen)
	{
		this.isFrozen = isFrozen;
	}

	public String getIsActive()
	{
		return this.isActive;
	}

	public void setIsActive(String isActive)
	{
		this.isActive = isActive;
	}

	public Money getBankCharges()
	{
		return this.bankCharges;
	}
	
	@Override
	public String toString()
	{
		return "Account" +
				"\naccountNumber=" + this.accountNumber + 
				"\naccountType=" + this.accountType + 
				"\ndateCreated=" + this.dateCreated + 
				"\nbankCharges=" + this.bankCharges + 
				"\nbalance=" + this.balance + 
				"\nisFrozen=" + this.isFrozen + 
				"\nisActive=" + this.isActive;
	}

	public abstract boolean withDraw(Money withDraw) throws MoneyException;
	public abstract boolean deposit(Money deposit) throws MoneyException;
}
