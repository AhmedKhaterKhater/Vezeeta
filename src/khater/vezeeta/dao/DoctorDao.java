package khater.vezeeta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import khater.vezeeta.model.Doctor;


public class DoctorDao {
	
	
	
	
	
	
	
	 public void insertDoctor(Doctor doc) 
	 {
		 
		 SessionFactory sf=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Doctor.class)
					.buildSessionFactory();
		 
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.beginTransaction();
			 se.save(doc);
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
		 
	 }
	
	


}
