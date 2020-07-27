package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RetriveRecords {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();	
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp");		
		ResultSetMetaData rd = rs.getMetaData();

		System.out.println("No of Columns = "+ rd.getColumnCount());
		
		int n=0;
		while(rs.next()) {
			System.out.println(rs.getRow()+": "+rs.getInt(1)+ " | "+ rs.getString(2)+" | "+rs.getFloat("sal"));
			n++;
			Thread.sleep(2000);
		}
		System.out.println("No of Records = "+ n);
		rs.close();
		st.close();
		con.close();
	}
}
