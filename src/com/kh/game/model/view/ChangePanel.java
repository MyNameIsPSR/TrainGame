package com.kh.game.model.view;

import javax.swing.JPanel;

public class ChangePanel { //�г� ��ü Ŭ����
 
	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		mf.remove(op); //�����ӿ��� �г��� �����
		mf.add(np); //�����ӿ� ���ο� �г� �߰�
		
		mf.repaint(); //������Ʈ�� �ٽ� �׷���
	} //end method

} //end class
