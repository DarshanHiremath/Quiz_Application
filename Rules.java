package com.darshan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener
{
	 String name;
	 JButton start,Back;

	Rules(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel heading=new JLabel("Welcome "+name+" to the quiz! ");
		heading.setBounds(50,20,700,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(  "<html>"+ 
                "1.Take your time " + "<br><br>" +
                "2.You have only 15 minutes " + "<br><br>" +
                "3.10 questions" + "<br><br>" +
                "4.Once submited cannot be resubmit" + "<br><br>" +
                "5.Think twice before submitting " + "<br><br>" +
                "6.Nim mani devar hesar togond hakri" + "<br><br>" +
                "7.All the best" + "<br><br>" +
                "8.Gundyaaaaaaaaaaaaaa " + "<br><br>" +
            "<html>");
//		rules.setForeground(new Color(30,144,254));
		add(rules);
		
		
			
			 Back=new JButton("Back");
			Back.setBounds(250,500,100,30);
			Back.setBackground(new Color(30,144,254));
			Back.setForeground(Color.WHITE);
			Back.addActionListener(this);
			add(Back);
		
			 start=new JButton("Start");
			 start.setBounds(400,500,100,30);
			 start.setBackground(new Color(30,144,254));
			 start.setForeground(Color.WHITE);
			 start.addActionListener(this);
				add(start);
				
		setSize(800,650);
		setLocation(250,40);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Rules("User");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==start)
		{
			setVisible(false);
			new Quiz(name);
		
		}
		else
		{
			setVisible(false);
			new Login();
		}
	}

}
