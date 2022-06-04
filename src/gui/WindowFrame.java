package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	// 생성자 함수에서 생성할 예쩡
	
	public WindowFrame() {
		this.setSize(500, 300);					// window를 띄우는 frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 종료 창 선택 시 클래스 종료
		
		this.menuselection = new MenuSelection(this);
		this.employeeadder = new EmployeeAdder(this);
		this.employeeviewer = new EmployeeViewer(this);
		
		this.setupPanel(menuselection);
		//this.add(employeeadder);
		//this.add(employeeviewer);
		
		this.setVisible(true);
	}

	
	public void setupPanel(JPanel panel) {	 // panel 삽입
		this.getContentPane().removeAll();		// panel에 추가된 요소가 제거되어야 함
		this.getContentPane().add(panel);		// container를 가져와서 추가시켜 줌
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public EmployeeAdder getEmployeeadder() {
		return employeeadder;
	}


	public void setEmployeeadder(EmployeeAdder employeeadder) {
		this.employeeadder = employeeadder;
	}


	public EmployeeViewer getEmployeeviewer() {
		return employeeviewer;
	}


	public void setEmployeeviewer(EmployeeViewer employeeviewer) {
		this.employeeviewer = employeeviewer;
	}


	MenuSelection menuselection;
	EmployeeAdder employeeadder;
	EmployeeViewer employeeviewer;	
}
