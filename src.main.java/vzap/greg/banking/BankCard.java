package vzap.greg.banking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

import vzap.greg.exception.BankCardException;

public class BankCard implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String cardNumber = null;
	private String pinNumber = null;
	private Vector<Account> accounts = null;

	public BankCard(String cardNumber, String pinNumber) 
	{
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.accounts = null;
	}
	
	public BankCard(String cardNumber, String pinNumber, Vector<Account> accounts)throws BankCardException, IllegalArgumentException
	{
		this(cardNumber, pinNumber);
		this.accounts = accounts;
	}
	
	public Vector<Account> getAccounts()
	{
		return accounts;
	}
	
	public String getCardNumber()
	{
		return cardNumber;
	}

	public String getPinNumber()
	{
		return pinNumber;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result
				+ ((pinNumber == null) ? 0 : pinNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		BankCard other = (BankCard) obj;
		if (cardNumber == null)
		{
			if (other.cardNumber != null)
			{
				return false;
			}
		}
		else if (!cardNumber.equals(other.cardNumber))
		{
			return false;
		}
		if (pinNumber == null)
		{
			if (other.pinNumber != null)
			{
				return false;
			}
		}
		else if (!pinNumber.equals(other.pinNumber))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "BankCard [cardNumber=" + cardNumber + ", pinNumber="
				+ pinNumber + "]";
	}
}
