package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

	
	@Value("101")
	int age;
	@Value("Nikhil Prajapati")
	String name;

	@Autowired
	@Qualifier("p1")
	Payment p1;
	@Autowired
	@Qualifier("p2")
	Payment p2;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Payment getP1() {
		return p1;
	}

	public void setP1(Payment p1) {
		this.p1 = p1;
	}

	public Payment getP2() {
		return p2;
	}

	public void setP2(Payment p2) {
		this.p2 = p2;
	}

	public User(int age, String name, Payment p1, Payment p2) {
		super();
		this.age = age;
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", p1=" + p1 + ", p2=" + p2 + "]";
	}

}
