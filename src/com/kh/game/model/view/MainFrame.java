package com.kh.game.model.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() { //������ �ϳ��� �ۼ�
		this.setSize(900, 600);
		this.setLayout(null);
		
		//new CrossPanel(this);
		new StartPanel(this);
		
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
