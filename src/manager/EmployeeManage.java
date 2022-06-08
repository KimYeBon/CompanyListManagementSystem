package manager;
import java.util.Scanner;

import employee.ConglomerateEmployee;
import employee.Employee;
import employee.EmployeeInput;
import employee.EmployeeKind;
import employee.SmallBusinessEmployee;
import employee.StartupEmployee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class EmployeeManage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8439552870283196159L;
	ArrayList<EmployeeInput> employees = new ArrayList<EmployeeInput>(); // employee class의 list // 배열 이름 재정의, input의 결과를 출력하겠다는 의미
	transient Scanner input;
	EmployeeManage(Scanner input) {
		this.input = input;
	}
	
	public void recruitE(String id, String name, String department, String grade) {
		EmployeeInput employeeInput = new SmallBusinessEmployee(EmployeeKind.SmallBusiness);
		employeeInput.getUserInput(input);
		employees.add(employeeInput); 	
	}
	
	public void recruitE(EmployeeInput employeeInput) {
		employees.add(employeeInput);
	}
	
	public void recruitE() {
		int kind = 0;
		EmployeeInput employeeInput;
		while (kind != 1 && kind != 2 && kind != 3 ) {
			try {
				System.out.println("1 for Small Business");
				System.out.println("2 for Startup");
				System.out.println("3 for Conglomerate");
				System.out.print("Select number for Employee Kind between 1 or 2 or 3 : ");
				kind = input.nextInt();
				if (kind == 1) {  
					employeeInput = new SmallBusinessEmployee(EmployeeKind.SmallBusiness);
					employeeInput.getUserInput(input);
					employees.add(employeeInput); 			// Employee.add파트가 들어가지 않았으므로 employeeInput에 따라 line 12 수정
					break;
				}
				else if (kind == 2) {
					employeeInput = new StartupEmployee(EmployeeKind.Startup);
					employeeInput.getUserInput(input);
					employees.add(employeeInput); 			// 목록에 employee 항목 추가
					break; 
				}
				
				else if (kind == 3) {
					employeeInput = new ConglomerateEmployee(EmployeeKind.Conglomerate);
					employeeInput.getUserInput(input);
					employees.add(employeeInput); 			// 목록에 employee 항목 추가
					break; 
				}
				
				else {
					System.out.println("Select number for Employee Kind between 1, 2 or 3. ");
				}
				}
				catch(InputMismatchException e) {
					System.out.println("\n Please put an Integer between 1 to 5 \n");
					if (input.hasNext()) {
						input.next();
				 }
				kind = -1;
				}
				}
	}

	public void laidOffE() {
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		int index = findIndex(employeeId);			// 입력 받은 ID와 같은 ID가 존재하는지 확인
		removefromEmployees(index, employeeId);
	}
	
	public int removefromEmployees(int index, int employeeId) {
		if (index >= 0) { 							// 정보를 찾았음. (index가 -1이 아님) 		
			employees.remove(index);
			System.out.println(employeeId + "사원이 퇴사 처리 되었습니다.");
			return 1;
		}
		else {
			System.out.println("등록되지 않은 사원입니다.");
			return -1;
		}
	}
	
	public void reshuffleE() {
		
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		for (int i=0; i<employees.size(); i++) {
			EmployeeInput employee = employees.get(i);
			if (employee.getID() == employeeId) {		// ID가 동일한지 확인하는 절차
				int num = -1 ;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						employee.setEmployeeID(input);		// input만으로 employee에서 접근 가능함
						break;
						
					case 2:
						employee.setEmployeeName(input);
						break;
			
					case 3:
						employee.setEmployeeDepartment(input);
						break;
			
					case 4:
						employee.setEmployeeGrade(input);
						break;
						
					default:
						continue;
						
					}
					
				}	// while문
				break; 
				}	// if문
			}	// for문
		}
		
	public void viewE() {
		System.out.println("# of registered employees: " + employees.size());
		for (int i=0; i<employees.size(); i++) {
			employees.get(i).printInfo();		// 객체의 정보를 출력함
		}
}
	
	public int findIndex(int employeeId) {
		int index = -1;								// array에서 index를 찾지 못함
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getID() == employeeId) { // 하나의 index를 get으로 가져옴  
				index = i;
				break; 	
				}
		}
		return index;
	}
	
	public int size() {
		return employees.size();
	}
	
	public EmployeeInput get(int index) {
		return (Employee) employees.get(index);	// employees 열에 인덱스를 넣어줌으로써 Employee return
	}
	
	public void showEditMenu() {			// 함수를 통한 간소화
			
		System.out.println("This is Employee Reshuffle option.");
		System.out.println("1. Reshuffle Employee ID ");
		System.out.println("2. Reshuffle Employee Name");
		System.out.println("3. Reshuffle Employee Department");
		System.out.println("4. Reshuffle Employee Grade"); 
		System.out.println("5. Exit");
		System.out.println("SELECT one number between 1-5: ");
		
	}
	

	
}

