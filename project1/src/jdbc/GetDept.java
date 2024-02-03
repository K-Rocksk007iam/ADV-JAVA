package jdbc;

import java.sql.*;

public class GetDept {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ------------name of the driver---------//
			                                                  //url or hoststring
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from dept5");
			
			
			while(rs.next()) {						//column 

				//System.out.println("---------------------------------------------------");
				System.out.println("deptno is "+rs.getInt("deptno"));
				System.out.println("dname is "+rs.getString("dname"));
				System.out.println("loaction is "+rs.getString("loc"));
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
