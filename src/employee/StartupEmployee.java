package employee;

import java.util.Scanner;

public class StartupEmployee extends FortyEmployee{ 	// Employee�� ��� ���� ����
	
	public StartupEmployee(EmployeeKind kind) {
		super(kind);	// �� ������
	}
	
	public void getUserInput(Scanner input) {
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeDepartment(input);
		setEmployeeGradewithYN(input);
		
	}

}
