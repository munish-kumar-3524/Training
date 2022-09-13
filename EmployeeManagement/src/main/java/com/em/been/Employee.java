package com.em.been;

public class Employee {
	private static int id = 0;
	private String name;
	private int age;
	private String designamtion;
	public Employee(String name, int age, String designamtion) {
		super();
		Employee.id += 1;
		this.name = name;
		this.age = age;
		this.designamtion = designamtion;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignamtion() {
		return designamtion;
	}
	public void setDesignamtion(String designamtion) {
		this.designamtion = designamtion;
	}
	
}
