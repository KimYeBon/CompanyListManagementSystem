package employee;

import java.util.Scanner;

import Exception.GradeException;

public abstract class FortyEmployee extends Employee {

	public FortyEmployee(EmployeeKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input); // �޴� ������ ���� �ٸ��Ƿ� �ٸ��� ���

	@Override
	public void printInfo() {
		String ekind = getKindString();
		System.out.println("kind: " + ekind + "ID:" + name + " name:" + id + " Department:" + department + " Grade:" + grade);
	}
	
	public void setEmployeeGradewithYN(Scanner input) { 	// ���� ���� �޴� ��Ʈ �ܼ�ȭ
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer  != 'N')
		{ 
			System.out.print("������ �����մϱ�? Y/N�� �Է��Ͻÿ�. : ");
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
				System.out.println("������ �Բ� <n��>�� �������� �Է��Ͻÿ�.");
			}
		}
	}

}
