package employee;

import java.util.Scanner;

public class StartupEmployee extends FortyEmployee{ 	// Employee를 상속 받은 형태
	
	public StartupEmployee(EmployeeKind kind) {
		super(kind);	// 위 생성자
	}
	
	public void getUserInput(Scanner input) {
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeDepartment(input);
		setEmployeeGradewithYN(input);
		
	}

}
