package vzap.greg.enums;

public enum AccountType
{
	CURRENT_ACCOUNT("ca"),
	SAVINGS_ACCOUNT("sa"),
	CREDIT_CARD("cc");
	
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
