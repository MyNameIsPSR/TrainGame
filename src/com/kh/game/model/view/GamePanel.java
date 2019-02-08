package com.kh.game.model.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 
//���μ��� ��������
//ȭ���� ������ ����...(���� �ʿ�!)
public class GamePanel extends JPanel{
	private CrossPanel cp;
	private JPanel GamePanel;

	public GamePanel(CrossPanel cp) {
		this.cp = cp;
		this.GamePanel = this;

		this.setSize(800, 445);
		this.setBackground(Color.white);
		this.setLocation(45, 80);
		this.setLayout(null);

		//�Ʒ� �� �ڵ忡 �ִ� �ֵ��� ȭ�鿡 ������ �ʽ��ϴ�.
		//���� : ���̾ƿ� ������?(��ü������ setLayout(null)�ε� �׸��� ���̾ƿ��̶�?)
		GameBoard gb = new GameBoard(this);
		ResultPanel rp = new ResultPanel(this);
		
		JButton button1 = new JButton("�ٽ�Ǯ��");
		JButton button2 = new JButton("����Ȯ��");
		JButton button3 = new JButton("Next");
		JButton button4 = new JButton("Ȯ��");

		button1.setSize(100, 30);
		button2.setSize(100, 30);
		button3.setSize(120, 40);
		button4.setSize(100, 35);

		button1.setLocation(190, 413);
		button2.setLocation(298, 413);
		button3.setLocation(660, 403);
		button4.setLocation(245, 320);

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.add(button3);
				GamePanel.add(button4);
				GamePanel.remove(gb);
				GamePanel.add(rp);
				GamePanel.repaint();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.remove(button4);
				GamePanel.add(gb);
				GamePanel.remove(rp);
				GamePanel.repaint();
			}
		});

		JTextArea munjae = new JTextArea();

		munjae.append("<���ι���>\n\n" + 
				"1. Primitive Data Type�� ��üȭ���ִ� Ŭ������?\n\n" + 
				"2. � ������ ���� ������ ������ ��Ÿ���� Ư���� ����?\n\n" + 
				"3. �ݺ����� �������� �� ����ϴ� ������?\n\n" + 
				"4. ���ǽ��� ������� true�� �� ��� ���� ������ �����ϰ� false�� ���� �������� �ʴ� �����? \n\n" + 
				"5. Date Ŭ������ gettime �޼ҵ� ��� �� return �޴� ���� �ڷ�����?\n\n" + 
				"6. �迭�� ���̸� Ȯ���� �� �ִ� ������?\n\n\n" + 
				"<���ι���>\n\n" + 
				"1. heap �޸𸮿� ��ü�� �����ϰ� stack�� �ּҰ��� �־��ִ� �����ڴ�?\n\n" + 
				"2. �ڽ��� ȣ���� �޼ҵ�� ���ư��� ������?\n\n" + 
				"3. ���������� �� ��𿡼��� ������ ������ ����?\n\n" + 
				"4. byte * short ���� �� ������� �ڷ�����?\n\n" + 
				"5. ���������� �� ������ ���� ���� ��?\n\n" + 
				"6. ��¹����� �����͸� ����ϰ� �ڵ����� �ٹٲ� ó���� ���ִ� �޼ҵ��?");

		munjae.setLineWrap(true);
		munjae.setFont(new Font("����ü", Font.PLAIN, 16));
		munjae.setBounds(400, 0, 400, 400);
		JScrollPane scroller = new JScrollPane(munjae, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scroller.setSize(400, 400);
		scroller.setLocation(400, 0);
		
		this.add(scroller);

		this.add(button1);
		this.add(button2);
		cp.add(this);
		
		//next��ư ������ �� ��ư �ѱ�� �̺�Ʈ �ֱ�
		cp.setBtnNext(button3);
		button3.addActionListener(cp);

	}
}
