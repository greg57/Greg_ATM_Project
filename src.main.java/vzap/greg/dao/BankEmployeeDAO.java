package vzap.greg.dao;

import java.util.List;

//import vzap.greg.banking.BankClient;
import vzap.greg.banking.BankEmployee;

public interface BankEmployeeDAO
{
	public List<BankEmployee> listBankClients();
	public BankEmployee searchForBankClient(String surname, String idNumber);
	public boolean updateBankClient(BankEmployee bankEmployee);
	public boolean deleteBankClient(BankEmployee bankEmployee);
	public boolean insertNewBankClient(BankEmployee bankEmployee);
}
