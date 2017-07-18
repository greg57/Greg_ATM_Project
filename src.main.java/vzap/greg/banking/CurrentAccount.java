package vzap.greg.banking;

import java.io.Serializable;
import java.util.Date;

import vzap.greg.enums.AccountType;
import vzap.greg.exception.MoneyException;

public class CurrentAccount extends Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public CurrentAccount(int accountNumber, AccountType accountType, String dateCreated, Money balance, String isFrozen,
			String isActive)
	{
		super(accountNumber, accountType, dateCreated, balance, isFrozen, isActive);
		// TODO Auto-generated constructor stub
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
		if(result.getRands() < 100)
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
				"\nCurrentAccount";
	}
	
	public static void main(String[] args)
	{
		CurrentAccount ca;
		ca = new CurrentAccount(1, AccountType.CURRENT_ACCOUNT, "2017-10-23", new Money(3200,99), "n", "y");
		System.out.println("\n--------------Original Account Values-------------------------");
		System.out.println(ca.toString());
		try
		{
			ca.deposit(new Money(1000, 0));
			System.out.println("\n--------------After Deposit-------------------------");
			System.out.println(ca.toString());
		}
		catch (MoneyException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			ca.withDraw(new Money(800, 44));
			System.out.println("\n--------------After Withdrawel-------------------------");
			System.out.println(ca.toString());
		}
		catch (MoneyException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
