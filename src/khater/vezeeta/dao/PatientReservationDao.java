package khater.vezeeta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import khater.vezeeta.model.PatientReservation;

public class PatientReservationDao {
	
	public PatientReservationDao() {
		
		
	}
	
	public void insert(PatientReservation p)
	{
		SessionFactory sf=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(PatientReservation.class)
				.buildSessionFactory();
		Session se=sf.getCurrentSession();
		
		try 
		{
			
			se.beginTransaction();
			
			se.save(p);
			
			se.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.getStackTrace();
		}
	}
	
	

}
