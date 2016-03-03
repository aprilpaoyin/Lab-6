package com.lab5.test;

public class Employee extends Person
{
	//attributes
	private Job job;
	private static int personnel;
	private Date startDate;
	
	Employee(String firstName, String surname, Date DoB, String gender, Job job, int personnel, Date startDate)
	{
		super(firstName, surname, DoB, gender);
		this.setJob(job);
		this.setPersonnel(personnel);
		this.setStartDate(startDate);
	}

	public String toString()
	{
		String content = getFirstName() + "\n" + getSurname() + "\n" + getDoB() + "\n" + getGender() + "\n" + getJob() + "\n" + getPersonnel() + "\n" + getStartDate();
		return content;
	}
	
	public Job getJob() 
	{
		return job;
	}

	public void setJob(Job job) 
	{
		this.job = job;
	}

	public static int getPersonnel() 
	{
		return personnel;
	}

	public static void setPersonnel(int personnel) 
	{
		Employee.personnel = personnel;
		Employee.personnel++;
	}

	public Date getStartDate() 
	{
		return startDate;
	}

	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}
}
