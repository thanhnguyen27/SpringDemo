package com.i2tech.autowire;

import org.springframework.stereotype.Service;

@Service ("hplaptop")
public class HpLaptop implements Laptop {

	@Override
	public String showTradeMark() {
		// TODO Auto-generated method stub
		return "HpLaptop";
	}

	@Override
	public laptopDTO createLaptop() {
		// TODO Auto-generated method stub
		laptopDTO lt=new laptopDTO();
		lt.setId(2);
		lt.setModel("laptopHP");
		return lt;
	}

}
