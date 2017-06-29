package vzap.greg.dao;

import vzap.greg.atm.ATM_Machine;

public interface ATM_FileDAO
{
	public boolean saveATM_Information(ATM_Machine atmMachine);
	public ATM_Machine readATM_Information();
}
