package com.serial;

import java.io.*;

public class Employee implements Serializable
{
	String name,dob,department,designation,salary;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Employee e = new Employee();
		e.setName("praveen");
		e.setDob("31-03-1990");
		e.setDepartment("R&D");
		e.setDesignation("Developer");
		e.setSalary("787878787");
		FileOutputStream fos = new FileOutputStream("C:\\project\\fileIOproject\\src\\directory\\OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		FileInputStream fis = new FileInputStream("C:\\project\\fileIOproject\\src\\directory\\OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		System.out.println("Your Name: "+e2.getName());
		System.out.println("Your DOB: "+e2.getDob());
		System.out.println("Your Department: "+e2.getDepartment());
		System.out.println("Your Designation: "+e2.getDesignation());
		System.out.println("Your Salary: "+e2.getSalary());
			
		
	}

}
