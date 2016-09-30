package hibernateMain;

import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class StudentManager {
	public static void main(String[] args) {
		// loads configuration and mappings
				Configuration configuration = new Configuration().configure();
				ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
				registry.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
				
				// builds a session factory from the service registry
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
				// obtains the session
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				
				ClassDetail classdetail = new ClassDetail("Junior");
				
				StudentDetails s1 = new StudentDetails("hein",classdetail);
				StudentDetails s2 = new StudentDetails("tom",classdetail);
				StudentDetails s3 = new StudentDetails("keith",classdetail);
				StudentDetails s4 = new StudentDetails("john",classdetail);
				StudentDetails s5 = new StudentDetails("smith",classdetail);
				
				Set<StudentDetails> sDetails = new HashSet<StudentDetails>();
				sDetails.add(s1);
				sDetails.add(s2);
				sDetails.add(s3);
				sDetails.add(s4);
				sDetails.add(s5);
				
				classdetail.setStudentDetails(sDetails);
				
				session.save(classdetail);
				
				session.getTransaction().commit();
				session.close();		
			}

	}

