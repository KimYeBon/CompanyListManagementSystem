package employee;

import java.util.Scanner;

public class SmallBusinessEmployee extends Employee {

	public SmallBusinessEmployee(EmployeeKind kind) {
		super(kind);	// ������
	}
	
	public void getUserInput(Scanner input) {
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeDepartment(input);
		setEmployeeGrade(input);
	}
		
		public void printInfo() { 	// ����ο� ���� ������ �޶���
			String ekind = getKindString();
			System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade);
	}

}
	
