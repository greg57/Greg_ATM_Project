package vzap.greg.transaction;

import java.util.Date;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.banking.BankClient;
import vzap.greg.banking.Money;
import vzap.greg.enums.TransactionType;

public abstract class Transaction
{
	private ATM_Machine atm = null;
	private BankClient bankClient = null;
	private Date dateAndTime = null;
	private TransactionType transactionType;
	private Money transactionAmount = null;
	
	
	
	public Transaction(ATM_Machine atm, BankClient bankClient, Date dateAndTime, TransactionType transactionType,
			Money transactionAmount)
	{
		super();
		this.atm = atm;
		this.bankClient = bankClient;
		this.dateAndTime = dateAndTime;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
	public ATM_Machine getAtm()
	{
		return this.atm;
	}
	public void setAtm(ATM_Machine atm)
	{
		this.atm = atm;
	}
	public BankClient getBankClient()
	{
		return this.bankClient;
	}
	public void setBankClient(BankClient bankClient)
	{
		this.bankClient = bankClient;
	}
	public Date getDateAndTime()
	{
		return this.dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime)
	{
		this.dateAndTime = dateAndTime;
	}
	public TransactionType getTransactionType()
	{
		return this.transactionType;
	}
	public void setTransactionType(TransactionType transactionType)
	{
		this.transactionType = transactionType;
	}
	public Money getTransactionAmount()
	{
		return this.transactionAmount;
	}
	public void setTransactionAmount(Money transactionAmount)
	{
		this.transactionAmount = transactionAmount;
	}
	
	public abstract boolean validateTransAction(Money bankCharge);
}
