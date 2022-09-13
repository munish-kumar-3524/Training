package com.em.been;

import java.util.ArrayList;
import java.util.List;


public class Company {
	private static List<Employee> listOfEmployee = new ArrayList<>();
	private static Company company= null;
    
	private Company() {}
	
	public static Company getInstance() {
		if(Company.company == null) {
			company = new Company();
			return company;
		}
		return Company.company;
	}
	
	public static List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<Employee> listOfEmployee) {
		Company.listOfEmployee = listOfEmployee;
	}
	
	public void addEmployee(Employee employee) {
		Company.listOfEmployee.add(employee);
	}
}
