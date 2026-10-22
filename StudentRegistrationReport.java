import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class StudentRegistrationReport extends JFrame{
	
	private JTable tblStudentDetails;
	private DefaultTableModel dtm;
	
	private JButton btnBack;
	
	StudentRegistrationReport(){
		
		setTitle("Student Registration Report");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Form Title 
		JLabel formTitle = new JLabel("Student Registration Report");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		
		
		String [] columnNames = {"No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA"};
		dtm = new DefaultTableModel(columnNames,0);
		
		
		int n = StudentCollection.studentArray.length;
			
		int [] index = new int[n];
		for(int i=0; i<n; i++){
			index[i] = i;
		}
		
		
		for(int i=0; i<StudentCollection.studentArray.length-1; i++){
			for(int j=0; j<n-1-i;j++){
				Student name1 = StudentCollection.studentArray[index[j]];
				Student name2 = StudentCollection.studentArray[index[j+1]];
				
			
				if(name1.getStuName().compareToIgnoreCase(name2.getStuName())>0){
					int temp = index[j];
					index[j] = index[j+1];
					index[j+1] =temp;
				}
			}
		}
		
		int no=1;
		for(int i=0; i<n; i++){
			int id = index[i];
			double gpa = StudentCollection.calculateOverallGpa(StudentCollection.studentArray[id].getPrfMarks(), StudentCollection.studentArray[id].getDbmsMarks());
			
			Object [] rowData = {i+1, StudentCollection.studentArray[id].getRegNo(), StudentCollection.studentArray[id].getStuName(), StudentCollection.studentArray[id].getNic(), StudentCollection.studentArray[id].getPrfMarks(), StudentCollection.studentArray[id].getDbmsMarks(), gpa};
			dtm.addRow(rowData);
			
			no++;
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
