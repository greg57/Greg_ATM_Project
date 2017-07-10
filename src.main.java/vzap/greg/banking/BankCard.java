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
	private int clientid;
	private boolean isAdmin;
	private boolean isActive;
	private Vector<Account> accounts = null;
	public BankCard(String cardNumber, String pinNumber, int clientid, boolean isAdmin, boolean isActive)
	{
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.clientid = clientid;
		this.isAdmin = isAdmin;
		this.isActive = isActive;
	}
	
	public Vector<Account> getAccounts()
	{
		return this.accounts;
	}

	public void setAccounts(Vector<Account> accounts)
	{
		this.accounts = accounts;
	}

	public BankCard(String cardNumber, String pinNumber)
	{
		this(cardNumber, pinNumber, 0, false, true);
	}

	public BankCard(String cardNumber, String pinNumber, int clientid)
	{
		this(cardNumber, pinNumber, clientid, false, true);
	}

	public String getCardNumber()
	{
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public String getPinNumber()
	{
		return this.pinNumber;
	}

	public void setPinNumber(String pinNumber)
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
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.cardNumber == null) ? 0 : this.cardNumber.hashCode());
		result = prime * result + this.clientid;
		result = prime * result + ((this.pinNumber == null) ? 0 : this.pinNumber.hashCode());
		return result;
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
		if (this.pinNumber == null)
		{
			if (other.pinNumber != null)
				return false;
		}
		else if (!this.pinNumber.equals(other.pinNumber))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "BankCard [cardNumber=" + this.cardNumber + ", pinNumber=" + this.pinNumber + ", clientid="
				+ this.clientid + ", isAdmin=" + this.isAdmin + ", isActive=" + this.isActive + "]";
	}
	
}
