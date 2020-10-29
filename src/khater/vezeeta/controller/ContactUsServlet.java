package khater.vezeeta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import khater.vezeeta.dao.ContactDao;
import khater.vezeeta.dao.DoctorDao;
import khater.vezeeta.model.ContactUs;
import khater.vezeeta.model.Doctor;

/**
 * Servlet implementation class ContactUsServlet
 */
@WebServlet("/ContactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ContactUsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		String phone=request.getParameter("mobile");
		String email=request.getParameter("email");
		String comment=request.getParameter("comment");
		
		
	    ContactUs contact=new ContactUs();
	    
	    contact.setName(name);
	    contact.setPhone(phone);
	    contact.setEmail(email);
	    contact.setComment(comment);
	    
	    ContactDao c=new ContactDao();
	    c.insert(contact);
	    
		
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
