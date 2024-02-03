package jdbc;

import java.sql.*;

public class DMLOperations {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ------------name of the driver---------//
			// url or hoststring
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");

			Statement stmt = con.createStatement();
			// String str="insert into dept5 values(10,'acct','mum')";
			// int i =stmt.executeUpdate(str);

//			String str="update dept5 set loc='banglore' where loc='mum'";
//			int i =stmt.executeUpdate(str);

			String str = "delete from dept5 where deptno=10";
			int i = stmt.executeUpdate(str);

			if (i >= 0) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAILED");
			}
			
			
			
			

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
