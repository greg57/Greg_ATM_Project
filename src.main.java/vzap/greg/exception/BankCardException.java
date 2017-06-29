package vzap.greg.exception;


@SuppressWarnings("all")
public class BankCardException extends Exception
{
	private String message = null;

	public BankCardException(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}

	@Override
	public String toString()
	{
		return "BankCardException [message=" + message + "]";
	}
	
}
