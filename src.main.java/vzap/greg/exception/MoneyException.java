package vzap.greg.exception;

public class MoneyException extends Exception
{
	private String message = null;

	public MoneyException(String message)
	{
		super();
		this.message = message;
	}

	public String getMessage()
	{
		return this.message;
	}

	@Override
	public String toString()
	{
		return "MoneyException [message=" + this.message + "]";
	}
}
