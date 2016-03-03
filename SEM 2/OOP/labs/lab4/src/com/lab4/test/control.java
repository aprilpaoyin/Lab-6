package com.lab4.test;

public class control 
{
	public static void main(String args[]) 
	{
		Account acc1 = new Account("Smith", 12345, "ABC123", "Dublin", false, 123456);
		DepositAccount acc2 = new DepositAccount("Kin", 54321, "123ABC", "Dublin", false, 456789, 2);
		CurrentAccount acc3 = new CurrentAccount("Kin", 54321, "123ABC", "Dublin", false, 456789, 45);
		
		acc1.deposit(23);
		acc2.withdraw(22.2);
		System.out.println("\n");
		acc3.checkCredit();
		
		System.out.println("\n");
		acc1.getDetails();
		System.out.println("\n");
		acc2.valuableAccount();
		System.out.println("\n");
		acc3.getDetails();
		
	}//end main()
}
