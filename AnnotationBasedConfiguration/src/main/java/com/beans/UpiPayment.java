package com.beans;

import org.springframework.stereotype.Component;

@Component("p2")
public class UpiPayment implements Payment {

	@Override
	public String transaction() {
		return "Payement Done by UPIPayment";
	}

	
	
}
