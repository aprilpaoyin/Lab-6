package com.lab5.test;

import java.util.Scanner;
import java.io.*;



public class Read_File 
{
	public static void ReadMacRead(String role) throws FileNotFoundException
	   {
		   
		   File myfile = new File("roles.txt");
		   Scanner Scan = new Scanner(myfile) ; 
		      
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
}
