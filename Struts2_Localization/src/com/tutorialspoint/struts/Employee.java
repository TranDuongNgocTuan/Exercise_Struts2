package com.tutorialspoint.struts;


import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
   private int age;
   
   public String execute() 
   {
       return SUCCESS;
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
}