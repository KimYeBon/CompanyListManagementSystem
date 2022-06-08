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
		this.frame = frame;		// 생성자에서 매개변수 frame을 받아줌으로써 해당 생성자가 frame을 이용할 수 있게 됨
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
	
}
