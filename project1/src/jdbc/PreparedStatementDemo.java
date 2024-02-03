package jdbc;

import java.sql.*;
import java.util.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ------------name of the driver---------//
			// url or hoststring
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");

			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter empno, name , salary");
//			int empno = sc.nextInt();
//			String ename = sc.next();
//			double sal = sc.nextDouble();
//
//			String str = "insert into emp5 values(?,?,?)";
//			PreparedStatement ps = con.prepareStatement(str);
//			ps.setInt(1, empno);
//			ps.setString(2, ename);
//			ps.setDouble(3, sal);
//			int i = ps.executeUpdate();
//			if (i > 0) {
//
//				System.out.println("record inserted");
//			} else {
//				System.out.println("not inserted");
//			}

//			System.out.println("Enter increment and name ");
//
//			int incrSal = sc.nextInt();
//			String name = sc.next();

			// update
//			String str="update emp5 set sal=sal+? where ename=?";
//			PreparedStatement ps= con.prepareStatement(str);
//			ps.setInt(1, incrSal);
//			ps.setString(2, name);
//			
//			int i=ps.executeUpdate();
//			if(i>=0) {
//			
//			System.out.println("record updated");
//			}
//			else {
//				System.out.println("not updated");
//			}

			// Delete
			System.out.println("Enter name to delete ");
			String name = sc.next();
			String str = "delete from emp5 where ename=?";
			PreparedStatement ps = con.prepareStatement(str);

			ps.setString(1, name);

			int i = ps.executeUpdate();
			if (i > 0) {

				System.out.println("record deleted");
			} else {
				System.out.println("not deleted");
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
