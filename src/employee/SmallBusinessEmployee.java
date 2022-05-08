package employee;

import java.util.Scanner;

public class SmallBusinessEmployee extends Employee implements EmployeeInput {	//getUserInput��Ʈ�� �����ϱ� ���� �������̽� ���

	public SmallBusinessEmployee(EmployeeKind kind) {
		super(kind);	// ������
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Employee ID: ");
		int id = input.nextInt() ;
		this.setID(id);
		
		System.out.print("Employee Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Employee Department: ");
		String department = input.next();
		this.setDepartment(department);
		
		System.out.print("Employee Grade: ");
		String grade = input.next();
		this.setGrade(grade);
		
		public void printInfo() { 	// ����ο� ���� ������ �޶���
			String skind = "none";
			switch(this.kind) {
			case SmallBusiness:
				skind = "Small Business's Employee";
				break;
			case Startup:
				skind = "StartUp's Employee";
				break;
			case PublicEnterprise:
				skind = "Public Enterprise's Employee";
				break;
			case Conglomerate:
				skind = "CongLomerate's Employee";
				break;
			default:
			
			}
			System.out.println("kind: " + skind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade);
		}
		
		
	}
	
}
