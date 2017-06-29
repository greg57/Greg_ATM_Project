package vzap.greg.session;

import java.net.*;

import vzap.greg.connection.*;

import java.io.*;


@SuppressWarnings("all")
public class ATM_Session
{
	private Socket socket = null;
	private String serverIP_Address = null;
	private int serverPortNumber;
	private ObjectInputStream socketInput = null;
	private ObjectOutputStream socketOutput = null;
	
	public ATM_Session(String serverIP_Address, int portNumber) throws UnknownHostException, IOException
	{
		socket = new Socket(serverIP_Address, portNumber);
		//socketInput = new ObjectInputStream(socket.getInputStream());
		//socketOutput = new ObjectOutputStream(socket.getOutputStream());
	}
	
	public void setSocketInput(ObjectInputStream socketInput)
	{
		this.socketInput = socketInput;
	}

	public void setSocketOutput(ObjectOutputStream socketOutput)
	{
		this.socketOutput = socketOutput;
	}

	public Socket getSocket()
	{
		return socket;
	}

	public String getServerIP_Address()
	{
		return serverIP_Address;
	}

	public int getServerPortNumber()
	{
		return serverPortNumber;
	}
	
	public ObjectInputStream getSocketInput()
	{
		return socketInput;
	}

	public ObjectOutputStream getSocketOutput()
	{
		return socketOutput;
	}

	public void closeSocket() throws IOException
	{
		if(socketInput != null)
		{
			socketInput.close();
		}
		if(socketOutput != null)
		{
			socketOutput.close();
		}
		if(socket != null)
		{
			socket.close();
		}
	}
	
}
