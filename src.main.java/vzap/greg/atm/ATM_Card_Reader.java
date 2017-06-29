package vzap.greg.atm;

import vzap.greg.banking.BankCard;
import vzap.greg.exception.BankCardException;

@SuppressWarnings("all")
public class ATM_Card_Reader
{
	private BankCard bankCard = null;
	private ATM_Machine atmMachine = null;
	
	public ATM_Card_Reader(ATM_Machine atmMachine)
	{
		this.atmMachine = atmMachine;
		bankCard = null;
	}
	
	public BankCard readCard(String bankCardNumber, String pinNumber) throws IllegalArgumentException, BankCardException
	{
		
		if((bankCardNumber.charAt(0) != '4') && (bankCardNumber.charAt(0) != '3'))
		{
			throw new BankCardException("Bank Card number is illegal");
		}
		if(pinNumber.length() != 4 )
		{
			throw new IllegalArgumentException("pin number must be 4 characters long.");
		}
		for(int pos = 0; pos < pinNumber.length(); pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new IllegalArgumentException("Pin Number cannot contain alpha characters");
			}
		}
		
		if(bankCardNumber.length() < 19 || bankCardNumber.length() > 19)
		{
			throw new BankCardException("Bank Card must contain 18 alpha numeric characters");
		}
		for(int pos = 0; pos < 4; pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new BankCardException("characters from position 1 through 4 must be characters");
			}
		}
		for(int pos = 5; pos < 9; pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new BankCardException("characters from position 5 through 8 must be characters");
			}
		}
		for(int pos = 10; pos < 14; pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new BankCardException("characters from position 10 through 13 must be characters");
			}
		}
		for(int pos = 15; pos < 19; pos++)
		{
			if(Character.isLetter(bankCardNumber.charAt(pos)))
			{
				throw new BankCardException("characters from position 15 through 18 must be characters");
			}
		}
		if(bankCardNumber.charAt(4) != '-' || bankCardNumber.charAt(9) != '-' || bankCardNumber.charAt(14) != '-')
		{
			throw new BankCardException("hyphens must be used in postions 4, 9 and 14");
		}
		
		return bankCard = new BankCard(bankCardNumber, pinNumber);
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
