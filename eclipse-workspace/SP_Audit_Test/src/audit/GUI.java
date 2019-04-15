package audit;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener{
	
	private static final JFrame myFrame = new JFrame("Audit");
	private JPanel topLeftPanel, topRightPanel;
	
	public GUI() {
		
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout());
        
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

        topRightPanel = new JPanel(new GridBagLayout());
        topRightPanel.setBorder(BorderFactory.createEmptyBorder());
        myFrame.add(topRightPanel, BorderLayout.CENTER);
        
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonConstraints.insets = new Insets(10, 10, 10, 10);
        buttonConstraints.weighty = 1;
        buttonConstraints.gridy = 0;
        
        JButton audit = new JButton("New Audit");
        topRightPanel.add(audit, buttonConstraints);
        audit.addActionListener(this);
        
        JButton display = new JButton("Display Audits");
        buttonConstraints.gridy++;
        topRightPanel.add(display, buttonConstraints);
        display.addActionListener(this);
		
        myFrame.pack();
        myFrame.setVisible(true);
	}
	
    public void init_newAudit() {
    	
    	
	        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        myFrame.setLayout(new BorderLayout());
	
	        topLeftPanel = new JPanel(new GridBagLayout());
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
	
	        topRightPanel = new JPanel(new GridBagLayout());
	        topRightPanel.setBorder(BorderFactory.createEmptyBorder());
	        myFrame.add(topRightPanel, BorderLayout.EAST);
	        
	        GridBagConstraints buttonConstraints = new GridBagConstraints();
	        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
	        buttonConstraints.insets = new Insets(10, 10, 10, 10);
	        buttonConstraints.weighty = 1;
	        buttonConstraints.gridy = 0;
	        
	        JButton saveAudit = new JButton("Save");
	        topRightPanel.add(saveAudit, buttonConstraints);
	        saveAudit.addActionListener(this);
	        
	        JButton observe = new JButton("Observations");
	        buttonConstraints.gridy++;
	        topRightPanel.add(observe, buttonConstraints);
	        observe.addActionListener(this);
	
	        myFrame.pack();
	        myFrame.setVisible(true);
    	}
    
    public void init_newObservation() {
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout());

        topLeftPanel = new JPanel(new GridBagLayout());
        myFrame.add(topLeftPanel, BorderLayout.CENTER);
        topLeftPanel.setBorder(BorderFactory.createTitledBorder("Observation"));
        
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
        
        //
        topLeftPanel.add(new JLabel("(Page/Item/Ref) No."), labelConstraints);
        JTextField PageField = new JTextField(10);
        topLeftPanel.add(PageField, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Environment"), labelConstraints);
        JComboBox<String> EnvSelect = new JComboBox<>(new String[] { "TQA01", "TQA02", "PROD"});
        fieldConstraints.gridy++;
        topLeftPanel.add(EnvSelect, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Browser"), labelConstraints);
        JComboBox<String> BrowserSelect = new JComboBox<>(new String[] { "Chrome", "IE", "Edge", "FireFox", "Chrome & IE", "All"});
        fieldConstraints.gridy++;
        topLeftPanel.add(BrowserSelect, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Topic"), labelConstraints);
        JTextField TopicField = new JTextField(10);
        fieldConstraints.gridy++;
        topLeftPanel.add(TopicField, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Issue"), labelConstraints);
        JTextArea IssueField = new JTextArea(5, 20);
        IssueField.setLineWrap(true);
        
        JScrollPane IssueText = new JScrollPane(IssueField);
        IssueText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        fieldConstraints.gridy++;
        topLeftPanel.add(IssueText, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Suggested Correction"), labelConstraints);
        JTextArea CorrectField = new JTextArea(5, 20);
        CorrectField.setLineWrap(true);
        
        JScrollPane CorrectText = new JScrollPane(CorrectField);
        CorrectText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        fieldConstraints.gridy++;
        topLeftPanel.add(CorrectText, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Response/Notes"), labelConstraints);
        JTextArea ResponseField = new JTextArea(5, 20);
        ResponseField.setLineWrap(true);
        
        JScrollPane ResponseText = new JScrollPane(ResponseField);
        ResponseText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        fieldConstraints.gridy++;
        topLeftPanel.add(ResponseText, fieldConstraints);
        labelConstraints.gridy++;
        
        //
        topLeftPanel.add(new JLabel("Status"), labelConstraints);
        JComboBox<String> StatusSelect = new JComboBox<>(new String[] {"Open", "Closed", "Investigate"});
        fieldConstraints.gridy++;
        topLeftPanel.add(StatusSelect, fieldConstraints);
        labelConstraints.gridy++;

        topRightPanel = new JPanel(new GridBagLayout());
        topRightPanel.setBorder(BorderFactory.createEmptyBorder());
        myFrame.add(topRightPanel, BorderLayout.EAST);
        
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonConstraints.insets = new Insets(10, 10, 10, 10);
        buttonConstraints.weighty = 1;
        buttonConstraints.gridy = 0;
        
        JButton nextObservation = new JButton("Next");
        topRightPanel.add(nextObservation, buttonConstraints);
        nextObservation.addActionListener(this);
        
        JButton finishObservations = new JButton("Finish");
        buttonConstraints.gridy++;
        topRightPanel.add(finishObservations, buttonConstraints);
        finishObservations.addActionListener(this);

        myFrame.pack();
        myFrame.setVisible(true);
	}
    
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New Audit"))
		{
			myFrame.remove(topRightPanel);
			init_newAudit();
		}
		else if (e.getActionCommand().equals("Display Audits"))
		{
			System.out.println("Display");
		}
		else if (e.getActionCommand().equals("Save"))
		{
			System.out.println("Save Audit info");
		}
		else if (e.getActionCommand().equals("Observations"))
		{
			myFrame.remove(topRightPanel);
			myFrame.remove(topLeftPanel);
			init_newObservation();
		}
		if (e.getActionCommand().equals("Next"))
		{
			System.out.println("Save Observation");
			myFrame.remove(topRightPanel);
			myFrame.remove(topLeftPanel);
			init_newObservation();
			
		}
		if (e.getActionCommand().equals("Finish"))
		{
			System.out.println("Save Observations with Audit info");
		}
	}
	
    public static void main(String[] args)
    {   
        /*
         * This is the most important part ofyour GUI app, never forget 
         * to schedule a job for your event dispatcher thread : 
         * by calling the function, method or constructor, responsible
         * for creating and displaying your GUI.
         */
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new GUI();
            }
        });
    }
}
