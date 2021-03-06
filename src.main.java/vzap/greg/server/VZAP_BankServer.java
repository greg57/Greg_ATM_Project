package vzap.greg.server;

import java.io.*;
import java.net.*;
import java.util.Properties;

import vzap.greg.banking.*;
import vzap.greg.dao.*;
import vzap.greg.dto.ATM_ServerDTO;
import vzap.greg.exception.*;

@SuppressWarnings("all")
public class VZAP_BankServer
{
	private ServerSocket serverSocket = null;
	private Socket socketFromAccept = null;
	private VZAP_BankServerThread bankServerThread = null;
	private int listeningPort;
	private boolean runServer;
	private String messageFromClient = null;

	public VZAP_BankServer()
	{
		Properties serverProperties = new Properties();
		InputStream input = ClassLoader.getSystemClassLoader().getResourceAsStream("resources/atmServer.properties");
		try
		{
			if (input == null)
			{
				FileInputStream in = new FileInputStream("resources/atmServer.properties");
				serverProperties.load(in);
				in.close();
				listeningPort = Integer.parseInt(serverProperties.getProperty("serverPortNumber"));
				System.out.println("Server's Listening port = " + listeningPort);
			}
			else
			{
				serverProperties.load(input);
				listeningPort = Integer.parseInt(serverProperties.getProperty("serverPortNumber"));
				input.close();
			}
		}
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		runServer = true;
		// listeningPort = 10000;
		try
		{
			serverSocket = new ServerSocket(listeningPort);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		while (runServer == true)
		{
			System.out.println("Server in Listening mode on port " + listeningPort + "...>>>");
			try
			{
				socketFromAccept = serverSocket.accept();
				bankServerThread = new VZAP_BankServerThread(socketFromAccept);
				bankServerThread.start();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class VZAP_BankServerThread extends Thread
	{
		private Socket socketFromAccept = null;
		private ObjectInputStream inputFromClient = null;
		private ObjectOutputStream outputToClient = null;
		private BankCardDAO bankCardDAO = null;
		private ATM_ServerDTO dto = null;
		private BankClientDAO_Impl clientDAO = null;
		private BankClient bankClient = null;

		public VZAP_BankServerThread(Socket socketFromAccept)
		{
			this.socketFromAccept = socketFromAccept;
			try
			{
				bankCardDAO = new BankCardMySQL_DAO_Impl();
				clientDAO = new BankClientDAO_Impl();
				outputToClient = new ObjectOutputStream(socketFromAccept.getOutputStream());
				inputFromClient = new ObjectInputStream(socketFromAccept.getInputStream());

			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run()
		{
			// Receive a card object from the client
			try
			{
				while (true)
				{
					System.out.println("got connection from client: " + socketFromAccept.toString());
					dto = (ATM_ServerDTO) inputFromClient.readObject();
					messageFromClient = dto.getMessageToServer();
					System.out.println("<<<<...Message From Client...>>>> : " + messageFromClient);
					if (messageFromClient.equals("end"))
					{
						break;
					}
					BankCard card = dto.getBankClient().getBankCard();
					System.out.println(
							"Bank Card details Card No: " + card.getCardNumber() + " Pin code: " + card.getPinNumber());
					Properties atmProperties = dto.getAtmProperties();
					System.out.println("ATM properties = " + atmProperties.toString());
					BankCard validBankCard = bankCardDAO.validateBankCard(card);
					String messageToClient = null;
					if (validBankCard != null)
					{
						messageToClient = new String("Card Accepted...>>>");
						System.out.println("Validated card...>>>>>>");
						bankClient = clientDAO.searchForBankClient(validBankCard);
						System.out.println("In server: \n" + bankClient.toString());
					}
					else
					{
						messageToClient = new String("Card REJECTED...>>>");
						System.out.println("Card rejected...>>>>>>");
						bankClient = null;
					}
					outputToClient.writeObject(messageToClient);
					outputToClient.flush();
					outputToClient.writeObject(bankClient);
					outputToClient.flush();
				}
				outputToClient.close();
				inputFromClient.close();
				socketFromAccept.close();
				System.out.println("Socket closed with ATM...>>>>>>");

			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args)
	{
		VZAP_BankServer vbs = new VZAP_BankServer();
	}

}
