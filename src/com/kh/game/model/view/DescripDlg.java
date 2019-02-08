package com.kh.game.model.view;

import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DescripDlg {
	private Dialog dlg;
	private MainFrame mf;
	private String title;
	private String description;
	
	public DescripDlg(MainFrame mf, String title, String description) {
		//�ʱ�ȭ
		this.mf = mf;
		this.title = title;
		this.description = description;
		
		//���̾�α� ��ü �����
		dlg = new Dialog(mf, title);
		dlg.setBounds(250, 100, 800, 500);
		dlg.setLayout(null);
		
		//���̺� ����
		JLabel label = new JLabel(title);
		label.setFont(new Font("Courier", Font.BOLD, 25));
		label.setLocation(330, 50);
		label.setSize(200, 60);
		
		//�ؽ�Ʈ ����
		JTextArea descrip = new JTextArea(20, 50);
		JScrollPane scroll = new JScrollPane(descrip,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		descrip.setFont(new Font("Courier", Font.BOLD, 18));
		descrip.append(description); //�ؽ�Ʈ ����
		descrip.setEditable(false); //�����Ұ�
		descrip.setCaretPosition(descrip.getDocument().getLength());
		scroll.setLocation(100, 120);
		scroll.setSize(600, 300);
		
		
		//�ݱ� ��ư
		JButton btnDlgClose = new JButton("�ݱ�");
		btnDlgClose.setBounds(630, 430, 70, 30);
		
		btnDlgClose.addActionListener(new ActionListener() { //�ݱ� ��ư ������ ��

			@Override
			public void actionPerformed(ActionEvent e) {
				dlg.dispose(); //���̾�α� �ݱ�
			} //end method
			
		}); //end listener
		
		//���̾�α׿� �߰�
		dlg.add(label); //���̺� �߰�
		dlg.add(scroll); //�ؽ�Ʈ ���� �߰�
		dlg.add(btnDlgClose); //�ݱ� ��ư �߰�
		
		//���̾�α� ����
		dlg.setVisible(true);
	} //end constr

} //end class
