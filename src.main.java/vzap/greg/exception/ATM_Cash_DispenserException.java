package vzap.greg.exception;


@SuppressWarnings("all")
public class ATM_Cash_DispenserException extends Exception
{
	private String errorMessage = null;

	public ATM_Cash_DispenserException(String errorMessage)
	{
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	@Override
	public String toString()
	{
		return "ATM_Cash_DispenserException [errorMessage=" + errorMessage
				+ "]";
	}
}
