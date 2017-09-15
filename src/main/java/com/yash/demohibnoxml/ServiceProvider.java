package com.yash.demohibnoxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// This is a Session Provider class
public class ServiceProvider {

	private static Session session;
	private static Configuration configuration;
	
	private ServiceProvider() { }
	
	static {
		
		configuration = new Configuration()
	    
		.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
	    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
	    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/world")
	    .setProperty("hibernate.connection.username", "root")
	    .setProperty("hibernate.connection.password", "Yashwanth*8")
	    .setProperty("hibernate.show_sql", "true")
	    .setProperty("hibernate.hbm2ddl.auto", "update")
	    
	    // Your Mapping Class
	    .addAnnotatedClass(FlowerShop.class)
	    .addAnnotatedClass(Manager.class)
	    .addAnnotatedClass(Flower.class);
	}
	
	
	public static Session getSession() {
	
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
		return session;
	}
	
}

