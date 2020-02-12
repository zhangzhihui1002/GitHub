package SRP;
import java.sql.*;
public class DBUtil {
	private Connection connection=null;
	private String urlDb;
	private String user;
	private String password;
	public DBUtil(){
		
	
	}
	Connection getConnection(){
		urlDb="jdbc://localhost:3305/java";
		user="root";
		password="root";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try
		{
			connection=DriverManager.getConnection(urlDb,user,password);
		}catch(SQLException){
			e.printStackTrace();
		}
		return connection;
	}
}

