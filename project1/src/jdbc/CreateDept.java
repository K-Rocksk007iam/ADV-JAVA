package jdbc;

import java.sql.*;

public class CreateDept {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ------------name of the driver---------//
			                                                  //url or hoststring
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table dept5(deptno int,dname varchar(20),loc varchar(20));");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
