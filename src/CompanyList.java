import java.util.Scanner;

public class CompanyList {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("Welcome. This is Company List management Program.");
			System.out.println("1. Recruit Employee");
			System.out.println("2. Get laid off Employee");
			System.out.println("3. Employee Reshuffle");
			System.out.println("4. View Employee");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("SELECT ont number between 1-6: ");
			
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Employee ID: ");
				int employeeId = input.nextInt();
				System.out.print("Employee Name: ");
				String employeeName = input.next();
				input.nextLine();
				System.out.print("Employee Department: ");
				String employeedepartment = input.nextLine();
				System.out.print("Employee Job grage: ");
				String employeeGrade = input.nextLine();
				break;
				
			case 2:
				System.out.print("Employee ID: ");
				int employeeId2 = input.nextInt();
				break;
				
			case 3:
				System.out.print("Employee ID: ");
				int employeeId3 = input.nextInt();
				break;
				
			case 4:
				System.out.print("Employee ID: ");
				int employeeId4 = input.nextInt();
				break;
				
			case 5:
				
			case 6:
				System.out.println("Terminate Program.");
				break;
			}
		}

	}
}
