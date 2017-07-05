package vzap.greg.banking;

import java.io.Serializable;
import java.util.Date;

public class CurrentAccount extends Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	

	public CurrentAccount(BankClient bankClient, Date dateCreated, Money bankCharges, Money balance)
	{
		super(bankClient, dateCreated, bankCharges, balance);
		// TODO Auto-generated constructor stub
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
