package com.pattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EventHandler extends JFrame implements ActionListener {
	JButton jbtn = new JButton("지우기");
	
	public void initDisplay() {
		this.add("North",jbtn);
		jbtn.addActionListener(this);//이벤트가 감지되었을 때, 콜백 메소드 호출 성공 => actionPerformed
		this.setSize(300,200);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("actionPerformed호출 성공");

	}

	public static void main(String[] args) {
		EventHandler eh = new EventHandler();
		eh.initDisplay();
	}

}
