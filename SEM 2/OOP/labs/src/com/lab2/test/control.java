package com.lab2.test;

public class control 
{
	public static void main(String args[])
	{
		Animal ani1 = new Animal("Leo");
		Animal ani2 = new Animal("Spot", "dog", 4, true, "brown");
		//System.out.println(ani2.name);
		//System.out.println(ani2.domestic);
		//System.out.println(ani2.noLegs);
		ani1.setName("Cat");
		ani2.getName();
		ani2.makeNoise();
		ani2.makeNoise("loud");
	}//end main()
}//end control class
