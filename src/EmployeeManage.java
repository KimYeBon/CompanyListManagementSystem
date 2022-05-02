import java.util.Scanner;

import employee.ConglomerateEmployee;
import employee.Employee;
import employee.EmployeeKind;
import employee.StartupEmployee;

import java.util.ArrayList;

public class EmployeeManage {
	ArrayList<Employee> employees = new ArrayList<Employee>(); // employee class�� list
	Scanner input;
	EmployeeManage(Scanner input) {
		this.input = input;
	}
	
	
	public void recruitE() {
		int kind = 0;
		Employee employee;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Small Business");
			System.out.println("2 for Startup");
			System.out.println("3 for Conglomerate");
			System.out.print("Select number for Employee Kind between 1 or 2 or 3 : ");
			kind = input.nextInt();
			if (kind == 1) {  
				employee = new Employee(EmployeeKind.SmallBusiness);
				employee.getUserInput(input);
				employees.add(employee); 			// ��Ͽ� employee �׸� �߰�
				break;
			}
			else if (kind == 2) {
				employee = new StartupEmployee(EmployeeKind.Startup);
				employee.getUserInput(input);
				employees.add(employee); 			// ��Ͽ� employee �׸� �߰�
				break; 
			}
			
			else if (kind == 3) {
				employee = new ConglomerateEmployee(EmployeeKind.Conglomerate);
				employee.getUserInput(input);
				employees.add(employee); 			// ��Ͽ� employee �׸� �߰�
				break; 
			}
			
			else {
				System.out.println("Select number for Employee Kind between 1 or 2 or 3. ");
			}
		}
	}

	public void laidOffE() {
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		int index = -1;								// array���� index�� ã�� ����
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getID() == employeeId) { // �ϳ��� index�� get���� ������  
				index = i;
				break; 								// index ���� �� break 
			} 										// �Է� ���� ID�� ���� ID�� �����ϴ��� Ȯ��
		}
		
		if (index >= 0) { 							// ������ ã����. (index�� -1�� �ƴ�) 		
			employees.remove(index);
			System.out.println(employeeId + "����� ��� ó�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� ����Դϴ�.");
			return;
		}

	}
	
	public void reshuffleE() {
		
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		for (int i=0; i<employees.size(); i++) {
			Employee employee = employees.get(i);
			if (employee.getID() == employeeId) {		// ID�� �������� Ȯ���ϴ� ����
				int num = -1 ;
				while (num != 5) {
					System.out.println("This is Employee Reshuffle option.");
					System.out.println("1. Reshuffle Employee ID ");
					System.out.println("2. Reshuffle Employee Name");
					System.out.println("3. Reshuffle Employee Department");
					System.out.println("4. Reshuffle Employee Grade"); 
					System.out.println("5. Exit");
					System.out.println("SELECT one number between 1-5: ");
			
					num = input.nextInt();
					if (num==1) {
							System.out.println("Employee ID: ");
							int id = input.nextInt();
							employee.setID(id);
							}
					
					else if (num==2) {
							System.out.println("Employee name: ");
							String name = input.next();
							employee.setName(name);
							}
			
					else if (num==3) {
							System.out.println("Employee department: ");
							String department = input.next();
							employee.setDepartment(department);
							}
			
					else if (num==4) {
							System.out.println("Employee grade: ");
							String grade = input.next();
							employee.setGrade(grade);
							}
					else {
						continue;
						}
					}
				break; 
				}
			}
		}
		
	public void viewE() {
//		System.out.print("Employee ID: ");
//		int employeeId = input.nextInt();
		System.out.println("# of registered employees: " + employees.size());
		for (int i=0; i<employees.size(); i++) {
			employees.get(i).printInfo();		// ��ü�� ������ �����
		}
}
}
