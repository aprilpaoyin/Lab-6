package com.lab3.test;

public class Employee 
{
	//attributes
	private String firstName;
	private String surName;
	private int staffNumber;
	private double baseAnnualSalary;
	private String startDate;
	
	//constructors
	Employee(String firstName, String surName, int staffNumber, 
			double baseAnnualSalary, String startDate)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(staffNumber);
		this.setBaseAnnualSalary(baseAnnualSalary);
		this.setStartDate(startDate);
	}//end cons 1
	
	public double calculatePay()
	{
		return this.baseAnnualSalary/12;
	}//end calculatePay
	
	public String toString()
	{
		String content = "Name: " + this.firstName + " " + this.surName + "\nStaff Number: " + this.staffNumber + "\nBase Annual Salary: " + 
				this.baseAnnualSalary + "\nStart Date: " + this.startDate + "\n\n";
		return content;
	}//end toString

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getSurName() 
	{
		return surName;
	}

	public void setSurName(String surName) 
	{
		this.surName = surName;
	}

	public int getStaffNumber() 
	{
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}

	public double getBaseAnnualSalary() 
	{
		return baseAnnualSalary;
	}

	public void setBaseAnnualSalary(double baseAnnualSalary) 
	{
		this.baseAnnualSalary = baseAnnualSalary;
	}

	public String getStartDate() 
	{
		return startDate;
	}

	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
}
