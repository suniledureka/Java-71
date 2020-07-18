package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class FirstLevelCacheTest {

	public static void main(String[] args) throws Exception{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st1 = session.get(Student.class, Integer.valueOf(101));
		System.out.println(st1);
		System.out.println("----------------------------------------");
		
		Thread.sleep(3000);

		Student st2 = session.get(Student.class, Integer.valueOf(101));
		System.out.println(st2);		
		
		session.close();
		sf.close();
	}

}
