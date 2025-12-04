package com.beans;

import org.springframework.stereotype.Component;

@Component("p1")
public class CardPayment implements Payment {

	@Override
	public String transaction() {
		return "Payement Done by CardPayment";
	}


}
