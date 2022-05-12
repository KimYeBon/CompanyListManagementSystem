import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeManage employeeManage = new EmployeeManage(input); 
		selectMenu(input, employeeManage);
	}
	
	public static void selectMenu(Scanner input, EmployeeManage employeeManage) {
		int num = -1;
		while (num != 5) {
			try {							// 정수의 mismatch error 방지
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					employeeManage.recruitE();  //EmployeeManage 클래스에서 employeemanage 변수로 참조해옴
					break;
				
				case 2:
					employeeManage.laidOffE();
					break;
				
				case 3:
					employeeManage.reshuffleE();
					break;
				
				case 4:
					employeeManage.viewE(); 
					break;
				
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("\n Please put an Integer between 1 to 5 \n");
				if (input.hasNext()) {
					input.next();
				}
				num= -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Welcome. This is Company List management Program. \n");
		System.out.println("1. Recruit Employee");
		System.out.println("2. Get laid off Employee");
		System.out.println("3. Employee Reshuffle");
		System.out.println("4. View Employees");
		System.out.println("5. Exit \n");
		System.out.println("SELECT one number between 1-5: ");
	}
}

