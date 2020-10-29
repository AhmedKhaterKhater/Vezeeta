package khater.vezeeta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import khater.vezeeta.dao.DoctorDao;
import khater.vezeeta.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		int age=Integer.parseInt(request.getParameter("age"));
		//request.getParameter("age");
		String name=request.getParameter("name");
		String ssn=request.getParameter("ssn");
		String spec=request.getParameter("specialization");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		
		Doctor doc=new Doctor();
		
		doc.setAge(age);
		doc.setName(name);
		doc.setSsn(ssn);
		doc.setSpecialization(spec);
		doc.setStreet(street);
		doc.setCity(city);
		
		DoctorDao dao=new DoctorDao();
		dao.insertDoctor(doc);
		
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
