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
			System.out.println("SELECT one number between 1-6: ");
			
			num = input.nextInt();
			if (num==1) {
				recruitE();
			}
			
			else if (num==2) {
				laidOffE();
			}
			
			else if (num==3) {
				reshuffleE();
			}
			
			else if (num==4) {
				viewE();
			}
		}
	}

	public static void recruitE() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee ID: ");
		int employeeId = input.nextInt();
		System.out.print("Employee Name: ");
		String employeeName = input.next();
		System.out.print("Employee ID: ");
		String employeeDepartment = input.next();
		System.out.print("Employee ID: ");
		String employeeGrade = input.next();
	}
	
	public static void laidOffE() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee ID: ");
		int studentId = input.nextInt();
	}
		
	public static void reshuffleE() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee ID: ");
		int studentId = input.nextInt();
	}
			
	public static void viewE() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee ID: ");
		int studentId = input.nextInt();
	}
}
