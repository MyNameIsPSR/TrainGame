package com.kh.game.model.talk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.game.model.gameMain.GameMain;
import com.kh.game.model.view.ChangePanel;
import com.kh.game.model.view.MainFrame;

 
public class Talk extends JPanel{ 
	
	private MainFrame mf;
	private JPanel mainPage;

	public Talk(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this; 
	
		//1. ���� �г� ũ�� ����
		this.setBounds(0, 0, 900, 600); //��ġ �� ũ�� ����
		this.setLayout(null); //���̾ƿ� ����

		//3) ������Ʈ ����
		//4) ������Ʈ ��ġ
		/*JPanel all = new JPanel();
		all.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		
		JTextArea ta = new JTextArea("������ ��ȭ����", 10, 70);
		JButton btn = new JButton(" next > ");
		btn.setLocation(700,470);
		btn.setSize(75,50);
		p1.setLayout(new BorderLayout());
		p1.add(ta, "North");
		p1.add(btn, "South");
		all.add(p1,"South");*/

		/*Image dk = new ImageIcon("���ڱ���/1085379995-findit2/cat1a.jpg")
				.getImage()
				.getScaledInstance(150,150,0);
		JLabel dki = new JLabel(new ImageIcon(dk));
		all.add(dki, "Center");*/

		//this.add(all);
		
		JLabel label = new JLabel("������� ��ȭ ����1!");
		label.setBounds(100, 100, 500, 50); //��ġ�� ũ�� ���� �ϴ� �޼ҵ� �ݵ�� �ʿ�!
		
		JButton button  = new JButton("����");
		button.setBounds(400, 400, 100, 50);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, mainPage, 
						new GameMain(mf, "OX����", 
								"images/test.jpg", "����"));
			}
		});
		
		this.add(label);
		this.add(button);
		
		mf.add(this);
		//System.out.println("Talk ������ ȣ��");

		//2. ������ ����� ���μ��� ����
		//3. ȭ�鿡 �������� �ϴ� �޼ҵ�
		//this.setVisible(true);
	}

	
}

//5) �̺�Ʈ ó��


