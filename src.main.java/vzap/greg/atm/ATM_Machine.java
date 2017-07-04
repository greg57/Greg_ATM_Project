package vzap.greg.atm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.io.*;
//import java.net.Socket;

import vzap.greg.session.ATM_Session;


@SuppressWarnings("all")
public class ATM_Machine
{
	
	private ATM_Card_Reader cardReader = null;
	private ATM_Cash_Dispencer cashDispencer = null;
	private ATM_Envelope_Accepter envelopeAcceptor = null;
	private ATM_Session atmSession = null;
	private Properties atmProperties = null;
	private FileInputStream atmPropertiesInput = null;
	
	private String atmID = null;
	private String atmLocation = null;
	private String atmSerialNumber = null;
	private String serverIP_Address = null;
	private int serverPortNumber;
	
	private Date dateInService = null;
	private String active = null;
	
	//private ATM_UserInterfaceJFrame atmFrame = null;
	
	
	public ATM_Machine()
	{
		atmProperties = new Properties();
		try
		{
			atmPropertiesInput = new FileInputStream("resources/atm.properties");
			atmProperties.load(atmPropertiesInput);
			atmID = atmProperties.getProperty("atmID");
			atmLocation = atmProperties.getProperty("atmLocation");
			atmSerialNumber = atmProperties.getProperty("atmSerialNumber");
			serverIP_Address = atmProperties.getProperty("serverIP_Address");
			serverPortNumber = Integer.parseInt(atmProperties.getProperty("serverPortNumber"));
			
			String dateInput = atmProperties.getProperty("dateInService");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateInService = dateFormat.parse(dateInput);
			active = atmProperties.getProperty("active");
			
			System.out.println("atm id = " + atmID);
			System.out.println("atm location = " + atmLocation);
			System.out.println("atm serial number = " + atmSerialNumber);
			System.out.println("serverIP_Address = " + serverIP_Address);
			System.out.println("server Port Number = " + serverPortNumber);
			System.out.println("Date in Service = " + dateInService.toString());
			System.out.println("active? " + active);
			
			atmPropertiesInput.close();
			
			atmSession = new ATM_Session(serverIP_Address, serverPortNumber);

			cardReader = new ATM_Card_Reader(this);
			System.out.println("Session with server started...>>>");
			
			//atmFrame = new ATM_UserInterfaceJFrame(this);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
	
	public ATM_Card_Reader getCardReader()
	{
		return cardReader;
	}

	public ATM_Cash_Dispencer getCashDispencer()
	{
		return cashDispencer;
	}

	public ATM_Envelope_Accepter getEnvelopeAcceptor()
	{
		return envelopeAcceptor;
	}

	public ATM_Session getAtmSession()
	{
		return atmSession;
	}

	public Properties getAtmProperties()
	{
		return atmProperties;
	}

	public FileInputStream getAtmPropertiesInput()
	{
		return atmPropertiesInput;
	}

	public String getAtmID()
	{
		return atmID;
	}

	public String getAtmLocation()
	{
		return atmLocation;
	}

	public String getAtmSerialNumber()
	{
		return atmSerialNumber;
	}

	public String getServerIP_Address()
	{
		return serverIP_Address;
	}

	public int getServerPortNumber()
	{
		return serverPortNumber;
	}
	
	public Date getDateInService()
	{
		return dateInService;
	}
	
	public String getActive()
	{
		return active;
	}
	
//	public ATM_UserInterfaceJFrame getAtmFrame()
//	{
//		return atmFrame;
//	}

	public static void main(String[] args)
	{
		ATM_Machine atmM = new ATM_Machine();
	}
}
