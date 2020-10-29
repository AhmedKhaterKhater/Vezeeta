package khater.vezeeta.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import khater.vezeeta.model.Clinic;

public class ClinicDao {

	
	
	SessionFactory sf=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Clinic.class)
			.buildSessionFactory();
	
	
	
	
	
	 public void insertClinic(Clinic c) 
	 {
		 
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.beginTransaction();
			 se.save(c);
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
		 
	 }
	 
	 public void readAllClinics()
	 {
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.beginTransaction();
			 
			 List<Clinic> list = se.createQuery("from Clinic").list();
			 for(Clinic clinic : list)
			 {
				 System.out.println(clinic);
			 }
			 
			se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
	 }
	 
		
		 
	 public void readById(int id)
	 {
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.beginTransaction();
			 
			 Clinic clinic = se.get(Clinic.class, id);
			 
			 System.out.println("clinic's id is -->"+clinic.getId());
			 System.out.println("clinic's name is -->"+clinic.getClinicName());
			 System.out.println("clinic's city is -->"+clinic.getCity());
			 System.out.println("clinic's ticket is -->"+clinic.getTicket());
			 System.out.println("clinic's street is -->"+clinic.getStreet());
			 System.out.println("clinic's finishing time is -->"+clinic.getTerminatingTime());
			 System.out.println("clinic's starting time is -->"+clinic.getStartingTime());
			 
			 se.getTransaction().commit();
			 
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
	 }
	 
	 public void deleteClinic(Clinic c)
	 {
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 se.delete(c);
			 
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
	 }
	
	 public void updateClinic(Clinic c)
	 {
		 Session se=sf.getCurrentSession();
		 
		 try {
			 
			 Clinic cl=(Clinic) se.createQuery("update Clinic set "
			 		+ "clinic_name=?, street=?, city=?, ticket=?, starting_time=?, terminating_time=?"
			 		+ "where id=?");
			 se.saveOrUpdate(cl);
			 
			 se.getTransaction().commit();
			 
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
	 }
	
}
