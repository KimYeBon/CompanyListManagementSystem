package employee;

import java.util.Scanner;

public class StartupEmployee extends Employee {
	public void getUserInput(Scanner input) {
		
		System.out.print("Employee ID: ");
		int id = input.nextInt();
		this.setID(id);
		
		
		System.out.print("Employee Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Employee Department: ");
		String department = input.next();
		this.setDepartment(department);
		
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("직급이 존재합니까? Y/N을 입력하시오. : ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Employee Grade: ");
				String grade = input.next() ;
				this.setGrade(grade);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setGrade("");
				break;
			}
			else {
			}
		}
		
	}

}
