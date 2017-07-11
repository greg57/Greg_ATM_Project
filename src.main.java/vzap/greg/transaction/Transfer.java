package vzap.greg.transaction;

import java.io.Serializable;
import java.util.Date;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.banking.BankClient;
import vzap.greg.banking.Money;
import vzap.greg.enums.TransactionType;

public class Transfer extends Transaction implements Serializable
{

	public Transfer(ATM_Machine atm, BankClient bankClient, Date dateAndTime, TransactionType transactionType,
			Money transactionAmount)
	{
		super(atm, bankClient, dateAndTime, transactionType, transactionAmount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateTransAction(Money bankCharge)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
