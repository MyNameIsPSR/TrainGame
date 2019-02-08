package com.kh.game.model.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.game.model.talk.Talk3;
 
//������ ����(����)
//���� �ʿ�!
public class Ending extends JPanel{
	
	private MainFrame mf;
	private JPanel ending;
	
	public Ending(MainFrame mf) {
		this.mf = mf;
		this.ending = this;
		
		//�г� ����
		this.setBounds(0, 0, 900, 600);
		this.setLayout(null);
		
		//��׶��� �̹���
		JLabel backImg = new JLabel(new ImageIcon(new ImageIcon("images/test.jpg")
				.getImage()
				.getScaledInstance(900, 600, 0)));
		backImg.setBounds(0, 0, 900, 600);
		
		//��ư
		JButton btnStart = new JButton("����");
		btnStart.setBounds(650, 500, 150, 50);
		
		//�гο� �߰�
		this.add(btnStart);
		this.add(backImg);
		
		btnStart.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ending.add(new JLabel("���� ����"));
				ChangePanel.changePanel(mf, ending, 
						new StartPanel(mf));
				System.out.println("���� ����!");
			}
			
		});
		
		//�����ӿ� �߰�
		mf.add(this);
	} //end method
	
} //end class
