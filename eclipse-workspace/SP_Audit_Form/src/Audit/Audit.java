package Audit;
import java.awt.*;
import Excel.*;
import java.awt.event.*;
import javax.swing.*;


public class Audit {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Audit::initGUI);
    }

    public static void initGUI() {
        JFrame myFrame = new JFrame("Audit");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout());

        JPanel topLeftPanel = new JPanel(new GridBagLayout());
        myFrame.add(topLeftPanel, BorderLayout.CENTER);
        topLeftPanel.setBorder(BorderFactory.createTitledBorder("Audit Information"));
        
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.anchor = GridBagConstraints.WEST;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.weightx = 0.5;
        labelConstraints.weighty = 1;
        labelConstraints.insets = new Insets(5, 10, 5, 10);
        
        GridBagConstraints fieldConstraints = new GridBagConstraints();
        fieldConstraints.anchor = GridBagConstraints.WEST;
        fieldConstraints.gridx = 1;
        fieldConstraints.gridy = 0;
        fieldConstraints.weightx = 0.5;
        fieldConstraints.weighty = 1;
        fieldConstraints.insets = new Insets(5, 10, 5, 10);
        
        topLeftPanel.add(new JLabel("Project/Process/Deliverable      MNPDEV-"), labelConstraints);
        JTextField ProjectField = new JTextField(10);
        topLeftPanel.add(ProjectField, fieldConstraints);
        labelConstraints.gridy++;
        
        topLeftPanel.add(new JLabel("Category"), labelConstraints);
        JComboBox<String> CategSelect = new JComboBox<>(new String[] { "Notification", "Assignment, Leave, Travel", "Retirement and Separation", "Advancement Dashboard", "MyRecord", "Knowledge Management", "Training, Education, Qualification" });
        fieldConstraints.gridy++;
        topLeftPanel.add(CategSelect, fieldConstraints);
        labelConstraints.gridy++;
        
        topLeftPanel.add(new JLabel("Summary"), labelConstraints);
        JTextArea summaryField = new JTextArea(5, 20);
        summaryField.setLineWrap(true);
        
        JScrollPane summaryText = new JScrollPane(summaryField);
        summaryText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        fieldConstraints.gridy++;
        topLeftPanel.add(summaryText, fieldConstraints);
        labelConstraints.gridy++;
        
        topLeftPanel.add(new JLabel("User Role"), labelConstraints);
        JComboBox<String> roleSelect = new JComboBox<>(new String[] { "Admin", "Basic User", "E3 - E6", "Staff / Supervisor"});
        fieldConstraints.gridy++;
        topLeftPanel.add(roleSelect, fieldConstraints);
        labelConstraints.gridy++;
        
        topLeftPanel.add(new JLabel("Project Manager / Lead"), labelConstraints);
        JTextField leadField = new JTextField(10);
        fieldConstraints.gridy++;
        topLeftPanel.add(leadField, fieldConstraints);
        labelConstraints.gridy++;
        
        topLeftPanel.add(new JLabel("Auditor"), labelConstraints);
        JTextField authorField = new JTextField(10);
        fieldConstraints.gridy++;
        topLeftPanel.add(authorField, fieldConstraints);
        labelConstraints.gridy++;

        JPanel topRightPanel = new JPanel(new GridBagLayout());
        topRightPanel.setBorder(BorderFactory.createEmptyBorder());
        myFrame.add(topRightPanel, BorderLayout.EAST);
        
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonConstraints.insets = new Insets(10, 10, 10, 10);
        buttonConstraints.weighty = 1;
        buttonConstraints.gridy = 0;
        
        JButton audit = new JButton("New Audit");
        topRightPanel.add(audit, buttonConstraints);
        audit.addActionListener(excelutils.MyActionListener(ProjectField, CategSelect, summaryField, roleSelect, leadField, authorField));
        
        JButton observe = new JButton("Observations");
        buttonConstraints.gridy++;
        topRightPanel.add(observe, buttonConstraints);

        myFrame.pack();
        myFrame.setVisible(true);
    	}
    }
