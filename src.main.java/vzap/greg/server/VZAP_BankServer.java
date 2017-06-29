package vzap.greg.server;

import java.io.*;
import java.net.*;

import vzap.greg.banking.*;
import vzap.greg.dao.*;
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
		runServer = true;
		listeningPort = 10000;
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
			System.out.println("Server in Listening mode on port 10000...>>>");
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

		public VZAP_BankServerThread(Socket socketFromAccept)
		{
			this.socketFromAccept = socketFromAccept;
			try
			{
				bankCardDAO = new BankCardDAO_Impl();
				inputFromClient = new ObjectInputStream(
						socketFromAccept.getInputStream());
				outputToClient = new ObjectOutputStream(
						socketFromAccept.getOutputStream());
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
				System.out.println("got connection from client: "
						+ socketFromAccept.toString());
				messageFromClient = (String)inputFromClient.readObject();
				System.out.println("<<<<...Message From Client...>>>> : " + messageFromClient);
				BankCard card = (BankCard) inputFromClient.readObject();
				System.out.println("Bank Card details Card No: "
						+ card.getCardNumber() + " Pin code: "
						+ card.getPinNumber());
				boolean validBankCard = bankCardDAO.validateBankCard(card);
				String messageToClient = null;
				if (validBankCard == true)
				{
					messageToClient = new String("Card Accepted...>>>");
				}
				else
				{
					messageToClient = new String("Card REJECTED...>>>");
				}
				outputToClient.writeObject(messageToClient);
				outputToClient.flush();

				outputToClient.close();
				inputFromClient.close();
				socketFromAccept.close();

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
