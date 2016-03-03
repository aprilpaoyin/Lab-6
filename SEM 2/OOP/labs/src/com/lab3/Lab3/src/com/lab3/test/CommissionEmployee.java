package com.lab3.test;

public class CommissionEmployee extends Employee
{
	//attributes
	private double commissionEarned;
	
	CommissionEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double commissionEarned)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.setCommissionEarned(commissionEarned);
	}//end cons 1

	public double calculatePay()
	{
		return super.getBaseAnnualSalary()/12+commissionEarned;
	}//end calculatePay
	
	public String toString()
	{
		String content = "Name: " + super.getFirstName() + " " + super.getSurName() + "\nStaff Number: " + super.getStaffNumber() + "\nBase Annual Salary: " +
				super.getBaseAnnualSalary() + "\nStart Date: " + super.getStartDate() + "\nCommission Earned: " + this.commissionEarned + "\n\n";
		return content;
	}//end toString
	
	public double getCommissionEarned() 
	{
		return commissionEarned;
	}

	public void setCommissionEarned(double commissionEarned) 
	{
		this.commissionEarned = commissionEarned;
	}
}
