package com.lab5.test;

import javax.swing.*;

public class constant 
{

	public static void main(String[] args) 
	{
		myScreen newScreen = new myScreen("This is my title");
		newScreen.setSize(500,500);
		newScreen.setLocation(400,220);
		newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
