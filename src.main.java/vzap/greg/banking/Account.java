package vzap.greg.banking;

import java.io.Serializable;
import java.util.*;

public abstract class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private BankCard bankCard;
	private String accountNumber = null;
	private Date dateCreated = null;
	private Money bankCharges = null;
	private Money balance = null;
	
	
	
	public Account(BankCard bankCard, Date dateCreated, Money bankCharges, Money balance)
	{
		super();
		this.bankCard = bankCard;
		this.dateCreated = dateCreated;
		this.bankCharges = bankCharges;
		this.balance = balance;
	}
	public Account(BankCard bankCard, Money balance)
	{
		this(bankCard, null, null, balance);
	}
	
	public BankCard getBankCard()
	{
		return this.bankCard;
	}
	public void setBankCard(BankCard bankCard)
	{
		this.bankCard = bankCard;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}
	public void setBankCharges(Money bankCharges)
	{
		this.bankCharges = bankCharges;
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
	
	
	public abstract Money withDraw(Money withDraw);
	public abstract Money deposit(Money deposit);
}
