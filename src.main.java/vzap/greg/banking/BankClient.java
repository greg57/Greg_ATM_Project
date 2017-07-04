package vzap.greg.banking;

import java.io.Serializable;

public class BankClient implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String name = null;
	private String surname = null;
	private int clientID;
	private String email = null;
	private String cellNumber = null;
	private String isActive = null;
	
	public BankClient(int idNumber, String name, String surname, String email, String cellNumber, String isActive)
	{
		super();
		this.name = name;
		this.surname = surname;
		this.clientID = idNumber;
		this.cellNumber = cellNumber;
		this.isActive = isActive;
		this.email = email;
	}
	public BankClient(int idNumber, String name, String surname )
	{
		this(idNumber, name, surname, null, null, "y");
	}
	
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public int getClientID()
	{
		return this.clientID;
	}
	public void setClientID(int clientID)
	{
		this.clientID = clientID;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getCellNumber()
	{
		return this.cellNumber;
	}
	public void setCellNumber(String cellNumber)
	{
		this.cellNumber = cellNumber;
	}
	public String getIsActive()
	{
		return this.isActive;
	}
	public void setIsActive(String isActive)
	{
		this.isActive = isActive;
	}
	@Override
	public String toString()
	{
		return "BankClient [name=" + this.name + ", surname=" + this.surname + ", clientID=" + this.clientID
				+ ", email=" + this.email + ", cellNumber=" + this.cellNumber + ", isActive=" + this.isActive + "]";
	}
	
}
