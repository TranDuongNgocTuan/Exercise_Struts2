package com.tutorialspoint.struts;

public class HelloWorldAction2 {
	private String name;

	public String execute() throws Exception {
		System.out.println("Inside action....");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
