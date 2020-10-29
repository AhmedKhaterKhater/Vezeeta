package khater.vezeeta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import khater.vezeeta.dao.PatientReservationDao;
import khater.vezeeta.model.PatientReservation;




@WebServlet("/PatientReservationServlet")
public class PatientReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PatientReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String app=request.getParameter("appointment");
		
		PatientReservation ps=new PatientReservation();
		ps.setName(name);
		ps.setPhone(phone);
		ps.setEmail(email);
		ps.setAppointment(app);
		
		PatientReservationDao prd=new PatientReservationDao();
		prd.insert(ps);
		
		response.sendRedirect("success.html");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
