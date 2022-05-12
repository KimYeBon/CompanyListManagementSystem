package employee;

import java.util.Scanner;

import Exception.GradeException;

public abstract class FortyEmployee extends Employee {

	public FortyEmployee(EmployeeKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input); // 받는 정보는 서로 다르므로 다르게 상속

	@Override
	public void printInfo() {
		String ekind = getKindString();
		System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade);
	}
	
	public void setEmployeeGradewithYN(Scanner input) { 	// 직급 구조 받는 파트 단순화
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer  != 'N')
		{ 
			System.out.print("직급이 존재합니까? Y/N을 입력하시오. : ");
			answer = input.next().charAt(0);
			try {
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
			catch(GradeException e) {
				System.out.println("연차를 함께 <n년>의 형식으로 입력하시오.");
			}
		}
	}

}
