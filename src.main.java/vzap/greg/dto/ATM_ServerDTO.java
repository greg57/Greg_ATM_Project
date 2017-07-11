package vzap.greg.dto;

import java.io.Serializable;

import vzap.greg.atm.ATM_Machine;
import vzap.greg.banking.BankClient;

public class ATM_ServerDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	private BankClient bankClient = null;
	private String messageToServer = null;
	private String messageFromServer = null;
	private ATM_Machine atmMachine = null;
	
	public ATM_ServerDTO(BankClient bankClient, String messageToServer, String messageFromServer,
			ATM_Machine atmMachine)
	{
		super();
		this.bankClient = bankClient;
		this.messageToServer = messageToServer;
		this.messageFromServer = messageFromServer;
		this.atmMachine = atmMachine;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
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

	public ATM_Machine getAtmMachine()
	{
		return this.atmMachine;
	}

	@Override
	public String toString()
	{
		return "ATM_ServerDTO [bankClient=" + this.bankClient + ", messageToServer=" + this.messageToServer
				+ ", messageFromServer=" + this.messageFromServer + ", atmMachine=" + this.atmMachine + "]";
	}
	
	
	
}
