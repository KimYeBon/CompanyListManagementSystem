package employee;

import java.util.Scanner;

public abstract class Employee {	// �����ڰ� �ƴ�, Employee ��ü�� �������� ����
	protected EmployeeKind kind = EmployeeKind.SmallBusiness;
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
		this.id = id;  //field�� ���� �־��ֱ� ���� this. �̿�
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
	
	public abstract void printInfo();
	
	// printInfo : ��¸��� �ٸ� ��, ������ ��� ������ �ϱ� ���� Employee���� ����


}