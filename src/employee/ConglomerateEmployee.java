package employee;

import java.util.Scanner;

import Exception.GradeException;

public class ConglomerateEmployee extends FortyEmployee {	// Employee�� ��� ���� ����
	
		protected String conglomerateGrade;
		
		public ConglomerateEmployee(EmployeeKind kind) {
			super(kind);	// �� ������
		}
		

		public void getUserInput(Scanner input) {
			setEmployeeID(input); // setEmployeeId�� ���� ������
			setEmployeeName(input);
			setEmployeeDepartment(input);
			setConEmployeeGradewithYN(input);
			setEmployeeGrade(input);
		}
		
		public void setConEmployeeGradewithYN(Scanner input) {
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
				System.out.print("���� ���� ������ �����ϱ�? Y/N�� �Է��Ͻÿ�. : ");
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
					System.out.println("������ �Բ� <n��>�� �������� �Է��Ͻÿ�.");
					
				}
				}
			}
	
		
		public void printInfo() { 	// ����ο� ���� ������ �޶���
			String ekind = getKindString();
			System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade + "Conglomerate Grade" + conglomerateGrade);
		}
		
		}
