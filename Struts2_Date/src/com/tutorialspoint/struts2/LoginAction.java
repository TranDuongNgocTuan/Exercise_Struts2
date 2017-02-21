package com.tutorialspoint.struts2;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class LoginAction extends ActionSupport {

	private Date day;
	private String password;
	private String name;

	public String execute() {
		String ret = SUCCESS;
		return ret;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(String day) {
		// setter method param type is String
		System.out.println(day);
		try {
			try {
				this.day = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(day);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}