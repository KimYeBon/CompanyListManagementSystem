package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import employee.EmployeeInput;
import manager.EmployeeManage;

public class EmployeeViewer extends JPanel {
	
	WindowFrame frame;

	EmployeeManage employeeManage;	//	employeemanage ������ ���� ��
	
	public EmployeeViewer(WindowFrame frame, EmployeeManage employeeManage) {
		this.frame = frame;
		this.employeeManage = employeeManage;
		
		System.out.println("***" + employeeManage.size() + "*** \n");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Department");
		model.addColumn("Grade");
		
		for (int i=0; i<employeeManage.size(); i++) {
			Vector row = new Vector();
			EmployeeInput ei = employeeManage.get(i);
			row.add(ei.getID());
			row.add(ei.getName());
			row.add(ei.getDepartment());
			row.add(ei.getGrade());
			model.addRow(row);		// row�� model�� �߰���Ŵ���ν� �����Ͱ� ���� ��
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
