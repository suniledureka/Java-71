package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.println("enter empno, name, sal");
			int eno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			
			/* assign the values to the parameters of the PreparedStatement */
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			if(n>0) {
				System.out.println("employee saved!");
			}
			
			System.out.print("do you want to add more employees[Y/N]: ");
			req = sc.next();
		}//while
		
		pst.close();
		sc.close();
		con.close();		
	}
}
