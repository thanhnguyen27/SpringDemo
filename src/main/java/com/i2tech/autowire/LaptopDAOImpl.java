package com.i2tech.autowire;

import org.springframework.stereotype.Repository;

@Repository("LaptopDAO")
public class LaptopDAOImpl implements laptopDAO {

	@Override
	public laptopDTO loadLaptopDB() {
		// TODO Auto-generated method stub
		laptopDTO ld=new laptopDTO();
		ld.setId(3);
		ld.setModel("DELL");
		return ld;
	}

}
