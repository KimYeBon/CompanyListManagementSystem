package employee;

import java.util.Scanner;

import Exception.GradeException;

public interface EmployeeInput {
		
	public int getID(); 		// UserInput¿¡ getID ÇÊ¿ä : 
	
	public void setID(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getDepartment();
	
	public void setDepartment(String department);
	
	public String getGrade();
	
	public void setGrade(String grade) throws GradeException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

	public void setEmployeeID(Scanner input);
	
	public void setEmployeeName(Scanner input);
	
	public void setEmployeeDepartment(Scanner input);
	
	public void setEmployeeGrade(Scanner input);
	
}	
