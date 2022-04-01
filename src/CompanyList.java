import java.util.Scanner;

public class CompanyList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeManage employeeManage = new EmployeeManage(input); 
		int num = 0 ;
		while (num != 6) {
			System.out.println("Welcome. This is Company List management Program.");
			System.out.println("1. Recruit Employee");
			System.out.println("2. Get laid off Employee");
			System.out.println("3. Employee Reshuffle");
			System.out.println("4. View Employee");
			System.out.println("5. Exit");
			System.out.println("SELECT one number between 1-5: ");
			
			num = input.nextInt();
			if (num==1) {
				employeeManage.recruitE();  //EmployeeManage 클래스에서 employeemanage 변수로 참조해옴
			}
			
			else if (num==2) {
				employeeManage.laidOffE();
			}
			
			else if (num==3) {
				employeeManage.reshuffleE();
			}
			
			else if (num==4) {
				employeeManage.viewE(); 
			}
		}
	}
}

