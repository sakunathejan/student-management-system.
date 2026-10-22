import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class ReportManagement extends JFrame{
	
	private JButton btnStuRegRep;
	private JButton btnBatchWiseRep;
	private JButton btnIndustryTrainingEligiRep;
	
	private JButton btnBack;
	
	ReportManagement(){
		setTitle("Report Management");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//==================================================================================================
		
		//Form Title
		JLabel formTitle = new JLabel("Report Management");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		//Homepage Buttons
		JPanel panelStudentManagementButtons = new JPanel();
		panelStudentManagementButtons.setLayout(new GridLayout(4,1,4,4));
		
		//**************** Student Registration Report ****************
		btnStuRegRep = new JButton("Student Registration Report");
		btnStuRegRep.setFont(new Font("", 1,20));
		
		JPanel panelBtnStuRegRep = new JPanel();
		panelBtnStuRegRep.add(btnStuRegRep);
		
		panelStudentManagementButtons.add(panelBtnStuRegRep);
		
		//**************** Batch-wise Student Report ****************
		btnBatchWiseRep = new JButton("Batch-wise Student Report");
		btnBatchWiseRep.setFont(new Font("", 1,20));
		
		JPanel panelBtnBatchWiseRep = new JPanel();
		panelBtnBatchWiseRep.add(btnBatchWiseRep);
		
		panelStudentManagementButtons.add(panelBtnBatchWiseRep);
			
		//**************** Industry Training Eligibility Report ****************
		btnIndustryTrainingEligiRep = new JButton("Industry Training Eligibility Report");
		btnIndustryTrainingEligiRep.setFont(new Font("", 1,20));
		
		JPanel panelBtnIndustryTrainingEligiRep = new JPanel();
		panelBtnIndustryTrainingEligiRep.add(btnIndustryTrainingEligiRep);
		
		panelStudentManagementButtons.add(panelBtnIndustryTrainingEligiRep);
		
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
		
		//Student Report Button Trigger		
		
		btnStuRegRep.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				StudentRegistrationReport stuRegReport = new StudentRegistrationReport();
				stuRegReport.setVisible(true);
				setVisible(false);	
			}
		});	
		
		//Batch Wise Report Button Trigger		
		
		btnBatchWiseRep.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				BatchWiseReport batchWiseRep = new BatchWiseReport();
				batchWiseRep.setVisible(true);	
				setVisible(false);
			}
		});	
		
		//Industry Training Eligibility Report Button Trigger		
		
		btnIndustryTrainingEligiRep.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				IndustryTrainingEligibilityReport industryTrainingEligibilityReport = new IndustryTrainingEligibilityReport();
				industryTrainingEligibilityReport.setVisible(true);
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
