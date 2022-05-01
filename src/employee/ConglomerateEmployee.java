package employee;

import java.util.Scanner;

public class ConglomerateEmployee extends Employee {	// Employee�� ��� ���� ����
	
		protected String conglomerateGrade;
		
		public ConglomerateEmployee(EmployeeKind kind) {
			super(kind);	// �� ������
		}
		
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
				System.out.print("���� ���� ������ �����ϱ�? Y/N�� �Է��Ͻÿ�. : ");
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
			
			answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
				System.out.print("����� ���� ������ �����ϱ�? Y/N�� �Է��Ͻÿ�. : ");
				answer = input.next().charAt(0);
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Conglomerate Employee Grade: ");
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
		
		public void printInfo() { 	// ����ο� ���� ������ �޶���
			String skind = "none";
			switch(this.kind) {
			case SmallBusiness:
				skind = "Small Business's Employee";
				break;
			case Startup:
				skind = "StartUp's Employee";
				break;
			case PublicEnterprise:
				skind = "Public Enterprise's Employee";
				break;
			case Conglomerate:
				skind = "CongLomerate's Employee";
				break;
			default:
			
			}
			System.out.println("kind: " + skind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade + "Conglomerate Grade" + conglomerateGrade);
		}
	}
