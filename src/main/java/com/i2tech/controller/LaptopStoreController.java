package com.i2tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.i2tech.autowire.Laptop;
import com.i2tech.autowire.laptopDTO;

@Controller
public class LaptopStoreController {
	@Autowired
	//@Qualifier("hplaptop")
	@Qualifier("acerlaptop")//Qualifier giai quyet xung dot nhiều hon 1 bean cho cung 1 đoi tuong
	Laptop laptop;
	
	public laptopDTO loadLaptop() {
		
		return laptop.createLaptop();
	}
}
