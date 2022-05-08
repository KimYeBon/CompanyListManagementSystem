package employee;

import java.util.Scanner;

public interface EmployeeInput {
		
	public int getID(); 		// UserInput¿¡ getID ÇÊ¿ä : 
	
	public void setID(int id);
	
	public void setName(String name);
	
	public void setDepartment(String department);
	
	public void setGrade(String grade);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

	
	
}	
