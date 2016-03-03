package com.lab4.test;

public class DepositAccount extends Account implements ValidatedAccount
{
	//own attributes
	private double interestRate;
	
	DepositAccount(String accountName, int accountNumber, String sortCode, String branch, boolean inCredit, double acctBalance, double interestRate)
	{
		super(accountName, accountNumber, sortCode, branch, inCredit, acctBalance);
		this.setInterestRate(interestRate);
	}//end cons 1
	
	//method
	public void withdraw(double amtWithdraw)
	{
		System.out.println("You cannot withdraw from a deposit account");
	}//end withdraw
	
	public void getDetails()
	{
		String content = "Account Type: Deposit"
						+ "\nAccount Name: " + this.getAccountName()
						+ "\nAccount Number: " + this.getAccountNumber()
						+ "\nSort Code: " + this.getSortCode()
						+ "\nBranch Name: " + this.getBranch()
						+ "\nIn Credit?: " + this.isInCredit()
						+ "\nAccount Balance: " + this.getAcctBalance();
		System.out.println(content);
	}
	
	public void valuableAccount()
	{
		System.out.println("The account balance is " + this.getAcctBalance());
	}

	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
}
