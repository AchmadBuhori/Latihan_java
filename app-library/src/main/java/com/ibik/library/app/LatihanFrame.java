package com.ibik.library.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LatihanFrame extends JFrame{
	
	private JFrame mainFrame;
	
	public static void main(String[] args) {

		LatihanFrame mainFrame = new LatihanFrame();//inisialisasi objek untuk windows frame
		mainFrame.setTitle("First Window");
		mainFrame.setBounds(530,300,300,200);//posisi frame, X,Y,Width,Height
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setResizable(false);//nonaktif max-minimize
		
		JLabel labelTitle = new JLabel();
		labelTitle.setText("Hello World");
		labelTitle.setBounds(115,50,100,50);
		mainFrame.getContentPane().add(labelTitle);//untuk menambakan komponen ke dalam frame
		
		JButton button = new JButton();
		button.setText("click me");
		button.setBounds(70,100,150,20);
		mainFrame.getContentPane().add(button);
		
		mainFrame.setVisible(true);
	}
	
}
