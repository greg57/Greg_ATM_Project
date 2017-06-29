package vzap.greg.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("all")
public class MySQL_Connection
{
	private String dbIpAddress = null;
	private String dbName = null;
	private String userName = null;
	private String password = null;
	
	private Connection connection = null;
	
	public MySQL_Connection(String dbIpAddress, String dbName, String userName,
			String password) throws ClassNotFoundException, SQLException
	{
		super();
		this.dbIpAddress = dbIpAddress;
		this.dbName = dbName;
		this.userName = userName;
		this.password = password;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://" + dbIpAddress +
				":3306/" + dbName, userName, password);
	}
	
	public MySQL_Connection(String dbName, String userName, String password) throws ClassNotFoundException, SQLException
	{
		this("localhost", dbName, userName, password);
	}
	
	public Connection getConnection()
	{
		return connection;
	}
	public void closeConnection() throws SQLException
	{
		connection.close();
	}
}
