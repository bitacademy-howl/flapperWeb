package com.flapper.stark.DAO;

//import org.hibernate.boot.Metadata;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//import junit.framework.TestCase;

public class SessionFactoryManager{
	private static SessionFactory sessionFactory;
	final static StandardServiceRegistry registry;
	static {
//		세션팩토리 생성을 위한 레지스트리 생성 (XML 설정으로부터 데이터를 파싱하여 이를 통해 연결설정 객체를 생성
//		final StandardServiceRegistry registry;
//		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
//		srb = srb.configure();
//		registry = srb.build();
		registry = new StandardServiceRegistryBuilder().configure().build();

		try {
			
//			세션펙토리 생성
//			MetadataSources mds = new MetadataSources(registry);
//			Metadata md = mds.buildMetadata();
//			this.sessionFactory = md.buildSessionFactory();
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	// getters, setters
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}