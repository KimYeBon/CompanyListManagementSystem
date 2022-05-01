package employee;

import java.util.Scanner;

public class Employee {
	protected EmployeeKind kind = EmployeeKind.Startup;
	protected int id;
	protected String name;
	protected String department;
	protected String grade; 
	
	public EmployeeKind getKind() {
		return kind;
	}

	public void setKind(EmployeeKind kind) {
		this.kind = kind;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Employee() {

	}
	
	public Employee(EmployeeKind kind) {
		this.kind = kind;
	}
	
	public Employee(int id, String name) {
		this.id = id;  //field에 값을 넣어주기 위해 this. 이용
		this.name = name;
	}
	
	public Employee(int id, String name, String department, String grade) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.grade = grade;
	}
	
	public Employee(EmployeeKind kind, int id, String name, String department, String grade) {
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.department = department;
		this.grade = grade;
	}
	
	
	public void printInfo() { 	// 고용인에 따라 정보가 달라짐
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
		
	}
}