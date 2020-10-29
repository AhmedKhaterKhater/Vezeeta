package khater.vezeeta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import khater.vezeeta.model.Login;

public class LoginDao {
	
	
	
	 public void save(Login l) 
	 {
		 
		 SessionFactory sf=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Login.class)
					.buildSessionFactory();	
		 
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.beginTransaction();
			 se.save(l);
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
		 
	 }
	 
	 
	 

}
