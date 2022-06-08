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
	ArrayList<EmployeeInput> employees = new ArrayList<EmployeeInput>(); // employee class�� list // �迭 �̸� ������, input�� ����� ����ϰڴٴ� �ǹ�
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
					employees.add(employeeInput); 			// Employee.add��Ʈ�� ���� �ʾ����Ƿ� employeeInput�� ���� line 12 ����
					break;
				}
				else if (kind == 2) {
					employeeInput = new StartupEmployee(EmployeeKind.Startup);
					employeeInput.getUserInput(input);
					employees.add(employeeInput); 			// ��Ͽ� employee �׸� �߰�
					break; 
				}
				
				else if (kind == 3) {
					employeeInput = new ConglomerateEmployee(EmployeeKind.Conglomerate);
					employeeInput.getUserInput(input);
					employees.add(employeeInput); 			// ��Ͽ� employee �׸� �߰�
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
		int index = findIndex(employeeId);			// �Է� ���� ID�� ���� ID�� �����ϴ��� Ȯ��
		removefromEmployees(index, employeeId);
	}
	
	public int removefromEmployees(int index, int employeeId) {
		if (index >= 0) { 							// ������ ã����. (index�� -1�� �ƴ�) 		
			employees.remove(index);
			System.out.println(employeeId + "����� ��� ó�� �Ǿ����ϴ�.");
			return 1;
		}
		else {
			System.out.println("��ϵ��� ���� ����Դϴ�.");
			return -1;
		}
	}
	
	public void reshuffleE() {
		
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		for (int i=0; i<employees.size(); i++) {
			EmployeeInput employee = employees.get(i);
			if (employee.getID() == employeeId) {		// ID�� �������� Ȯ���ϴ� ����
				int num = -1 ;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						employee.setEmployeeID(input);		// input������ employee���� ���� ������
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
					
				}	// while��
				break; 
				}	// if��
			}	// for��
		}
		
	public void viewE() {
		System.out.println("# of registered employees: " + employees.size());
		for (int i=0; i<employees.size(); i++) {
			employees.get(i).printInfo();		// ��ü�� ������ �����
		}
}
	
	public int findIndex(int employeeId) {
		int index = -1;								// array���� index�� ã�� ����
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getID() == employeeId) { // �ϳ��� index�� get���� ������  
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
		return (Employee) employees.get(index);	// employees ���� �ε����� �־������ν� Employee return
	}
	
	public void showEditMenu() {			// �Լ��� ���� ����ȭ
			
		System.out.println("This is Employee Reshuffle option.");
		System.out.println("1. Reshuffle Employee ID ");
		System.out.println("2. Reshuffle Employee Name");
		System.out.println("3. Reshuffle Employee Department");
		System.out.println("4. Reshuffle Employee Grade"); 
		System.out.println("5. Exit");
		System.out.println("SELECT one number between 1-5: ");
		
	}
	

	
}

