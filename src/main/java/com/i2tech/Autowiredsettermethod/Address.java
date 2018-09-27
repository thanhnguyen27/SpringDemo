package com.i2tech.Autowiredsettermethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Address {

	private String address="newyork";

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	
}
