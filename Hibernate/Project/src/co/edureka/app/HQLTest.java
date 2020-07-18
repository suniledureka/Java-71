package co.edureka.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class HQLTest {

	public static void main(String[] args) throws Exception{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		//String hql = "from co.edureka.domains.Student";
		//String hql = "from co.edureka.domains.Student where sname='Anil'";
		/*
		Query query = session.createQuery(hql);
		List<Student> studs = query.list();
		for(Student st : studs) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		*/
		
		/*
		String hql = "from co.edureka.domains.Student where studid between ? and ?"; //positional parameters		
		TypedQuery<Student> q = session.createQuery(hql); 
		q.setParameter(0, 103);
		q.setParameter(1, 108);
		*/
		
		String hql = "from co.edureka.domains.Student where studid between :minsid and :maxsid"; //named parameters		
		TypedQuery<Student> q = session.createQuery(hql); 
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 200);
		
		List<Student> students = q.getResultList();
		
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		System.out.println("------------------------------------");
		/*-- update a student record using HQL --*/
		session.beginTransaction();
		
		hql = "update co.edureka.domains.Student set email=?,mobile=? where studid=:sid";
		q = session.createQuery(hql);
		q.setParameter(0, "sunil@edureka.co");
		q.setParameter(1, "1234567890");
		q.setParameter("sid", 101);
		
		int rows_affected = q.executeUpdate();
		if(rows_affected > 0) {
			System.out.println("Student updated");
		}
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
