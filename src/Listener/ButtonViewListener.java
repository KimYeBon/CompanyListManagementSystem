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
		this.frame = frame;		// �����ڿ��� �Ű����� frame�� �޾������ν� �ش� �����ڰ� frame�� �̿��� �� �ְ� ��
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		EmployeeAdder adder = frame.getEmployeeadder(); 	
		frame.setupPanel(adder);
	}

}
