package com.kh.game.model.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//OX����ȭ��(���� �ʿ�!)
public class OXPlay extends JPanel{
	private MainFrame mf;
	private JPanel oxPlay;
	 
	public OXPlay(MainFrame mf) {
		this.mf = mf;
		this.oxPlay = this;

		this.setLayout(null);
		this.setBounds(0, 0, 900, 600);
		
		
		JLabel label = new JLabel("OX");
		label.setFont(new Font("���",Font.BOLD,30));
		label.setSize(50,50);
		label.setLocation(425, 10);
		
		
		JTextField jtf = new JTextField(50);
		jtf.setSize(800,50);
		jtf.setLocation(40, 50);
		
		JTextArea jta = new JTextArea();
		jta.setSize(800, 300);
		jta.setLocation(40, 110);
		jta.setEditable(false);
		
		JButton obutton = new JButton("O");
		obutton.setFont(new Font("���",Font.BOLD,30));
		obutton.setSize(390,100);
		obutton.setLocation(40,420);
		JButton xbutton = new JButton("X");
		xbutton.setFont(new Font("���",Font.BOLD,30));
		xbutton.setSize(390,100);
		xbutton.setLocation(450,420);
		
		//���� 10���� �� Ǯ�� Ʋ�� ���� ī��Ʈ �ؼ� ����, ��� ���θ� result Ŭ������ �˷� �־�� ��
		//������ ��ư ������ �� resultŬ������ �Ѿ�� ��
		xbutton.addActionListener(new ActionListener() { //������ ��ư ������ ���� ����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("X��ư Ŭ��");
				ChangePanel.changePanel(mf, oxPlay, 
						new OXResult(mf));
			}
		});
		
		
		
		this.setLayout(null);
		this.add(label);
		this.add(jtf);
		this.add(jta);
		this.add(obutton);
		this.add(xbutton);
		mf.add(this);
		
		
	} //end constr
	
} //end class
