package employee;

import java.util.Scanner;

import Exception.GradeException;

public class ConglomerateEmployee extends FortyEmployee {	// Employee를 상속 받은 형태
	
		protected String conglomerateGrade;
		
		public ConglomerateEmployee(EmployeeKind kind) {
			super(kind);	// 위 생성자
		}
		

		public void getUserInput(Scanner input) {
			setEmployeeID(input); // setEmployeeId의 값을 가져옴
			setEmployeeName(input);
			setEmployeeDepartment(input);
			setConEmployeeGradewithYN(input);
			setEmployeeGrade(input);
		}
		
		public void setConEmployeeGradewithYN(Scanner input) {
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
				System.out.print("대기업 직급 구조를 따릅니까? Y/N을 입력하시오. : ");
				answer = input.next().charAt(0);
				try {
					if (answer == 'y' || answer == 'Y') {
						setEmployeeGrade(input);
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
	
		
		public void printInfo() { 	// 고용인에 따라 정보가 달라짐
			String ekind = getKindString();
			System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade + "Conglomerate Grade" + conglomerateGrade);
		}
		
		}
