package com.darshan;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{

	Score(String name,int score)
	{
		setBounds(200,100,1000,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);	//adding image on frame using JLabel w/o using JLabel we can't add image on frame
		image.setBounds(0,200,300,250);	//image will be place on left of frame
		add(image);
		
		JLabel heading=new JLabel("Thank You " + name +" for playing quiz");      
		heading.setBounds(70,10,700,70);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30)); 
		add(heading);
		
		JLabel lscore=new JLabel("Your score is: "+ score);      
		lscore.setBounds(350,200,300,70);
		lscore.setFont(new Font("Tahoma",Font.BOLD,30)); 
		add(lscore);
		
		JButton submit=new JButton("Play Again");
        submit.setBounds(400,270,120,40);
        submit.setFont(new Font("Tahoma",Font.BOLD,16));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
		setVisible(true);
	}
	public static void main(String[] args) {
			new Score("User",0);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		setVisible(false);
		new Login();
		
	}

}
