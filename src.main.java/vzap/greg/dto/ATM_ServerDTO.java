package vzap.greg.dto;

import java.io.Serializable;
import java.util.Properties;
import java.util.Vector;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.banking.BankClient;
import vzap.greg.banking.Account;

public class ATM_ServerDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	private BankClient bankClient = null;
	private Vector<Account> accounts = null;
	private String messageToServer = null;
	private String messageFromServer = null;
	private Properties atmProperties = null;
	
	public ATM_ServerDTO(BankClient bankClient, String messageToServer, String messageFromServer, Properties atmProperties, Vector<Account> accounts)
	{
		super();
		this.bankClient = bankClient;
		this.messageToServer = messageToServer;
		this.messageFromServer = messageFromServer;
		this.atmProperties = atmProperties;
		this.accounts = accounts;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public Vector<Account> getAccounts()
	{
		return this.accounts;
	}

	public BankClient getBankClient()
	{
		return this.bankClient;
	}

	public String getMessageToServer()
	{
		return this.messageToServer;
	}

	public String getMessageFromServer()
	{
		return this.messageFromServer;
	}

	public Properties getAtmProperties()
	{
		return atmProperties;
	}

	@Override
	public String toString()
	{
		return "ATM_ServerDTO [bankClient=" + this.bankClient + ", accounts=" + this.accounts + 
				", messageToServer=" + this.messageToServer + 
				", messageFromServer=" + this.messageFromServer + 
				", atmProperties=" 	+ this.atmProperties + "]";
	}

	
}
