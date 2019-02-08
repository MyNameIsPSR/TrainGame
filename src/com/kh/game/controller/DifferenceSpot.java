package com.kh.game.controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.game.model.talk.Talk3;
import com.kh.game.model.talk.Talk4;
import com.kh.game.model.view.ChangePanel;
import com.kh.game.model.view.MainFrame;
import com.kh.game.model.view.Munjae1;
import com.kh.game.model.view.Munjae2;
import com.kh.game.model.view.Munjae3;

public class DifferenceSpot extends JPanel{
	private JPanel ds = this;
	public static boolean spot1 = false;
	public static boolean spot2 = false;
	public static boolean spot3 = false;
	private JLabel munjae;
	private JLabel result;
	private int [] x;
	private int [] y;
	private int xRange = 40;
	private int yRange = 20;
	private MainFrame mf;
	private int life = 3;
	private ImageIcon icon = null;
	private JPanel panel2;
	private JButton button;
	private JButton button2;
	private JButton npc;
	
	public DifferenceSpot(MainFrame mf) {
		CustomMouseAdapter cma = new CustomMouseAdapter();
		this.mf = mf;
		int random = (int)(Math.random()*3)+1;
		if(random == 1) {
			icon = new ImageIcon("���ڱ���/����1.PNG");
			x = new int [] {231, 163, 120};
			y = new int [] {166, 214, 291};
			panel2 = new Munjae1();
			
		}else if (random == 2) {
			icon = new ImageIcon("���ڱ���/����2.PNG");
			x = new int [] {402, 306, 88};
			y = new int [] {107, 160, 247};
			panel2 = new Munjae2();
			
		}else if (random == 3) {
			icon = new ImageIcon("���ڱ���/����3.PNG");
			x = new int [] {248, 98, 207};
			y = new int [] {140, 202, 292};
			panel2 = new Munjae3();
		}
		
		JLabel title = new JLabel("Ʋ�� �׸� ã��");
		title.setLocation(390, 10);
		title.setSize(120, 70);

		result = new JLabel("���� ������...");
		result.setLocation(400, 450);
		result.setSize(120, 70);
		
		munjae = new JLabel(icon);
		munjae.setLocation(150, 70);
		munjae.setSize(600, 350);
		munjae.addMouseListener(cma);
		
		npc = new JButton("NPC�ڸ�");
		npc.setSize(100, 100);
		npc.setLocation(19, 445);
		npc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == npc) {
					JTextArea text = new JTextArea();
					text.setText("�ȳ�");
					text.setLocation(19, 300);
					ds.add(text);
					
				}
				
			}
		});
		
		button = new JButton("���� Ŭ����!! ��������");
		button.setSize(200, 40);
		button.setLocation(350, 450);
		button.setVisible(false);
		
		button2 = new JButton("�����߽��ϴ�... ��������");
		button2.setSize(200, 40);
		button2.setLocation(350, 450);
		button2.setVisible(false);
		
		
		
		this.add(panel2);
		this.add(npc);
		this.setSize(900, 600);
		this.setLayout(null);
		this.setBackground(Color.gray);
		this.add(title);
		this.add(result);
		this.add(munjae);
		this.add(button);
		this.add(button2);
		
		//�������� �� ��ȭȭ������ ����
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ʋ���׸�ã�� ����! ��ȭȭ������ �Ѿ�ϴ�.");
				mf.getContentPane().removeAll(); //�� �г��� �� �����߸� �Ѿ��..
				System.out.println("���δ� �������ϴ�.");
				ChangePanel.changePanel(mf, ds, 
						new Talk4(mf));
			}
		});
		
		//�������� �� ��ȭ�������� ����(�����ʿ�)
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ʋ���׸�ã�� ����! ��ȭȭ������ �Ѿ�ϴ�.");
				mf.getContentPane().removeAll();
				System.out.println("���δ� �������ϴ�.");
				ChangePanel.changePanel(mf, ds, 
						new Talk3(mf));
			}
		});
		
		mf.add(this);
	}
	
	
	
	public boolean range(int index, Point p) {
		
		int pointX = p.x;
		int pointY = p.y;
		
		return (pointX >=x[index]-xRange) && (pointX <=x[index]+xRange)
				&& (pointY >=y[index]-yRange) && (pointY <=y[index]+yRange);
	}
	
	
	
	
	class CustomMouseAdapter extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Point p = e.getPoint();
			
			if(range(0,p)) {
				DifferenceSpot.spot1 = true;
				munjae.repaint();
				result.setText("�����Դϴ�!!");
			} else if(range(1,p)) {
				DifferenceSpot.spot2 = true;
				munjae.repaint();
				result.setText("�����Դϴ�!!");
			}else if(range(2,p)) {
				DifferenceSpot.spot3 = true;
				munjae.repaint();
				result.setText("�����Դϴ�!!");
			}else {
				life--;
				
			}
			
			if(spot1 == true && spot2 == true && spot3 == true) {
				button.setVisible(true);
			}
			if(life == 0) {
				button2.setVisible(true);
			}
			
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("X : " + e.getX() + " Y : " + e.getY());
		}
		
	}

}























