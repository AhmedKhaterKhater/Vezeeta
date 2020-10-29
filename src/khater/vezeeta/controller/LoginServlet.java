package khater.vezeeta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import khater.vezeeta.dao.LoginDao;
import khater.vezeeta.model.Login;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		PrintWriter out=response.getWriter();
		
		try {
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Login log=new Login();
		
		log.setEmail(email);
		log.setPassword(password);
		
		LoginDao loginDao=new LoginDao();
		loginDao.save(log);
		
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		
		response.sendRedirect("home.html");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		//out.println("<p> you are successfully enrolled</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
