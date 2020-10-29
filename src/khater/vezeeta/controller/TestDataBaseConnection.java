package khater.vezeeta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestDataBaseConnection")
public class TestDataBaseConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public TestDataBaseConnection() {
        // TODO Auto-generated constructor stub
    }
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url="jdbc:mysql://localhost:3306/vezeeta";
		
		try {
			
			PrintWriter out=response.getWriter();
			
			System.out.println("connecting to database "+url);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=
					DriverManager.getConnection(url, "root", "root");
			
			System.out.println("success");
			
			con.close();
			
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
