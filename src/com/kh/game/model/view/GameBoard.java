package com.kh.game.model.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;
 
public class GameBoard extends JPanel{
	private GamePanel gp;
	private JPanel GameBoard;
	
	public GameBoard(GamePanel gp) {
		this.gp = gp;
		this.GameBoard = this;
		
		this.setSize(400, 400);
		this.setLocation(0, 0);
		this.setLayout(new GridLayout(10, 10));
		
		Set set = new LinkedHashSet();

		while(set.size() < 100) {
			set.add(new Random().nextInt(100) + 1);
		}

		Object[] obj = set.toArray();
		
		int x = 0;
		int y = 0;

		//��ư ���� setBounds()�� ���ؼ� ��ġ�� ũ�⸦ ������ �־���� ȭ�鿡 ���´�.
		for(int i = 0; i < obj.length; i++) {
			String str = new Integer((int)obj[i]).toString();
			JButton btn = new JButton(str);
			btn.setBounds(x, y, 40, 40);
			x += 40; y += 40;
			this.add(btn);
		}
		
		gp.add(GameBoard);
	}

}
