package in.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.beans.User;

public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setName("Krish");
        user.setMarks(42);
        
        Configuration cfg = new Configuration();
        cfg.configure("in/config/hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
        save(session, t, user);
    }
    public static void save(Session s, Transaction t,User user) {
    	try {
        	s.save(user);
        	t.commit();
        } catch (Exception e) {
        	t.rollback();
        	e.printStackTrace();
        }
    }
}
