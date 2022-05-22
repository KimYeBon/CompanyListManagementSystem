package employee;

import java.io.Serializable;
import java.util.Scanner;

import Exception.GradeException;

public abstract class Employee implements EmployeeInput, Serializable {	// �����ڰ� �ƴ�, Employee ��ü�� �������� ����
										/**
	 * 
	 */
	private static final long serialVersionUID = 7453475774881160234L;
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

	public void setGrade(String grade) throws GradeException {
		if (!grade.contains("��") && !grade.equals("")) {
			throw new GradeException();
		}
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
	
	public abstract void printInfo();	// printInfo : ��¸��� �ٸ� ��, ������ ��� ������ �ϱ� ���� Employee���� ����
	
		
		public void setEmployeeID(Scanner input) {
			System.out.println("Employee ID: ");
			int id = input.nextInt();
			this.setID(id);
		}
		
		public void setEmployeeName(Scanner input) {
			System.out.println("Employee name: ");
			String name = input.next();
			this.setName(name);
		}
		
		public void setEmployeeDepartment(Scanner input) {
			System.out.println("Employee department: ");
			String department = input.next();
			this.setDepartment(department);
		}
		
		public void setEmployeeGrade(Scanner input) {
			String grade = "";
			while (!grade.contains("��") || grade.equals("")) {	// �⵵ ���� x Ȥ�� ����
			System.out.println("Employee grade: ");
			grade = input.next();
			try {
				this.setGrade(grade);
			} catch (GradeException e) {
				System.out.println("������ �Բ� <n��>�� �������� �Է��Ͻÿ�.");
			}
		}
		}
		
		public String getKindString() { 	// ����ο� ���� ������ �޶���
			String ekind = "none";
			switch(this.kind) {
			case SmallBusiness:
				ekind = "Small Business's Employee";
				break;
			case Startup:
				ekind = "StartUp's Employee";
				break;
			case PublicEnterprise:
				ekind = "Public Enterprise's Employee";
				break;
			case Conglomerate:
				ekind = "CongLomerate's Employee";
				break;
			default:
			
			}
			return ekind;
		}


	}
	

