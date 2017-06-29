package vzap.greg.banking;

import java.io.Serializable;
import java.util.*;

public abstract class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String accountNumber = null;
	private BankCard accountCard = null;
	private Date dateCreated = null;
	private Money bankCharges = null;
	private Money balance = null;
	
	
	
	public Account(BankCard accountCard, Date dateCreated, Money bankCharges,
			Money balance)
	{
		super();
		this.accountCard = accountCard;
		this.dateCreated = dateCreated;
		this.bankCharges = bankCharges;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}

	public BankCard getAccountCard()
	{
		return accountCard;
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
