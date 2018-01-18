package com.dscfgos.utils.connection;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dscfgos.utils.strings.StringUtils;

public class ConnectionManager 
{
	public static String currentShema = "users_api";
	private static Connection connection;
	public static Connection getConnection()
	{
		try 
		{
			if(connection == null || !connection.isValid(0))
			{
				Class.forName("org.postgresql.Driver");
				
				try 
				{
					if(InetAddress.getLocalHost().getHostName().equals("dscfgos"))
					{
						connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/users", "dscfgos", "///ds791211///");
					}
					else
					{
						String host = System.getenv("OPENSHIFT_POSTGRESQL_DB_HOST");
						String port = System.getenv("OPENSHIFT_POSTGRESQL_DB_PORT");
						String user = System.getenv("OPENSHIFT_POSTGRESQL_DB_USERNAME");
						String pass = System.getenv("OPENSHIFT_POSTGRESQL_DB_PASSWORD");

						String strConn = "jdbc:postgresql://{0}:{1}/users?currentSchema=users_api&user={2}&password={3}";
						strConn = StringUtils.substitute(strConn, host,port,user,pass);
						System.out.println(strConn);
						connection = DriverManager.getConnection(strConn);
					}
				} 
				catch (UnknownHostException e) {
					e.printStackTrace();
				}
				
				
				
				connection.setSchema(currentShema);
				connection.setAutoCommit(false);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

		return connection;
	}
}
