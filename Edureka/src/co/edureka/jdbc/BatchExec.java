package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java71","password"); 
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Sunil',2500.5)");
		st.addBatch("insert into emp values(102,'Anil',3500.5)");
		//st.addBatch("insert into emp values(101,'Sachin',4500.5)");
		st.addBatch("insert into emp values(103,'Sachin',4500.5)");
		st.addBatch("update emp set sal=6500");
		
		try {
			int[] n = st.executeBatch();
			for(int x : n) {
				System.out.println("rows affected = "+ x);
			}
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		st.close();
		con.close();
	}
}
