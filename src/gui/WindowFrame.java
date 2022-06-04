package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	// ������ �Լ����� ������ ����
	
	public WindowFrame() {
		this.setSize(500, 300);					// window�� ���� frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ���� â ���� �� Ŭ���� ����
		
		this.menuselection = new MenuSelection(this);
		this.employeeadder = new EmployeeAdder(this);
		this.employeeviewer = new EmployeeViewer(this);
		
		this.setupPanel(menuselection);
		//this.add(employeeadder);
		//this.add(employeeviewer);
		
		this.setVisible(true);
	}

	
	public void setupPanel(JPanel panel) {	 // panel ����
		this.getContentPane().removeAll();		// panel�� �߰��� ��Ұ� ���ŵǾ�� ��
		this.getContentPane().add(panel);		// container�� �����ͼ� �߰����� ��
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
