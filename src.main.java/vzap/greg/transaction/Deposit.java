package vzap.greg.transaction;

import java.io.Serializable;
import java.util.Date;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.banking.BankClient;
import vzap.greg.banking.Money;
import vzap.greg.enums.TransactionType;

public class Deposit extends Transaction implements Serializable
{
	private Money bankCharge = null;

	public Deposit(ATM_Machine atm, BankClient bankClient, Date dateAndTime, TransactionType transactionType,
			Money transactionAmount, Money bankCharge)
	{
		super(atm, bankClient, dateAndTime, transactionType, transactionAmount);
		this.bankCharge = bankCharge;
	}

	@Override
	public boolean validateTransAction(Money bankCharge)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
