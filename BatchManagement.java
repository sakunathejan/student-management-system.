import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class BatchManagement extends JFrame{
	
	private JButton btnAddBatch;
	private JButton btnUpdateBatch;
	private JButton btnViewBatchDetails;
	private JButton btnBack;
	
	BatchManagement(){
		setTitle("Batch Management");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//==================================================================================================
		
		//Form Title
		JLabel formTitle = new JLabel("Batch Management");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		//Homepage Buttons
		JPanel panelBatchManagementButtons = new JPanel();
		panelBatchManagementButtons.setLayout(new GridLayout(4,1,4,4));
		
		//**************** Add Batches ****************
		btnAddBatch = new JButton("Add Batches");
		btnAddBatch.setFont(new Font("", 1,20));
		
		JPanel panelBtnAddBatch = new JPanel();
		panelBtnAddBatch.add(btnAddBatch);
		
		panelBatchManagementButtons.add(panelBtnAddBatch);
		
		//**************** Update Batches ****************
		btnUpdateBatch = new JButton("Update Batches");
		btnUpdateBatch.setFont(new Font("", 1,20));
		
		JPanel panelBtnUpdateBatch = new JPanel();
		panelBtnUpdateBatch.add(btnUpdateBatch);
		
		panelBatchManagementButtons.add(panelBtnUpdateBatch);
			
		//**************** View Student Profile ****************
		btnViewBatchDetails = new JButton("View Batch Details");
		btnViewBatchDetails.setFont(new Font("", 1,20));
		
		JPanel panelBtnViewBatchDetails = new JPanel();
		panelBtnViewBatchDetails.add(btnViewBatchDetails);
		
		panelBatchManagementButtons.add(panelBtnViewBatchDetails);
		
		add(panelBatchManagementButtons);
		
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
		
		//Add Batch Button Trigger		
		
		btnAddBatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				AddBatch addBatch = new AddBatch();
				addBatch.setVisible(true);
				setVisible(false);	
			}
		});	
		
		//Update Batch Button Trigger		
		
		btnUpdateBatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				UpdateBatch updateBatch = new UpdateBatch();
				updateBatch.setVisible(true);	
				setVisible(false);
			}
		});	
		
		//View Batch Details Button Trigger		
		
		btnViewBatchDetails.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ViewBatchDetails viewBatchDetails = new ViewBatchDetails();
				viewBatchDetails.setVisible(true);
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
