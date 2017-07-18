package vzap.greg.enums;

public enum AccountType
{
	CURRENT_ACCOUNT("Current Account"),
	SAVINGS_ACCOUNT("Savings Account"),
	CREDIT_CARD("Credit Card");
	
	String accountType;
	private AccountType(String accountType)
	{
		this.accountType = accountType;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
}
