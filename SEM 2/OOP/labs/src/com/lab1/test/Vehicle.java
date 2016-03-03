/****************************************
*   Vehicle class
*   Author: April Tan Pao Yin
*   Date: 28/01/2016
*****************************************/

package com.lab1.test;

public class Vehicle 
{
	//attributes
	public String owner;
	int regisNum;
	int maxSpeed;
	String colour;
	boolean auto;
	int numWheels;
	
	//constructors
	public Vehicle(String owner1)
	{
		owner = owner1;
		//System.out.println(owner);
	}//end 1st constructor
	
	public Vehicle(int regisNum, int maxSpeed, String colour, boolean auto, int numWheels)
	{
		this.regisNum = regisNum;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.auto = auto;
		this.numWheels = numWheels;
		
		//System.out.println("The owner is " + this.owner + " " +  this.regisNum + " " + this.maxSpeed + " " + this.colour + " " + this.auto + " " + this.numWheels);
	}//end 2nd constructor
	
	public String toString()
	{
		String content = "Owner name:\t\t" + this.owner + "\nColour:\t\t\t" + this.colour + "\nRegister Number:\t" + this.regisNum + "\nMax. Speed:\t\t" + this.maxSpeed + "\nAuto:\t\t\t" + this.auto + "\nNumber of Wheels:\t" + this.numWheels;
		return content;
		
	}//end toString
}//end Vehicle
