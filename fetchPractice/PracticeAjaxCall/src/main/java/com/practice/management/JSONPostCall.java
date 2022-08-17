package com.practice.management;

import com.opensymphony.xwork2.ActionSupport;

public class JSONPostCall extends ActionSupport {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String execute() {
		System.out.println(number);
		return SUCCESS;
	}
}
