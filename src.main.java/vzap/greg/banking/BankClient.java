package vzap.greg.banking;

public class BankClient
{
	private String name = null;
	private String surname = null;
	private BankCard bankCard = null;
	private String idNumber = null;
	
	public BankClient(String name, String surname, BankCard bankCard, String idNumber)
	{
		super();
		this.name = name;
		this.surname = surname;
		this.bankCard = bankCard;
		this.idNumber = toString();
	}
	public BankClient(String name, String surname, String idNumber)
	{
		this(name, surname, null, idNumber);
	}
	
	public String getIdNumber()
	{
		return this.idNumber;
	}
	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
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
				+ ", idNumber=" + this.idNumber + "]";
	}
}
