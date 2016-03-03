package com.lab5.test;

public class Person 
{
	//attributes
	private String firstName;
	private String surname;
	private Date DoB;
	private String gender;
	
	Person(String firstName, String surname, Date DoB, String gender)
	{
		this.setFirstName(firstName);
		this.setSurname(surname);
		this.setDoB(DoB);
		this.setGender(gender);
	}
	
	public String toString()
	{
		String content = getFirstName() + "\n" + getSurname() + "\n" + getDoB() + "\n" + getGender();
		return content;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getSurname() 
	{
		return surname;
	}

	public void setSurname(String surname) 
	{
		this.surname = surname;
	}

	public Date getDoB() 
	{
		return DoB;
	}

	public void setDoB(Date doB) 
	{
		DoB = doB;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}
}
