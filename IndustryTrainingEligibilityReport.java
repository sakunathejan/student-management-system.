import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class IndustryTrainingEligibilityReport extends JFrame{
	
	private JTable tblStudentDetails;
	private DefaultTableModel dtm;
	
	private JButton btnBack;
	
	
	IndustryTrainingEligibilityReport(){
		setTitle("Industry Training Eligibility Report");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//==================================================================================================
		
		//Form Title 
		JLabel formTitle = new JLabel("Industry Training Eligibility Report");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		
		
		String [] columnNames = {"No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA"};
		dtm = new DefaultTableModel(columnNames,0);
		
		
		int no =1;
			for(int i=0; i<StudentCollection.studentArray.length; i++){
				double gpa = StudentCollection.calculateOverallGpa(StudentCollection.studentArray[i].getPrfMarks(), StudentCollection.studentArray[i].getDbmsMarks());
				
				if(gpa>3.25 && StudentCollection.studentArray[i].getPrfMarks() > 50 && StudentCollection.studentArray[i].getDbmsMarks() > 50){
					
					Object [] rowData = {no, StudentCollection.studentArray[i].getRegNo(), StudentCollection.studentArray[i].getStuName(), StudentCollection.studentArray[i].getNic(), StudentCollection.studentArray[i].getPrfMarks(), StudentCollection.studentArray[i].getDbmsMarks(), gpa};
					dtm.addRow(rowData);
					no++;
				}
			}
		
		tblStudentDetails = new JTable(dtm);
		JScrollPane tablePane = new JScrollPane(tblStudentDetails);
		add("Center", tablePane);
		
		//======================================================
        // BACK BUTTON
        //======================================================

        btnBack = new JButton("BACK TO HOMEPAGE");
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setPreferredSize(new Dimension(250, 40));
        
        JPanel homePageBtnPanel = new JPanel();
        homePageBtnPanel.add(btnBack);

        add(homePageBtnPanel, BorderLayout.SOUTH);
        
        //BACK BUTTON
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				ReportManagement  homePage = new ReportManagement ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
		
		
		
		
		
		
		
	}
}
