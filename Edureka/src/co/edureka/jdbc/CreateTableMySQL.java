package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception
	{
		//1.Initialize Oracle JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");

		//2.connect to MySQL edureka DB
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		System.out.println("<<<Connected to edureka Database");
		
		//3.Create an object for passing queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		
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
