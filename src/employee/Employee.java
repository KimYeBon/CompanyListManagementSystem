package employee;

import java.io.Serializable;
import java.util.Scanner;

import Exception.GradeException;

public abstract class Employee implements EmployeeInput, Serializable {	// 생성자가 아님, Employee 객체를 생성하지 않음
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
		if (!grade.contains("년") && !grade.equals("")) {
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
	
	public abstract void printInfo();	// printInfo : 출력마다 다를 때, 구현을 모두 별도로 하기 위해 Employee에서 제거
	
		
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
			while (!grade.contains("년") || grade.equals("")) {	// 년도 포함 x 혹은 공백
			System.out.println("Employee grade: ");
			grade = input.next();
			try {
				this.setGrade(grade);
			} catch (GradeException e) {
				System.out.println("연차를 함께 <n년>의 형식으로 입력하시오.");
			}
		}
		}
		
		public String getKindString() { 	// 고용인에 따라 정보가 달라짐
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
	

