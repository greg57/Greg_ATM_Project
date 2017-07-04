package vzap.greg.banking;

public class BankEmployee
{
	private String name = null;
	private String surname = null;
	private String bankEmployeeID = null;
	private int adminPinNumber;
	private boolean isAdministrator;
	public BankEmployee(String name, String surname, String bankEmployeeID, int adminPinNumber, boolean isAdministrator)
	{
		super();
		this.name = name;
		this.surname = surname;
		this.bankEmployeeID = bankEmployeeID;
		this.adminPinNumber = adminPinNumber;
		this.isAdministrator = isAdministrator;
	}
	public BankEmployee(String name, String surname, String bankEmployeeID, int adminPinNumber)
	{
		this(name, surname, bankEmployeeID, 0, false);
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
	public String getBankEmployeeID()
	{
		return this.bankEmployeeID;
	}
	public void setBankEmployeeID(String bankEmployeeID)
	{
		this.bankEmployeeID = bankEmployeeID;
	}
	public int getAdminPinNumber()
	{
		return this.adminPinNumber;
	}
	public void setAdminPinNumber(int adminPinNumber)
	{
		this.adminPinNumber = adminPinNumber;
	}
	public boolean isAdministrator()
	{
		return this.isAdministrator;
	}
	public void setAdministrator(boolean isAdministrator)
	{
		this.isAdministrator = isAdministrator;
	}
	@Override
	public String toString()
	{
		return "BankEmployee [name=" + this.name + ", surname=" + this.surname + ", bankEmployeeID="
				+ this.bankEmployeeID + ", adminPinNumber=" + this.adminPinNumber + ", isAdministrator="
				+ this.isAdministrator + "]";
	}
	
}
