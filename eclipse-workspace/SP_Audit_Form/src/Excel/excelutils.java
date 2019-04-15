package Excel;

import Audit.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class excelutils implements ActionListener {
	private static JTextField project, lead, author;
	private static JComboBox<String> categ, role;
	private static JTextArea summary;


	public static ActionListener MyActionListener(JTextField projectField, JComboBox<String> categSelect,
			JTextArea summaryField, JComboBox<String> roleSelect, JTextField leadField, JTextField authorField) {
		project = projectField;
		categ = categSelect;
		summary = summaryField;
		role = roleSelect;
		lead = leadField;
		author = authorField;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
