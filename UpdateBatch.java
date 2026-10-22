import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class UpdateBatch extends JFrame{
	
		private JTextField txtSearchBox; 
		private JTextField txtStuNic; 	
		private JTextField txtStuName; 
		private JTextField txtStudentCount; 
			
		private JButton btnSearch; 
		private JButton btnUpdate; 
		private JButton btnCancel; 
	
	UpdateBatch(){
		setTitle("Update Batch");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// JFrame uses BorderLayout
		setLayout(new BorderLayout());


		// ==========================================================
		// NORTH - TITLE + SEARCH
		// ==========================================================

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));

		// ---------------- TITLE ----------------

		JLabel formTitle = new JLabel("Update Batch");
		formTitle.setFont(new Font("", Font.BOLD, 25));
		formTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Add some space around title
		northPanel.add(Box.createVerticalStrut(15));
		northPanel.add(formTitle);
		northPanel.add(Box.createVerticalStrut(20));


		// ---------------- SEARCH ----------------

		JPanel searchPanel = new JPanel(new GridBagLayout());

		GridBagConstraints searchGbc = new GridBagConstraints();
		searchGbc.insets = new Insets(5, 5, 5, 5);
		searchGbc.fill = GridBagConstraints.HORIZONTAL;


		// Search Text Field
		txtSearchBox = new JTextField();
		txtSearchBox.setFont(new Font("", Font.BOLD, 18));
		txtSearchBox.setPreferredSize(new Dimension(335, 35));

		searchGbc.gridx = 0;
		searchGbc.gridy = 0;

		searchPanel.add(txtSearchBox, searchGbc);


		// Search Button
		btnSearch = new JButton("SEARCH");
		btnSearch.setFont(new Font("", Font.BOLD, 18));
		btnSearch.setPreferredSize(new Dimension(195, 35));

		searchGbc.gridx = 1;
		searchGbc.gridy = 0;

		searchPanel.add(btnSearch, searchGbc);


		// Add search panel to north panel
		northPanel.add(searchPanel);

		northPanel.add(Box.createVerticalStrut(15));


		// Add everything to NORTH
		add(northPanel, BorderLayout.NORTH);
		
		//======================================================
		//                  UPDATE SECTION
		//======================================================

		JPanel mainViewStudentPanel = new JPanel(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(8, 10, 8, 10);
		gbc.anchor = GridBagConstraints.WEST;


		//======================================================
		//                  STUDENT COUNT
		//======================================================

		JLabel lblName = new JLabel("Student Count");
		lblName.setFont(new Font("", Font.BOLD, 18));

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		mainViewStudentPanel.add(lblName, gbc);


		// Text Field
		txtStudentCount = new JTextField(12);
		txtStudentCount.setFont(new Font("", Font.BOLD, 18));
		txtStudentCount.setHorizontalAlignment(JTextField.CENTER);

		gbc.gridx = 1;
		gbc.gridy = 0;
		mainViewStudentPanel.add(txtStudentCount, gbc);


		//======================================================
		//                  CURRENT STATUS
		//======================================================

		JLabel lblStatus = new JLabel("Current Status");
		lblStatus.setFont(new Font("", Font.BOLD, 18));

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		mainViewStudentPanel.add(lblStatus, gbc);


		//======================================================
		//                  ENROLLMENT OPEN
		//======================================================

		JCheckBox chkEnrollmentOpen = new JCheckBox("ENROLLMENT OPEN");
		chkEnrollmentOpen.setFont(new Font("", Font.BOLD, 16));

		gbc.gridx = 1;
		gbc.gridy = 1;
		mainViewStudentPanel.add(chkEnrollmentOpen, gbc);


		//======================================================
		//                  ENROLLMENT CLOSED
		//======================================================

		JCheckBox chkEnrollmentClosed = new JCheckBox("ENROLLMENT CLOSED");
		chkEnrollmentClosed.setFont(new Font("", Font.BOLD, 16));

		gbc.gridx = 2;
		gbc.gridy = 1;
		mainViewStudentPanel.add(chkEnrollmentClosed, gbc);


		//======================================================
		//                  CHECKBOX GROUP
		//======================================================

		ButtonGroup statusGroup = new ButtonGroup();
		statusGroup.add(chkEnrollmentOpen);
		statusGroup.add(chkEnrollmentClosed);


		// Add main panel to frame
		add(mainViewStudentPanel, BorderLayout.CENTER);
		
		
		
		// =========================================================
		// BOTTOM BUTTONS
		// =========================================================

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 15));


		// Cancel

		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("", Font.BOLD, 18));
		btnCancel.setPreferredSize(new Dimension(195, 40));

		btnCancel.setBackground(new Color(160, 165, 195));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFocusPainted(false);


		// Update

		btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("", Font.BOLD, 18));
		btnUpdate.setPreferredSize(new Dimension(195, 40));

		btnUpdate.setBackground(new Color(35, 50, 130));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFocusPainted(false);


		buttonPanel.add(btnCancel);
		buttonPanel.add(btnUpdate);

		add(buttonPanel, BorderLayout.SOUTH);
		
		mainViewStudentPanel.setVisible(false);
		
		
		//SEARCH BUTTON
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String searchedBatchNo = txtSearchBox.getText();
				
				if(txtSearchBox.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Field cannot be empty");
					return;
				}else if(BatchCollection.isAvailable(searchedBatchNo)){
					
					int count = StudentCollection.countStudentInBatch(searchedBatchNo);
					String batchCount = Integer.toString(count);
					
					txtStudentCount.setText(batchCount);
					
					mainViewStudentPanel.setVisible(true);
					
					if(BatchCollection.checkStatus(searchedBatchNo) == 1){
						
						chkEnrollmentOpen.setSelected(true);						
						chkEnrollmentClosed.setSelected(false);
						
					}else if(BatchCollection.checkStatus(searchedBatchNo) == 0){
						
						chkEnrollmentClosed.setSelected(true);
						chkEnrollmentOpen.setSelected(false);
					}
					
					
				}else{
					JOptionPane.showMessageDialog(null,"This Batch does not exist in the system");
				}
				
				
				
			}
		});
		
		//UPDATE BUTTON
		btnUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String searchedBatchNo = txtSearchBox.getText();
				
				if(	chkEnrollmentOpen.isSelected()){
					
					BatchCollection.setStatus(1,searchedBatchNo);					
					JOptionPane.showMessageDialog(null,"Batch Updated Successfully");
					DisplayMessageUpdateBatch batch = new DisplayMessageUpdateBatch(searchedBatchNo);
					batch.setVisible(true);
					setVisible(false);
					
				}else if(chkEnrollmentClosed.isSelected()){
					
					BatchCollection.setStatus(0, searchedBatchNo);
					JOptionPane.showMessageDialog(null,"Batch Updated Successfully");
					DisplayMessageUpdateBatch batch = new DisplayMessageUpdateBatch(searchedBatchNo);
					batch.setVisible(true);
					setVisible(false);
				}
			}
		});
		
		//CANCEL BUTTON
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				BatchManagement batch = new BatchManagement();
				batch.setVisible(true);
				setVisible(false);				
				
			}
		});
		
	}
	
}
