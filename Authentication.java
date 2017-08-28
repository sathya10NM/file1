package main;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;
public class Authentication {
		public static boolean check(User user){
		SessionFactory sf1=new Configuration().configure().buildSessionFactory();
		Session session1=sf1.openSession();
		session1.beginTransaction();
		Query query=session1.createQuery("from User");
		List<User> list= query.getResultList();
		for(User each:list){
			String u1=each.getUserName();
			String u2=user.getUserName();
			String p1=each.getPassword();
			String p2=user.getPassword();
			//System.out.println(each.getUserName()+" "+user.getUserName()+" "+each.getPassword()+" "+user.getPassword());
			//System.out.println(u1.getClass().getSimpleName()+" "+u2.getClass().getSimpleName());
			if(u1.compareTo(u2)==0 && p1.compareTo(p2)==0){
				//System.out.println("true");
				return true;
			}
		}
		//System.out.println("false");
		return false;
	}
}
