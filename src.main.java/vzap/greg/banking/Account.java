package vzap.greg.banking;

import java.io.Serializable;
import java.util.*;

public abstract class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	//private BankCard bankCard;
	private String accountNumber = null;
	private Date dateCreated = null;
	private Money bankCharges = null;
	private Money balance = null;
	private String accountType = null;
	private String isFrozen = null;
	private String isActive = null;
	
	
	

	
	
	public abstract Money withDraw(Money withDraw);
	public abstract Money deposit(Money deposit);
}
