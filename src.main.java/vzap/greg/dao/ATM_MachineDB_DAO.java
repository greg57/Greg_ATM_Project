package vzap.greg.dao;

import vzap.greg.atm.ATM_Machine;

public interface ATM_MachineDB_DAO
{
	public boolean insertNewATM_Machine(ATM_Machine atmMachine);
	public boolean deleteATM_Machine(int atmID);
	public boolean updateATM_MachineDetails(ATM_Machine atmMachine);
	public ATM_Machine searchForATM_Machine(String atmID);
	public boolean activateATM(int atmID);
}
