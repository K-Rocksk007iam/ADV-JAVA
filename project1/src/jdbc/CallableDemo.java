package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.CallableStatement;

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("connection success\n-----------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter increment value");
			double incr = sc.nextInt();
			System.out.println("Enter empno");
			int emp = sc.nextInt();

			String str = " call update_salary(?,?)";
			CallableStatement cs =  con.prepareCall(str);
			cs.setDouble(1, incr);
			cs.setInt(2, emp);
			cs.execute();

			System.out.println("success");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}