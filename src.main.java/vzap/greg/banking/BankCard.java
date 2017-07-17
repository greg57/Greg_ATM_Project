package vzap.greg.banking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

import vzap.greg.exception.BankCardException;

public class BankCard implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String cardNumber = null;
	private int pinNumber;
	private int clientid;
	private boolean isAdmin;
	private boolean isActive;
	private Vector<Account> accounts = null;
	public BankCard(String cardNumber, int pinNumber, int clientid, boolean isAdmin, boolean isActive)
	{
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.clientid = clientid;
		this.isAdmin = isAdmin;
		this.isActive = isActive;
	}
	public BankCard(String cardNumber, int pinNumber)
	{
		this(cardNumber, pinNumber, 0, false, false);
	}
	
	public BankCard(String cardNumber, int pinNumber, int clientid)
	{
		this(cardNumber, pinNumber, clientid, false, true);
	}
	
	public Vector<Account> getAccounts()
	{
		return this.accounts;
	}

	public void setAccounts(Vector<Account> accounts)
	{
		this.accounts = accounts;
	}

	public String getCardNumber()
	{
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public int getPinNumber()
	{
		return this.pinNumber;
	}

	public void setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
	}

	public int getClientid()
	{
		return this.clientid;
	}

	public void setClientid(int clientid)
	{
		this.clientid = clientid;
	}

	public boolean isAdmin()
	{
		return this.isAdmin;
	}

	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}

	public boolean isActive()
	{
		return this.isActive;
	}

	public void setActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankCard other = (BankCard) obj;
		if (this.cardNumber == null)
		{
			if (other.cardNumber != null)
				return false;
		}
		else if (!this.cardNumber.equals(other.cardNumber))
			return false;
		if (this.clientid != other.clientid)
			return false;
		if (this.pinNumber == 0)
		{
			if (other.pinNumber != 0)
				return false;
		}
		else if (!(this.pinNumber == other.pinNumber))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return " BankCard [cardNumber=" + this.cardNumber + ", pinNumber=" + this.pinNumber + ", clientid="
				+ this.clientid + ", isAdmin=" + this.isAdmin + ", isActive=" + this.isActive + "] ";
	}
	
}
