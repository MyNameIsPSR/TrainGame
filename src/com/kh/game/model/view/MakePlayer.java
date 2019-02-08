package com.kh.game.model.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

//ĳ���� ����(�����ʿ�!)
public class MakePlayer extends JPanel{
	private MainFrame mf;
	private JPanel makePlayer;
	private String charactName;
	
	public MakePlayer(MainFrame mf) {
		//�ʱ�ȭ
		this.mf = mf;
		this.makePlayer = this;
		
		
		//���� �г� ����
		this.setLayout(null);
		this.setBounds(0, 0, 900, 600);
		
		//��� �̹��� ����
		JLabel backImg = new JLabel(new ImageIcon(new ImageIcon("images/test.jpg")
				.getImage()
				.getScaledInstance(900, 600, 0)));
		backImg.setBounds(0, 0, 900, 600);
		
		//���̺� ����
		JLabel label = new JLabel("ĳ���� ����");
		label.setFont(new Font("Courier", Font.BOLD, 25));
		label.setLocation(390, 50);
		label.setSize(200, 60);
		
		//ĳ���� �̹���
		JLabel characImg = new JLabel(new ImageIcon(new ImageIcon("images/���ü���.jpg")
				.getImage()
				.getScaledInstance(179, 273, 0)));
		characImg.setBounds(150, 130, 179, 273);
		
		//���ǳ�
		String[] items = {"���ü���", "���̽�����", "�ص������", "�䳪����",
				"ĿƼ������", "Ÿ�ļ���"};
		JComboBox characCB = new JComboBox(items);
		characCB.setBounds(150, 410, 179, 30);
		
		
		characCB.addActionListener(new ActionListener() {//�޺��ڽ��� �̺�Ʈ �����ϱ�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				
				charactName = (String) cb.getSelectedItem();
				
				Image img = new ImageIcon("images/" + charactName + ".jpg")
							.getImage()
							.getScaledInstance(179, 273, 0);
				
				characImg.setIcon(new ImageIcon(img));
			} //end method
			
		}); //end listener
		
		//�̸��Է�!
		JLabel nameLabel = new JLabel("�̸��� �Է��� �ּ���!");
		nameLabel.setFont(new Font("Courier", Font.BOLD, 22));
		nameLabel.setForeground(Color.WHITE); //�۾� ����
		nameLabel.setBounds(480, 80, 300, 200);
		JTextField nameTf = new JTextField(20);
		nameTf.setFont(new Font("Courier", Font.BOLD, 20));
		nameTf.setText("Player1");
		nameTf.selectAll();
		nameTf.setBounds(400, 200, 400, 50);
		
		//���ӽ��� ��ư(���� �ʿ�!)
		JButton btnStart = new JButton("Next > ");
		btnStart.setBounds(650, 270, 150, 50);
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//������ �����͸� ������ ���� �ʿ�!
				ChangePanel.changePanel(mf, makePlayer, 
						new Prolog(mf));
			}
		});
		
		//������Ʈ�� �߰�		
		this.add(label); //"ĳ���� ����" �ؽ�Ʈ
		this.add(characImg); //ĳ���� ���� �̹���
		this.add(characCB); //���� ���� ���ǳ�
		this.add(nameLabel); //"�̸��� �Է��� �ּ���"
		this.add(nameTf); //�̸��Է� �ؽ�Ʈ �ʵ�
		this.add(btnStart); //���ӽ��� ��ư
		
		this.add(backImg); //��� �̹���
		mf.add(this);
		//System.out.println("MakePlayer ���������� ȣ��");
	} //end constr
	
} //end class
