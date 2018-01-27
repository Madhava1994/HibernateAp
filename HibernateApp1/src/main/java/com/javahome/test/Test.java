package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javahome.model.UserBean;

public class Test {

	public static void main(String[] args) {

		
		Configuration cfg =  new Configuration();//Activate Hineranate s/w or jar
		
		cfg = cfg.configure();//by default hibernate.cfg.xml is taken as cfg file
		
		//cfg = cfg.configure("/abc.cfg.xml");
		
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		UserBean userBean = (UserBean)session.get(UserBean.class,1);
		
		System.out.println(userBean);

	}

}
