package employee;

import java.util.Scanner;

public class SmallBusinessEmployee extends Employee {

	public SmallBusinessEmployee(EmployeeKind kind) {
		super(kind);	// 생성자
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Employee ID: ");
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeDepartment(input);
		setEmployeeGrade(input);
		
		System.out.print("Employee Grade: ");
		String grade = input.next();
		this.setGrade(grade);
	}
		
		public void printInfo() { 	// 고용인에 따라 정보가 달라짐
			String ekind = getKindString();
			System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade);

		
		
	}

	}
	
