package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

	Connection connection;
	Statement statement;
	
	public Conn() {
		
		try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "Occult_2005");
		statement=connection.createStatement();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
