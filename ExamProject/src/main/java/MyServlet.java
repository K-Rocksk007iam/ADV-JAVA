
import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String count = "";
		String ans1 = request.getParameter("A");
		String ans2 = request.getParameter("B");
		String ans3 = request.getParameter("C");
		String ans4 = request.getParameter("D");

		request.setAttribute("A", ans1);
		request.setAttribute("B", ans2);
		request.setAttribute("C", ans3);
		request.setAttribute("D", ans4);

		if (ans1.equals("Config")) {

			count="1";
		}
		if (ans2.equals("init")) {

			count="2";
		}
		if (ans3.equals("all of these")) {

			count="3";
		}
		if (ans4.equals("Service")) {

			count="4";
		}

		request.setAttribute("count", count);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);

	}

}
