package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

	private JFrame frame = new JFrame("Registrasi User");
	private JButton button = new JButton("Register");
	private JTextArea text = new JTextArea();
	private GridLayout grid = new GridLayout(3,2);

	public void start(){
		text.setColumns(20);
		button.setBounds(0,0,200,200);
		button.addActionListener(this);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(grid);
		frame.add(button);
		frame.add(text);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText("Halo Berhasil");
	}
}
