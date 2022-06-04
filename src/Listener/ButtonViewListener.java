package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.EmployeeAdder;
import gui.EmployeeViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;		// 생성자에서 매개변수 frame을 받아줌으로써 해당 생성자가 frame을 이용할 수 있게 됨
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		EmployeeAdder adder = frame.getEmployeeadder(); 	
		frame.setupPanel(adder);
	}

}
