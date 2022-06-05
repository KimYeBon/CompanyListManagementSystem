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
		EmployeeManage employeeManage = getObject("employeemanager.ser");	// �о�� ��Ʈ
		if (employeeManage == null) {
			employeeManage = new EmployeeManage(input); //  ��ü�� ���� ���¸� �����ϱ� ���� �Է� ����
		}
		
		WindowFrame frame = new WindowFrame(employeeManage);	//	CompanyList�� gui�� �������� ���� ������ Ʋ ����
		
		selectMenu(input, employeeManage);	// �޴� ����
		putObject(employeeManage, "employeemanager.ser");	// ���α׷��� ������ ����
	}
	
	public static void selectMenu(Scanner input, EmployeeManage employeeManage) {
		int num = -1;
		while (num != 5) {
			try {							// ������ mismatch error ����
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					employeeManage.recruitE();  //EmployeeManage Ŭ�������� employeemanage ������ �����ؿ�
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
			
			employeeManage = (EmployeeManage) in.readObject();	// ������ ���� ��ȯ, Employeemanage�� ������ ����
			
			in.close();
			file.close(); 
		} catch (FileNotFoundException e) {
			return employeeManage;	// employeemanage�� get ��Ʈ�� ���� �� �����Ƿ� Null�� return
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
			
			out.writeObject(employeeManage);	// ������Ʈ�� ������ �־������ν� �����
			
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
	


