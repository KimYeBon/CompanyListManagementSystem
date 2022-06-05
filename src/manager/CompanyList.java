package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class CompanyList {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeManage employeeManage = getObject("employeemanager.ser");	// 읽어올 파트
		if (employeeManage == null) {
			employeeManage = new EmployeeManage(input); //  객체가 없는 상태를 방지하기 위해 입력 받음
		}
		
		WindowFrame frame = new WindowFrame(employeeManage);	//	CompanyList와 gui를 연결짓기 위해 프레임 틀 생성
		
		selectMenu(input, employeeManage);	// 메뉴 실행
		putObject(employeeManage, "employeemanager.ser");	// 프로그램이 끝나면 저장
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
					logger.log("Recruit an Employee");
					break;
				
				case 2:
					employeeManage.laidOffE();
					logger.log("laid off an Employee");
					break;
				
				case 3:
					employeeManage.reshuffleE();
					logger.log("Reshuffle an Employee");
					break;
				
				case 4:
					employeeManage.viewE(); 
					logger.log("View a list of Employee");
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
	
	public static EmployeeManage getObject(String filename) {
		EmployeeManage employeeManage = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			employeeManage = (EmployeeManage) in.readObject();	// 가져온 정보 반환, Employeemanage에 정보를 넣음
			
			in.close();
			file.close(); 
		} catch (FileNotFoundException e) {
			return employeeManage;	// employeemanage의 get 파트가 없을 수 있으므로 Null값 return
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeManage;
	} 
	
	public static void putObject(EmployeeManage employeeManage, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employeeManage);	// 오브젝트를 가져와 넣어줌으로써 저장됨
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	} 
	


