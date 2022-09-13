package com.em.actions;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Map;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.json.simple.JSONObject;

import com.em.been.Company;
import com.em.been.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class Update  extends ActionSupport implements ServletRequestAware{
	
	private HttpServletRequest request;
	private InputStream inputStream = null;
	private static Company company = Company.getInstance();
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		System.out.println("Request object created and sets up!");
		this.request = arg0;
	}
	
	public InputStream getInputStream() {
		System.out.println("Inside the getInputStream!");
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	public String execute() {
		System.out.println("Inside the execute");
		JSONObject object = new JSONObject();
		
		if(Objects.nonNull(request))
		{
			Map map = request.getParameterMap();
			int id = 0;
			String name = null;
			int age = 0;
			String designation = null;
			
			for(Object tempStr : map.keySet()) {
				//object.put((String)tempStr, request.getParameter((String) tempStr));
				if((boolean)tempStr.equals("id")) {
					id = Integer.parseInt(request.getParameter((String) tempStr));
				}
				if((boolean)tempStr.equals("name")) {
					name = request.getParameter((String) tempStr);
				}
				if((boolean)tempStr.equals("age")) {
					age = Integer.parseInt(request.getParameter((String) tempStr));
				}
				if((boolean)tempStr.equals("designation")) {
					designation = request.getParameter((String) tempStr);
				}
			}
			Employee employee = null;
			List<Employee> listOfEmployee = company.getListOfEmployee();
			for(Employee tempEmployee : listOfEmployee) {
				if(tempEmployee.getId() == id) {
					employee = tempEmployee;
					break;
				}
			}
			if(employee != null) {
				object.put("isValid", "true");
				employee.setName(name);
				employee.setAge(age);
				employee.setDesignamtion(designation);
			}else {
				object.put("isValid", "false");
			}
		}
		
		inputStream = new StringBufferInputStream(object.toJSONString());
			
			return SUCCESS;
	}
}	
