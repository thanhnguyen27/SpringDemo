package com.i2tech.Autowiredsettermethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.i2tech.autowire.AcerLaptop;

public class AppTest {


public static void main(String[] args) {
	
	
	ApplicationContext context = 
	    	  new ClassPathXmlApplicationContext(new String[] {"spring-app.xml"});
	    	String[] dfn=context.getBeanDefinitionNames();
	    	for (int i = 0; i < dfn.length; i++) {
				System.out.println("Bean name:"+dfn[i]);
			}
	    	
	    	Customer cust = (Customer)context.getBean("customer");
	    	System.out.println(cust);
	    	System.out.println(cust.getPerson().getAddress());
	    	//Return a single bean instance
	    	Address address = (Address)context.getBean("address");
	    	address.setAddress("London");
	    	System.out.println("address:"+((Address)context.getBean("address")).getAddress());
	    	//prototype Return a new bean instance 
	    	Address address2 = (Address)context.getBean("address");
	    	System.out.println(address2);
	    	
	    	//System.out.println("customer:"+cust.getPerson().getName());
}
}
