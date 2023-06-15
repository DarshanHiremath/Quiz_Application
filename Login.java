package com.darshan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
	JButton rules,Back;
	JTextField tfname;
	Login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);//making default layout null and we have to create our own layout
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image=new JLabel(i1);	//adding image on frame using JLabel w/o using JLabel we can't add image on frame
		
		image.setBounds(0,0,600,500);	//image will be place on left of frame
		
		add(image);
		
		JLabel heading=new JLabel("Think as a Developer");
		heading.setBounds(700,60,600,50);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name=new JLabel("Enter your name");
		name.setBounds(810,150,400,70);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
		name.setForeground(Color.BLACK);
		add(name);
		
		 tfname=new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		 rules=new JButton("Rules");
		rules.setBounds(735,270,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		 Back=new JButton("Back");
		Back.setBounds(915,270,120,25);
		Back.setBackground(new Color(30,144,254));
		Back.setForeground(Color.WHITE);
		Back.addActionListener(this);
		add(Back);
		
		setSize(1200,500);	//1200 length of frame		& 500 breadth of frame  //by default location top right
		setLocation(50,100);   //50-from left and 100-from top
		setVisible(true);	//frame will be visible
		
	}
	

	public static void main(String[] args) 
	{
		new Login();	//Anonymous object
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==rules)
		{
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
		}
		else if(e.getSource()==Back)
		{
			setVisible(false);
		}	
		
	}
}
