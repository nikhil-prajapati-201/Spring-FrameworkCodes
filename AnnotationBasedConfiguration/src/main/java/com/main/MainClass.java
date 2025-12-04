package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.User;
import com.config.ConfigurationClass;

public class MainClass {

	public static void main(String args[]) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(ConfigurationClass.class);
		User us = context.getBean(User.class);
		
		System.out.println(us.getP1().transaction());
		System.out.println(us.getP2().transaction());
		
		System.out.println(us);
		
	}
}
