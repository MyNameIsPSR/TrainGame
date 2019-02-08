package com.kh.game.model.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kh.game.model.talk.Talk;

//����ȭ��(���� �ʿ�)
public class StartPanel extends JPanel{
	private MainFrame mf;
	private JPanel StartPanel;
	
	public StartPanel(MainFrame mf) {
		this.mf = mf;
		this.StartPanel = this;
		
		this.setSize(900, 600);
		this.setBackground(Color.gray);
		this.setLayout(null);
		
		JButton button1 = new JButton("�����ϱ�");
		JButton button2 = new JButton("�̾��ϱ�");
		
		button1.setSize(150, 40);
		button2.setSize(150, 40);
		
		button1.setLocation(300, 450);
		button2.setLocation(460, 450);
		
		this.add(button1);
		this.add(button2);
		
		//�����ϱ� ������ ��
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ȭ������ ����
				ChangePanel.changePanel(mf, StartPanel, new MakePlayer(mf));
			}
		});
		
		//�̾��ϱ� ������ ��(���� �ʿ�!!)
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ϴ��� ����ĭ ȭ������ ����
				//���� ����
				//���Ͽ��� ��ġ �ҷ��� �� ��ġ���� ���� ������ �� �ֵ���!
				ChangePanel.changePanel(mf, StartPanel, new Talk(mf));
			}
		});
		
		mf.add(this);
	}
}
