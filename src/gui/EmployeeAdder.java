package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class EmployeeAdder extends JFrame {
	public EmployeeAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());		// JFrame ��� ���� ����
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);	// ���������� ��ġ
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);	
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDepartment = new JLabel("ID: ", JLabel.TRAILING);	
		JTextField fieldDepartment = new JTextField(10);
		labelID.setLabelFor(fieldDepartment);
		panel.add(labelDepartment);
		panel.add(fieldDepartment);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		JLabel labelGrade = new JLabel("ID: ", JLabel.TRAILING);	
		JTextField fieldGrade = new JTextField(10);
		labelID.setLabelFor(fieldGrade);
		panel.add(labelGrade);
		panel.add(fieldGrade);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}