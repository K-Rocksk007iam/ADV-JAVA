
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out=response.getWriter();
//		out.println("SERVLET DO-GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
		PrintWriter out = response.getWriter();
//		out.println("SERVLET DO-GET");

		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
		request.setAttribute("name1", username);
		request.setAttribute("passvalue", password);
		
//		if (username.equals("kunal") && password.equals("kunal123")) {
//			// response.sendRedirect("Success.jsp");
//			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//			rd.forward(request, response);
//		} else {
//			//response.sendRedirect("Failed.jsp");
//			RequestDispatcher rd = request.getRequestDispatcher("Failed.jsp");
//			rd.forward(request, response);
//		}
		
		boolean isValid=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			
			String str="select * from userTable where user=? and password=?";
			PreparedStatement ps =con.prepareStatement(str);
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet rs = ps.executeQuery();
			isValid=rs.next();
			if(isValid) {
				out.println("VALID INPUT");
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
				response.sendRedirect("Success.jsp");
				
			}
			else {
				response.sendRedirect("Failed.jsp");
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
