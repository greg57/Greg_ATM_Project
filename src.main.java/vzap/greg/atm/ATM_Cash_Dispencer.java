package vzap.greg.atm;

import java.io.Serializable;
import java.util.HashMap;
//import java.util.HashSet;

import vzap.greg.banking.Money;
import vzap.greg.enums.MoneyDenominations;
import vzap.greg.exception.ATM_Cash_DispenserException;

@SuppressWarnings("unused")
public class ATM_Cash_Dispencer implements Serializable
{
	private ATM_Machine atmMachine = null;
	private Money totalMoneyAvailable = null;
	private MoneyDenominations denomination;
	private HashMap<MoneyDenominations, Integer> notesInDispencer = null;

	public ATM_Cash_Dispencer(ATM_Machine atmMachine)
	{
		super();
		this.atmMachine = atmMachine;
		notesInDispencer = new HashMap<MoneyDenominations, Integer>();
	}
	
	public HashMap<MoneyDenominations, Integer> getAvailablesNotesInCashDispenser()
	{
		return notesInDispencer;
	}
	
	@SuppressWarnings("static-access")
	public boolean refillCashDispencer()
	{
		notesInDispencer.put(denomination.R200, 500);
		notesInDispencer.put(denomination.R100, 500);
		notesInDispencer.put(denomination.R50, 500);
		notesInDispencer.put(denomination.R20, 500);
		notesInDispencer.put(denomination.R10, 500);
		return true;
	}
	
	@SuppressWarnings("static-access")
	public HashMap<MoneyDenominations, Integer> dispenceMoney(Money money) throws IllegalArgumentException, ATM_Cash_DispenserException
	{
		int notes = money.getNotes();
		if((money.getCents() > 0)|| (notes % 10 > 0) || (notes <= 0))
		{
			throw new IllegalArgumentException("The ATM only works in 200, 100, 50 20 and 10 notes..");
		}
		int numberOf200Notes;
		int numberOf100Notes;
		int numberOf50Notes;
		int numberOf20Notes;
		int numberOf10Notes;
		
		numberOf200Notes = notes / 200;
		System.out.println("numberOf200Notes = " + numberOf200Notes);
		if((notesInDispencer.get(denomination.R200) < 1) || (numberOf200Notes > notesInDispencer.get(denomination.R200)))
		{
			throw new ATM_Cash_DispenserException("Not enough money to transact with");
		}
		notes = notes - (numberOf200Notes * 200);
		notesInDispencer.put(denomination.R200,  notesInDispencer.get(denomination.R200) - numberOf200Notes);
		System.out.println("notes after minusing R200 = " + notes);
		
		numberOf100Notes = notes /100;
		notes = notes - (numberOf100Notes * 100);
		if(notesInDispencer.get(denomination.R100) < 1)
		{
			throw new ATM_Cash_DispenserException("Not enough money to transact with");
		}
		System.out.println("notes after minusing R100 = " + notes);
		notesInDispencer.put(denomination.R100, notesInDispencer.get(denomination.R100) - numberOf100Notes);
		
		numberOf100Notes = notes / 50;
		notes = notes - (numberOf100Notes * 50);
		System.out.println("notes after minusing R50 = " + notes);
		if(notesInDispencer.get(denomination.R50) < 1)
		{
			throw new ATM_Cash_DispenserException("Not enough money to transact with");
		}
		notesInDispencer.put(denomination.R50, notesInDispencer.get(denomination.R50) - numberOf100Notes);
		
		numberOf100Notes = notes / 20;
		notes = notes - (numberOf100Notes * 20);
		System.out.println("notes after minusing R20 = " + notes);
		if(notesInDispencer.get(denomination.R20) < 2)
		{
			throw new ATM_Cash_DispenserException("Not enough money to transact with");
		}
		notesInDispencer.put(denomination.R20, notesInDispencer.get(denomination.R20) - numberOf100Notes);
		
		if(notesInDispencer.get(denomination.R10) < 1)
		{
			throw new ATM_Cash_DispenserException("Not enough money to transact with");
		}
		notesInDispencer.put(denomination.R10, notesInDispencer.get(denomination.R10) - 1);
		return notesInDispencer;
	}
	
}