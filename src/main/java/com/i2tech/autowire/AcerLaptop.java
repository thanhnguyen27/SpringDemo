package com.i2tech.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Service ("acerlaptop")
@Scope("singleton")//singleton,prototype,request,session,global-session
public class AcerLaptop implements Laptop {
	@Autowired
	laptopDAO laptopDAO;
	@Override
	public String showTradeMark() {
		// TODO Auto-generated method stub
		return "AcerLaptop";
	}

	@Override
	public laptopDTO createLaptop() {
		// TODO Auto-generated method stub
//		laptopDTO lt=new laptopDTO();
//		lt.setId(1);
//		lt.setModel("Acer");
//		
		return laptopDAO.loadLaptopDB();
	}

}
