package com.lab5.test;

public class control 
{

	public static void main(String args[]) 
	{
		Date d1 = new Date(01, 01, 1994);
		Job j1 = new Job(100.25, "Caretaker", 12);
		Person p1 = new Person("April", "Tan", d1, "Female");
		Date d2 = new Date(02, 02, 1996);
		Employee e1 = new Employee("Adam", "Tonge", d1, "Male", j1, 123, d2);
		
		System.out.println(d1.toString());
		System.out.println("\n");
		System.out.println(j1.toString());
		System.out.println("\n");
		System.out.println(p1.toString());
		System.out.println("\n");
		System.out.println(e1.toString());
	}

}
