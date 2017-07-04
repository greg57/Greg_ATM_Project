package vzap.greg.banking;

public class BankClient
{
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
	
	public String getIdNumber()
	{
		return this.clientID;
	}
	public void setIdNumber(String idNumber)
	{
		this.clientID = idNumber;
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
	public BankCard getBankCard()
	{
		return this.bankCard;
	}
	public void setBankCard(BankCard bankCard)
	{
		this.bankCard = bankCard;
	}
	@Override
	public String toString()
	{
		return "BankClient [name=" + this.name + ", surname=" + this.surname + ", bankCard=" + this.bankCard
				+ ", idNumber=" + this.clientID + "]";
	}
}
