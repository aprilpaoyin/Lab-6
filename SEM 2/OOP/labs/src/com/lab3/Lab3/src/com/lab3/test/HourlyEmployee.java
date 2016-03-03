package com.lab3.test;


public class HourlyEmployee extends Employee
{
	//own attributes
	private double hoursWorked;
	private double hourlyRate;
	double baseAnnualSalary = 0;
	
	HourlyEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double hoursWorked, double hourlyRate)
	{
		super(firstName, surName, staffNumber, 0, startDate);
		this.setHoursWorked(hoursWorked);
		this.setHourlyRate(hourlyRate);
		
	}//end cons 1

	public double calculatePay()
	{
		return this.hoursWorked*this.hourlyRate;
	}//end calculatePay
	
	public String toString()
	{
		String content = "Name: " + super.getFirstName() + " " + super.getSurName() + "\nStaff Number: " + super.getStaffNumber() + "\nBase Annual Salary: " + 
				super.getBaseAnnualSalary() + "\nStart Date: " + super.getStartDate() + "\nHours Worked: " + this.hoursWorked + "\nHourly Rate: " + 
				this.hourlyRate + "\n\n";
		return content;
	}//end toString
	
	public double getHoursWorked() 
	{
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() 
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) 
	{
		this.hourlyRate = hourlyRate;
	}
}
