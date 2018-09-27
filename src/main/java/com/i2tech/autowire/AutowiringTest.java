package com.i2tech.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.i2tech.controller.LaptopStoreController;

public class AutowiringTest {
	
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
	BeanFactory factory = (BeanFactory) context;
	LaptopStoreController ltsc=(LaptopStoreController)factory.getBean("laptopStoreController");	
	laptopDTO laptopDTO=ltsc.loadLaptop();
	System.out.println(laptopDTO);
	Laptop acerLaptop=(AcerLaptop)factory.getBean("acerlaptop");
	System.out.println("AcerlaptopBean:"+acerLaptop.showTradeMark());
	laptopDAO laptopDAO=(laptopDAO)factory.getBean("LaptopDAO");	
	System.out.println("laptopDao"+laptopDAO.loadLaptopDB());
	//    LaptopStore laptopStore = (LaptopStore) factory.getBean("laptopStore");  
    //LaptopStoreTye laptopStore = (LaptopStoreTye) factory.getBean("laptopStoreTye");  
   // System.out.println("Laptop1's trade mark: "+laptopStore.getLaptop1().showTradeMark());  
   // System.out.println("Laptop2's trade mark: "+laptopStore.getLaptop2().showTradeMark());  
    
    
}
}
