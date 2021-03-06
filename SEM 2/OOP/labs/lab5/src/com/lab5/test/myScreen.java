/*
 * Making a screen
 * Author: April Tan Pao Yin
 * Date: 3/3/16
 * 
*/
package com.lab5.test;

//import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class myScreen extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JTextField txt;
	private JLabel lab;
	private JCheckBox check;
	private JRadioButton radio;
	
	
	//constructor
	public myScreen(String title)
	{
		super(title);
		
		setLayout(new GridLayout());
		
		setButton1(new JButton("Click Here for 1"));
		add(getButton1());
		setButton2(new JButton("Click Here for 2"));
		add(getButton2());
		
		setTxt(new JTextField("   "));
		add(getTxt());
		
		setLab(new JLabel("Lab 5"));
		add(getLab());
		setLocation(50,100);
		
		setCheck(new JCheckBox());
		add(getCheck());
		
		setRadio(new JRadioButton());
		add(getRadio());
		
		
		
		setVisible(true);
	}//end cons 1


	public JButton getButton1() 
	{
		return button1;
	}


	public void setButton1(JButton button1) 
	{
		this.button1 = button1;
	}


	public JButton getButton2() 
	{
		return button2;
	}


	public void setButton2(JButton button2) 
	{
		this.button2 = button2;
	}


	public JTextField getTxt() 
	{
		return txt;
	}


	public void setTxt(JTextField txt) 
	{
		this.txt = txt;
	}


	public JLabel getLab() 
	{
		return lab;
	}


	public void setLab(JLabel lab) 
	{
		this.lab = lab;
	}


	public JCheckBox getCheck() 
	{
		return check;
	}


	public void setCheck(JCheckBox check) 
	{
		this.check = check;
	}


	public JRadioButton getRadio()
	{
		return radio;
	}


	public void setRadio(JRadioButton radio) 
	{
		this.radio = radio;
	}
}
