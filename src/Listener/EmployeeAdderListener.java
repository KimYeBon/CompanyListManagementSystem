package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.GradeException;
import employee.EmployeeInput;
import employee.EmployeeKind;
import employee.SmallBusinessEmployee;
import manager.EmployeeManage;

public class EmployeeAdderListener implements ActionListener {
	
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldDepartment;
	JTextField fieldGrade;
	
	EmployeeManage employeeManage;
	
	public EmployeeAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldDepartment, 
			JTextField fieldGrade,
			EmployeeManage employeeManage) {
				// 생성자 함수에서 네 필드를 가져 옴
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldDepartment = fieldDepartment;
		this.fieldGrade = fieldGrade;
		this.employeeManage = employeeManage;
	}


	@Override
	public void actionPerformed(ActionEvent e) {	// 해당 파트가 Employee에 할당되어야 함
		System.out.println(fieldID.getText());		// 버튼 이벤트가 나올 때 관련 정보를 가져 옴
		System.out.println(fieldName.getText());
		System.out.println(fieldDepartment.getText());
		System.out.println(fieldGrade.getText());
		
		EmployeeInput employee = new SmallBusinessEmployee(EmployeeKind.SmallBusiness);

		try {
			employee.setID(Integer.parseInt(fieldID.getText()));	// 각각의 입력
			employee.setName(fieldName.getText());
			employee.setDepartment(fieldDepartment.getText());
			employee.setGrade(fieldGrade.getText());
			employeeManage.recruitE(employee);
			putObject(employeeManage, "employeemanager.ser");
			employee.printInfo();
		} catch (GradeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void putObject(EmployeeManage employeeManage, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employeeManage);	// 오브젝트를 가져와 넣어줌으로써 저장됨
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	} 
	
