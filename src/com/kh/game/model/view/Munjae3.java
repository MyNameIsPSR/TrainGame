package com.kh.game.model.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.kh.game.controller.DifferenceSpot;


public class Munjae3 extends JPanel{
	
	public Munjae3() {
		this.setLocation(150, 70);
		this.setSize(600, 350);
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		if(DifferenceSpot.spot1 == true) {
			g.drawOval(242, 126, 30, 30);
		}
		if(DifferenceSpot.spot2 == true) {
			g.drawOval(83, 187, 30, 30);
		}
		if(DifferenceSpot.spot3 == true) {
			g.drawOval(192, 280, 30, 30);
		}
		
	}

}











