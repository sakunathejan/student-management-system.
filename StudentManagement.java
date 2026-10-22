import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class StudentManagement extends JFrame{
	
	private JButton btnAddStudent;
	private JButton btnUpdateStudent;
	private JButton btnViewStudentProfile;
	private JButton btnDeleteStudentProfile;
	private JButton btnBackButton;
	private JButton btnBack;
	
	StudentManagement(){
		setTitle("Student Management");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//==================================================================================================
		
		//Form Title
		JLabel formTitle = new JLabel("Student Management");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		//Homepage Buttons
		JPanel panelStudentManagementButtons = new JPanel();
		panelStudentManagementButtons.setLayout(new GridLayout(4,1,4,4));
		
		//**************** Add Students ****************
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.setFont(new Font("", 1,20));
		
		JPanel panelBtnAddStudent = new JPanel();
		panelBtnAddStudent.add(btnAddStudent);
		
		panelStudentManagementButtons.add(panelBtnAddStudent);
		
		//**************** Update Student ****************
		btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.setFont(new Font("", 1,20));
		
		JPanel panelBtnUpdateStudent = new JPanel();
		panelBtnUpdateStudent.add(btnUpdateStudent);
		
		panelStudentManagementButtons.add(panelBtnUpdateStudent);
			
		//**************** View Student Profile ****************
		btnViewStudentProfile = new JButton("View Student Profile");
		btnViewStudentProfile.setFont(new Font("", 1,20));
		
		JPanel panelBtnViewStudentProfile = new JPanel();
		panelBtnViewStudentProfile.add(btnViewStudentProfile);
		
		panelStudentManagementButtons.add(panelBtnViewStudentProfile);
			
		//**************** Delete Student Profile ****************
		btnDeleteStudentProfile = new JButton("Delete Student Profile");
		btnDeleteStudentProfile.setFont(new Font("", 1,20));
		
		JPanel panelBtnDeleteStudentProfile = new JPanel();
		panelBtnDeleteStudentProfile.add(btnDeleteStudentProfile);
		
		panelStudentManagementButtons.add(panelBtnDeleteStudentProfile);
		
		add(panelStudentManagementButtons);	
		
		//======================================================
        // BACK BUTTON
        //======================================================

        btnBack = new JButton("Back to Main Menu");
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setPreferredSize(new Dimension(250, 40));
        
        JPanel homePageBtnPanel = new JPanel();
        homePageBtnPanel.add(btnBack);

        add(homePageBtnPanel, BorderLayout.SOUTH);	
		
		//=============== Button Trigger ===============
		
		//Add Student Button Trigger		
		
		btnAddStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				AddStudent addStudent = new AddStudent();
				addStudent.setVisible(true);
				setVisible(false);	
			}
		});	
		
		//Update Student Button Trigger		
		
		btnUpdateStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				UpdateStudent updateStudent = new UpdateStudent();
				updateStudent.setVisible(true);	
				setVisible(false);
			}
		});	
		
		//View Student Details Button Trigger		
		
		btnViewStudentProfile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ViewStudentProfile viewStudentProfile = new ViewStudentProfile();
				viewStudentProfile.setVisible(true);
				setVisible(false);	
			}
		});	
		
		//Delete Student Details Button Trigger		
		
		btnDeleteStudentProfile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				DeleteStudentProfile deleteStudentProfile = new DeleteStudentProfile();
				deleteStudentProfile.setVisible(true);
				setVisible(false);
			}
		});		
		
        
        //BACK BUTTON
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				HomePage  homePage = new HomePage ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});	
		
		
	}
}
