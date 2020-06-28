package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception 
	{
		//1.Initialize Oracle JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2.connect to Oracle DB Server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java71","password");
		System.out.println("<<<Connected to DB Server");
		
		//3.Create an object for passing queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno number(5), ename varchar(30), sal number(10,2), primary key(empno))";
		
		try {
			//4.pass SQL query to connected DB
			st.execute(sql);
			System.out.println("DB Table created");
		}
		catch(Exception ex) {
			System.out.println("ERROR: DB Table could not be created : "+ ex.getMessage());
		}
		
		//5.close connection with DB Server
		st.close();		
		con.close();
	}
}
