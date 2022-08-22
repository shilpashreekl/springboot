package com.cg.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml"); 
		Sim s = (Sim)c.getBean(Sim.class);
		s.calling();
		s.data();
		// TODO Auto-generated method stub
		/*
		  ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml"); Airtel
		 * a=(Airtel)c.getBean("airtel"); a.calling(); a.data();
		 * 
		 * Jio j=(Jio)c.getBean("jio"); j.calling(); j.data();
		 */
           
	}

}
