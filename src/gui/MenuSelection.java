package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {	//	생성자를 통한 메뉴 구성
		this.setSize(300, 300);					// window를 띄우는 frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 종료 창 선택 시 클래스 종료
		
		JPanel panel = new JPanel();							//	Label의 위치가 겹치지 않게 하기 위한 panel 생성
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Recruit Employee");
		JButton button2 = new JButton("Get laid off Employee");
		JButton button3 = new JButton("Employee Reshuffle");
		JButton button4 = new JButton("View Employees");
		JButton button5 = new JButton("Exit Program");
		
		panel.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);						// 순서에 맞춰 버튼 삽입
//		this.setContentPane(panel); 			// 전체 panel을 panel로 지정(사용자가 지정한 패널)
		this.add(panel, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
		
	}

}
