package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.EmployeeAdderCancelListener;
import Listener.EmployeeAdderListener;
import manager.EmployeeManage;

public class EmployeeAdder extends JPanel {
	
	WindowFrame frame;
	
	EmployeeManage employeeManage;
	
	public EmployeeAdder(WindowFrame frame, EmployeeManage employeeManage) {
		this.frame = frame;
		this.employeeManage = employeeManage;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());		// JFrame 상속 받은 형태
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);	// 오른쪽으로 배치
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);	
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDepartment = new JLabel("Department: ", JLabel.TRAILING);	
		JTextField fieldDepartment = new JTextField(10);
		labelID.setLabelFor(fieldDepartment);
		panel.add(labelDepartment);
		panel.add(fieldDepartment);
		
		
		JLabel labelGrade = new JLabel("Grade: ", JLabel.TRAILING);	
		JTextField fieldGrade = new JTextField(10);
		labelID.setLabelFor(fieldGrade);
		
		JButton saveButton = new JButton("Save");	
		saveButton.addActionListener(new EmployeeAdderListener(fieldID, 
				fieldName, fieldDepartment, fieldGrade, employeeManage)); // save버튼에 addActionListener를 붙여줌으로써 동작 실행
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new EmployeeAdderCancelListener(frame));
		
		panel.add(labelGrade);
		panel.add(fieldGrade);
		panel.add(saveButton);
		panel.add(cancelButton);

		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
