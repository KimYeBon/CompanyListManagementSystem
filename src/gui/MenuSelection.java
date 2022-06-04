package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listener.ButtonAddListener;
import Listener.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {	//	�����ڸ� ���� �޴� ����
		this.frame = frame;
		
		this.setLayout(new BorderLayout());		// panel�� �⺻ ���̾ƿ�
		
		JPanel panel = new JPanel();							//	Label�� ��ġ�� ��ġ�� �ʰ� �ϱ� ���� panel ����
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Recruit Employee");
		JButton button2 = new JButton("Get laid off Employee");
		JButton button3 = new JButton("Employee Reshuffle");
		JButton button4 = new JButton("View Employees");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));	// get laid off
		
		panel.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);						// ������ ���� ��ư ����
//		this.setContentPane(panel); 			// ��ü panel�� panel�� ����(����ڰ� ������ �г�)
		this.add(panel, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}

}
