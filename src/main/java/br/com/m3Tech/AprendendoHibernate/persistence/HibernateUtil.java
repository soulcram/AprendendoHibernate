//package br.com.m3Tech.AprendendoHibernate.persistence;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
//
//public class HibernateUtil {
//	
//	private static SessionFactory sessionFactory;
//	
//	static {
//		try {
//			sessionFactory = new AnnotationConfiguration().buildSessionFactory();
//		}catch(Throwable ex) {
//			throw new ExceptionInInitializerError(ex);
//		}
//	}
//	
//	public static SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//	
//	public static void shutdown() {
//		getSessionFactory().close();
//	}
//
//}
