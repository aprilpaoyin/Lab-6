/************************************
 * 
 * Lab 2
 * Author: April Tan Pao Yin
 * Date: 4/2/2016
 * 
 ************************************/

package com.lab2.test;

public class Animal 
{
	//attributes
	private String name;
	private String breed;
	private int noLegs;
	private boolean domestic;
	private String color;
	
	//constructors
	Animal(String name)
	{
		this.setName(name);
		System.out.println("The name of this animal is " + this.getName());
	}//end 1st constructor
	
	Animal(String name, String breed, int legs, boolean domes, String color)
	{
		this.setName(name);
		this.setBreed(breed);
		setNoLegs(legs);
		setDomestic(domes);
		this.setColor(color);
		System.out.println("The name is " + this.name + " and it is a " + this.getBreed() +
				". It has " + getNoLegs() + " legs and domesticity is " + isDomestic() + 
				". Its color is " + this.getColor() + ".");
	}//end 2nd constructor

	//part 3 - setters and getters
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		this.breed = breed;
	}

	public int getNoLegs() 
	{
		return noLegs;
	}

	public void setNoLegs(int noLegs) 
	{
		this.noLegs = noLegs;
	}

	public boolean isDomestic() 
	{
		return domestic;
	}

	public void setDomestic(boolean domestic) 
	{
		this.domestic = domestic;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
	//part 4 - overloading methods
	public void makeNoise()
	{
		if(breed.equals("dog"))
		{
			System.out.println("woof woof");
		}//end if
		else 
		{
			System.out.println("......");
		}//end else
	}//end makeNoise
	
	public void makeNoise(String volume)
	{
		if(volume.equals("loud"))
		{
			System.out.println("WOOF WOOF");
		}//end if
		else 
		{
			System.out.println("......");
		}//end else
	}//end makeNoise
	
}//end Animal
