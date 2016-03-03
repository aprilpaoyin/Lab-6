package com.lab5.test;

public class Date 
{
	//attributes
	private int day;
	private int month;
	private int year;
	
	//constructors
	Date(int day, int month, int year)
	{
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	public String toString()
	{
		String content = "Day: " + getDay() + "\nMonth: " + getMonth() + "\nYear: " + getYear();
		return content;
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public void setDay(int day) 
	{
		if(day>0 && day<32)
		{
			this.day = day;
		}
		else
		{
			System.out.println("Invalid day.");
		}
	}
	
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		if(month>0 && month<13)
		{
			this.month = month;
		}
		else
		{
			System.out.println("Invalid month.");
		}
	}
	
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		if(year>999 && year<10000)
		{
			this.year = year;
		}
		else
		{
			System.out.println("Invalid year.");
		}
	}



	
}
