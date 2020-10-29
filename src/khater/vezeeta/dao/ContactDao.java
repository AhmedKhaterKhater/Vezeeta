package khater.vezeeta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import khater.vezeeta.model.ContactUs;
import khater.vezeeta.model.Doctor;

public class ContactDao {

	
	
	 public void insert(ContactUs cont) 
	 {
		 
		
		 
		 SessionFactory sf=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(ContactUs.class)
					.buildSessionFactory();
		 
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 
			 se.beginTransaction();
			 se.save(cont);
			 
			
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
		 
	 }
	
}
