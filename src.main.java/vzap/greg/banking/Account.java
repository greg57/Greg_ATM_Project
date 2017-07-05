package vzap.greg.banking;

import java.io.Serializable;
import java.util.*;

public abstract class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private BankClient bankClient;
	private String accountNumber = null;
	private Date dateCreated = null;
	private Money bankCharges = null;
	private Money balance = null;
	
	
	
	public Account(BankClient bankClient, Date dateCreated, Money bankCharges, Money balance)
	{
		super();
		this.bankClient = bankClient;
		this.dateCreated = dateCreated;
		this.bankCharges = bankCharges;
		this.balance = balance;
	}
	public Account(BankClient bankClient, Money balance)
	{
		this(bankClient, null, null, balance);
	}
	
	public void setBalance(Money balance)
	{
		this.balance = balance;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public Money getBankCharges()
	{
		return bankCharges;
	}

	public Money getBalance()
	{
		return balance;
	}
	
	public BankClient getBankClient()
	{
		return this.bankClient;
	}
	
	
	public abstract Money withDraw(Money withDraw);
	public abstract Money deposit(Money deposit);
}
