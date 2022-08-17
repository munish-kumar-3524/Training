package com.practice.management;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.json.simple.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport implements ServletRequestAware{
	private HttpServletRequest request;
	
	private String result;
	private InputStream inputStream = null;
	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public InputStream getInputStream() {
		System.out.println("Inside the getInputStream!");
		return inputStream;
	}


	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}


	public String execute() {
		if(Objects.nonNull(request))
		{
			Map map = request.getParameterMap();
			
			map.entrySet().forEach(entry1->{
				Map.Entry entry = (Map.Entry) entry1;
				System.out.println(entry.getKey()+" -- "+entry.getValue());
			});
		}
		System.out.println("Inside the execute method!");
		JSONObject object = new JSONObject();
		object.put("name", "munish");
		object.put("age", "24");
		
		System.out.println(result);
		inputStream = new StringBufferInputStream(object.toJSONString());
		
		return "success";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		System.out.println("Request object created and sets up!");
		this.request = arg0;
	}
	
}
