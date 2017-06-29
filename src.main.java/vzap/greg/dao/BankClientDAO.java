package vzap.greg.dao;

import java.util.List;

import vzap.greg.banking.BankClient;

public interface BankClientDAO
{
	public List<BankClient> listBankClients();
	public BankClient searchForBankClient(String surname, String idNumber);
	public boolean updateBankClient(BankClient bankClient);
	public boolean deleteBankClient(BankClient bankClient);
	public boolean insertNewBankClient(BankClient bankClient);
}
