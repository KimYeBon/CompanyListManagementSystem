package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.EmployeeViewer;
import gui.WindowFrame;
import manager.EmployeeManage;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;		// �����ڿ��� �Ű����� frame�� �޾������ν� �ش� �����ڰ� frame�� �̿��� �� �ְ� ��
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EmployeeViewer employeeViewer = frame.getEmployeeviewer(); 	
		EmployeeManage employeeManage = getObject("EmployeeManager.ser");
//			JButton b = (JButton) e.getSource();
		employeeViewer.setEmployeeManage(employeeManage);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(employeeViewer);
		frame.revalidate();
		frame.repaint();
//		frame.setupPanel(viewer);
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
	
}
