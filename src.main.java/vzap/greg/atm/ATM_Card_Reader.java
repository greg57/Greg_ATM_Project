package vzap.greg.atm;

import java.io.Serializable;

import vzap.greg.banking.BankCard;
import vzap.greg.exception.BankCardException;

@SuppressWarnings("all")
public class ATM_Card_Reader implements Serializable
{
	private BankCard bankCard = null;
	private int pinNumberInt;
	
	public ATM_Card_Reader()
	{
		bankCard = null;
	}
	
	public BankCard readCard(String bankCardNumber, String pinNumber) throws BankCardException
	{
		if(pinNumber.length() != 4 )
		{
			throw new BankCardException("pin number must be 4 characters long.");
		}
		
		for(int pos = 0; pos < pinNumber.length(); pos++)
		{
			if(Character.isLetter(pinNumber.charAt(pos)))
			{
				throw new BankCardException("Pin Number cannot contain alpha characters");
			}
		}
		pinNumberInt = Integer.parseInt(pinNumber);
		
		if(bankCardNumber.length() != 4)
		{
			throw new BankCardException("Bank Card must contain 4 numeric characters");
		}
		for(int pos = 0; pos < 4; pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new BankCardException("characters");
			}
		}
		
		return bankCard = new BankCard(bankCardNumber, pinNumberInt);
	}
	public boolean ejectCard()
	{
		bankCard = null;
		return true;
	}

	public BankCard getBankCard()
	{
		return bankCard;
	}
}
