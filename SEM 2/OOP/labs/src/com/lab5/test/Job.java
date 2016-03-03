package com.lab5.test;

public class Job 
{
	//attributes
	private double salary;
	private String role;
	private int jobID;
	
	//constructor
	Job(double salary, String role, int jobID)
	{
		this.setSalary(salary);
		this.setRole(role);
		this.setJobID(jobID);
	}

	public String toString()
	{
		String content = "Salary: " + getSalary() + "\nRole: " + getRole() + "\nJobID: " + getJobID();
		return content;
	}
	
	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		this.role = role;
	}

	public int getJobID() 
	{
		return jobID;
	}

	public void setJobID(int jobID) 
	{
		this.jobID = jobID;
	}
}
