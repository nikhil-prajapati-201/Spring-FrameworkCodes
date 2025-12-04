package com.beans;

public class Company {

	int compId;
	String CompanyName;
	String CompanyAddress;
	Employee emp;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Company(int compId, String companyName, String companyAddress, Employee emp) {
		super();
		this.compId = compId;
		CompanyName = companyName;
		CompanyAddress = companyAddress;
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		return "Company [compId=" + compId + ", CompanyName=" + CompanyName + ", CompanyAddress=" + CompanyAddress
				+ ", emp=" + emp + "]";
	}
	
	
}
