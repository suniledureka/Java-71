package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployees {

	public static void main(String[] args) throws Exception {
		/*
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		*/
		Connection con = ConnectionFactory.getConnection();
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(106,'Pankaj',2500.5)";
		//String sql = "insert into emp(empno,ename,sal) values(102,'Anil',3500.5),(103,'Praveen',4500),(104,'Rahul',6500),(105,'Sachin',2450)";
		
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("Employees Affected = "+ rows_affected);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		st.close();
		con.close();
	}
}
