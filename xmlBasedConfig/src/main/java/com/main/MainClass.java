package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Company;

public class MainClass {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Company c1 = context.getBean(Company.class);
	
		System.out.println(c1);
	}
}
