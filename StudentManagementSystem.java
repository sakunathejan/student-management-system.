import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;


class HomePage extends JFrame {
	
	private JButton btnStudentManagement;
	private JButton btnBatchManagement;
	private JButton btnGradeManagement;
	private JButton btnReportManagement;
	
	

	HomePage() {

		setTitle("Student Management System");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//==================================================================================================
		
		//Form Title 
		JLabel formTitle = new JLabel("ICET Learning Management System");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		
		//========== Homepage Buttons ============
		JPanel panelHomeBtn = new JPanel();setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		panelHomeBtn.setLayout(new GridLayout(4,1,4,4));
		
		//**************** Student Management Button ****************
		btnStudentManagement = new JButton("Student Management");
		btnStudentManagement.setFont(new Font("", 1,20));
		
		JPanel panelBtnStudentManagement = new JPanel();
		panelBtnStudentManagement.add(btnStudentManagement);
		
		panelHomeBtn.add(panelBtnStudentManagement);
		
		
		//**************** Batch Management Button ****************
		btnBatchManagement = new JButton("Batch Management");
		btnBatchManagement.setFont(new Font("", 1,20));
		
		JPanel panelBtnBatchManagement = new JPanel();
		panelBtnBatchManagement.add(btnBatchManagement);
		
		panelHomeBtn.add(panelBtnBatchManagement);
			
		//**************** Grade Management Button ****************
		btnGradeManagement = new JButton("Grade Management");
		btnGradeManagement.setFont(new Font("", 1,20));
		
		JPanel panelBtnGradeManagement = new JPanel();
		panelBtnGradeManagement.add(btnGradeManagement);
		
		panelHomeBtn.add(panelBtnGradeManagement);
			
		//**************** Report Management Button ****************
		btnReportManagement = new JButton("Report Management");
		btnReportManagement.setFont(new Font("", 1,20));
		
		JPanel panelBtnReportManagement = new JPanel();
		panelBtnReportManagement.add(btnReportManagement);
		
		panelHomeBtn.add(panelBtnReportManagement);
		
		add(panelHomeBtn);	
		
		//=============== Home Page Button Trigger ===============
		
		//Student Management Button Trigger		
		
		btnStudentManagement.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				StudentManagement studentManagement = new StudentManagement();
				studentManagement.setVisible(true);
				setVisible(false);
			}
		});
		
		//Batch Management Button Trigger				
		
		btnBatchManagement.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				BatchManagement batchManagement = new BatchManagement();
				batchManagement.setVisible(true);
				setVisible(false);	
			}
		});
		
		//Grade Management Button Trigger				
		
		btnGradeManagement.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				GradeManagement gradeManagement = new GradeManagement();
				gradeManagement.setVisible(true);
				setVisible(false);
			}
		});
		
		//Report Management Button Trigger				
		
		btnReportManagement.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ReportManagement reportManagement = new ReportManagement();
				reportManagement.setVisible(true);
				setVisible(false);
			}
		});		
		
	}
}

class StudentManagementSystem {

	public static void main(String[] args) {

		HomePage f1 = new HomePage();
		f1.setVisible(true);
	}
}
