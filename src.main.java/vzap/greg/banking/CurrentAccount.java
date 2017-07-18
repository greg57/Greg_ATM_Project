package vzap.greg.banking;

import java.io.Serializable;
import java.util.Date;

import vzap.greg.enums.AccountType;

public class CurrentAccount extends Account implements Serializable
{
	public CurrentAccount(int accountNumber, AccountType accountType, String dateCreated, Money balance, String isFrozen,
			String isActive)
	{
		super(accountNumber, accountType, dateCreated, balance, isFrozen, isActive);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	


	@Override
	public boolean withDraw(Money withDraw)
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deposit(Money deposit)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
