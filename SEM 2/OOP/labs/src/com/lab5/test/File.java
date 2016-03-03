package com.lab5.test;
import java.util.Scanner;
import java.io.*;

public class File 
{
	public static void ReadMacRead(String role ) throws FileNotFoundException
	   {
		   
		   File file = new File("roles.txt");
		   Scanner Scan = new Scanner("roles.txt") ; 
		      
		   while(Scan.hasNextLine() == true )
		   {
			   
			   	 boolean check = true ; 
		    	 String line = Scan.next() ; 
		    	 System.out.println(line) ; 
		    	 
		    	 check = line.contains(role) ; 
		    	 if(check  == true )
		    	 {
		    		 System.out.println(role +" is an accepted role" ) ; 
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Role not accepted : get a new job....  " ) ; 
		    	 }
		   }
		      
		   Scan.close();
	  }
	
	/*File roles = new File("roles.txt");
	Scanner myScanner = new Scanner(roles);
	
	try
	{
		while(myScanner.hasNextLine())
		{
			String line = myScanner.nextLine();
			System.out.println(line);
		}
		
		myScanner.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}*/
}
