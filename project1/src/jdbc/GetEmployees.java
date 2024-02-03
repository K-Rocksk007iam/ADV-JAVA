package jdbc;

import java.sql.*;

public class GetEmployees {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ------------name of the driver---------//
			                                                  //url or hoststring
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from empt5");
			
			while(rs.next()) {						//column 
//				System.out.println("empno is "+rs.getInt(1));
//				System.out.println("empname is "+rs.getString(2));
//				System.out.println("salary is "+rs.getInt(3));
				System.out.println("---------------------------------------------------");
				System.out.println("empno is "+rs.getInt("empno"));
				System.out.println("empname is "+rs.getString("ename"));
				System.out.println("salary is "+rs.getInt("sal"));
				System.out.println("---------------------------------------------------");
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
