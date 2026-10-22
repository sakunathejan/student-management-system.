import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class UpdateStudent extends JFrame{
	private JTextField txtSearchBox; 
	private JTextField txtStuNic; 	
	private JTextField txtStuName; 
		
	private JButton btnSearch; 
	private JButton btnUpdate; 
	private JButton btnCancel; 
	private JButton btnUpdateId; 
	private JButton btnUpdateName; 
	
	private JPanel centerPanel;
	private CardLayout cardLayout;
	
	private boolean updateNicMode = false;
	private boolean updateNameMode = false;
	
	
	UpdateStudent(){
		setTitle("Update Student");
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

		JLabel formTitle = new JLabel("Update Student");
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


		// =========================================================
		// UPDATE SECTION
		// =========================================================

		JPanel panelUpdate = new JPanel(new GridLayout(2, 1, 0, 10));


		// =========================================================
		// NIC PANEL
		// =========================================================

		JPanel nicPanel = new JPanel(new GridBagLayout());

		GridBagConstraints nicGbc = new GridBagConstraints();
		nicGbc.insets = new Insets(10, 10, 10, 10);
		nicGbc.anchor = GridBagConstraints.CENTER;


		// NIC LABEL
		JLabel lblNic = new JLabel("NIC");
		lblNic.setFont(new Font("", Font.BOLD, 18));

		nicGbc.gridx = 0;
		nicGbc.gridy = 0;

		nicPanel.add(lblNic, nicGbc);


		// NIC TEXT FIELD
		txtStuNic = new JTextField();
		txtStuNic.setFont(new Font("", Font.BOLD, 18));
		txtStuNic.setPreferredSize(new Dimension(215, 35));

		nicGbc.gridx = 1;
		nicGbc.gridy = 0;

		nicPanel.add(txtStuNic, nicGbc);


		// Add NIC panel to panelUpdate
		panelUpdate.add(nicPanel);


		// =========================================================
		// NAME PANEL
		// =========================================================

		JPanel namePanel = new JPanel(new GridBagLayout());

		GridBagConstraints nameGbc = new GridBagConstraints();
		nameGbc.insets = new Insets(10, 10, 10, 10);
		nameGbc.anchor = GridBagConstraints.CENTER;


		// NAME LABEL
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("", Font.BOLD, 18));

		nameGbc.gridx = 0;
		nameGbc.gridy = 0;

		namePanel.add(lblName, nameGbc);


		// NAME TEXT FIELD
		txtStuName = new JTextField();
		txtStuName.setFont(new Font("", Font.BOLD, 18));
		txtStuName.setPreferredSize(new Dimension(395, 35));

		nameGbc.gridx = 1;
		nameGbc.gridy = 0;

		namePanel.add(txtStuName, nameGbc);


		// Add NAME panel to panelUpdate
		panelUpdate.add(namePanel);


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
		
		// =========================================================
		// SELECT OPTION SECTION
		// =========================================================

		JPanel mainSelectionPanel = new JPanel(new GridLayout(2, 2, 30, 20));


		// =========================================================
		// ID IMAGE PANEL
		// =========================================================
		ImageIcon iconNic = new ImageIcon("C:/Users/sakut/Downloads/user.png");

		Image imgId = iconNic.getImage();
		Image scaledImgId = imgId.getScaledInstance(90, 100, Image.SCALE_SMOOTH);

		JLabel lblIdOption = new JLabel(new ImageIcon(scaledImgId));
		lblIdOption.setHorizontalAlignment(JLabel.CENTER);

		JPanel idImagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		idImagePanel.add(lblIdOption);


		// Add ID image panel to main panel
		mainSelectionPanel.add(idImagePanel);


		// =========================================================
		// NAME IMAGE PANEL
		// =========================================================

		ImageIcon iconName = new ImageIcon("C:/Users/sakut/Downloads/id-card.png");
		
		Image imgName = iconName.getImage();
		Image scaledImgName = imgName.getScaledInstance(90, 100, Image.SCALE_SMOOTH);

		JLabel lblNameOption = new JLabel(new ImageIcon(scaledImgName));
		lblNameOption.setHorizontalAlignment(JLabel.CENTER);

		JPanel nameImagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		nameImagePanel.add(lblNameOption);


		// Add Name image panel to main panel
		mainSelectionPanel.add(nameImagePanel);


		// =========================================================
		// UPDATE ID BUTTON PANEL
		// =========================================================

		btnUpdateId = new JButton("Update ID");

		btnUpdateId.setFont(new Font("", Font.BOLD, 20));

		JPanel idButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		idButtonPanel.add(btnUpdateId);


		// Add ID button panel to main panel
		mainSelectionPanel.add(idButtonPanel);


		// =========================================================
		// UPDATE NAME BUTTON PANEL
		// =========================================================

		btnUpdateName = new JButton("Update Name");

		btnUpdateName.setFont(new Font("", Font.BOLD, 20));

		JPanel nameButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		nameButtonPanel.add(btnUpdateName);


		// Add Name button panel to main panel
		mainSelectionPanel.add(nameButtonPanel);
		
		
		// =========================================================
		// CENTER PANEL
		// =========================================================
		
		JPanel emptyPanel = new JPanel();
		cardLayout = new CardLayout();

		centerPanel = new JPanel(cardLayout);
		
		centerPanel.add(emptyPanel, "EMPTY");
		centerPanel.add(mainSelectionPanel, "OPTIONS");
		centerPanel.add(panelUpdate, "UPDATE");

		add(centerPanel, BorderLayout.CENTER);
		
		cardLayout.show(centerPanel, "EMPTY");
		
		
		mainSelectionPanel.setVisible(false);
		nicPanel.setVisible(false);
		namePanel.setVisible(false);
		
		//SEARCH BUTTON
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String searchedRegNo = txtSearchBox.getText();
				
				if(txtSearchBox.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Field cannot be empty");
					return;
				}else if(StudentCollection.isAvailable(searchedRegNo)){
					
					cardLayout.show(centerPanel, "OPTIONS");
					
					
				}else{
					JOptionPane.showMessageDialog(null,"This student does not exist in the system");
				}
				
				
				
			}
		});
		
		//UPDATE ID BUTTON
		btnUpdateId.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				updateNicMode = true;
				updateNameMode = false;
			
				cardLayout.show(centerPanel, "UPDATE");
				nicPanel.setVisible(true);				
			}
		});
		
		//UPDATE NAME BUTTON
		btnUpdateName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				updateNicMode = false;
				updateNameMode = true;				
				
				cardLayout.show(centerPanel, "UPDATE");
				namePanel.setVisible(true);
				
				
			}
		});
		
		//UPDATE BUTTON
		btnUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String regNo = txtSearchBox.getText().trim();
				String updatedNic = txtStuNic.getText();
				String updatedName = txtStuName.getText();
				
				int updatedNicConverted = updatedNic.length();
				
				//====================================
				//NIC UPDATE
				//====================================
				
				if(updateNicMode){
					//Check if the nic field is empty
					if(txtStuNic.getText().isEmpty()){
						JOptionPane.showMessageDialog(null,"NIC cannot be empty");
					}else if(updatedNicConverted != 12){
						JOptionPane.showMessageDialog(null, "NIC cannot be greater than or less than 10 characters");
						return;
					}else if(StudentCollection.isDuplicate(updatedNic)){ //Check the entered nic is already in the system
						
						JOptionPane.showMessageDialog(null,"This NIC already exists in the system");
						
					}else{
						if(StudentCollection.updateNicArray(updatedNic, regNo)){
							JOptionPane.showMessageDialog(null,"Student Details Updated Successfully");
							
							DisplayMessageUpdateStudent  updateNicSaveMsg= new DisplayMessageUpdateStudent(regNo);
							
							updateNicSaveMsg.setVisible(true);
							
							setVisible(false);
						}else{
							JOptionPane.showMessageDialog(null,"Student not found");
						}
					}
				}else if(updateNameMode){
					//====================================
					//NAME UPDATE
					//====================================
					
					//Check if the nic field is empty
					if(txtStuName.getText().isEmpty()){
						
						JOptionPane.showMessageDialog(null,"Name cannot be empty");
						
					}else if(StudentCollection.updateNameArray(regNo, updatedName)){
						
						JOptionPane.showMessageDialog(null,"Student Details Updated Successfully name");
						
						DisplayMessageUpdateStudent  updateNicSaveMsg= new DisplayMessageUpdateStudent(regNo);
						
						updateNicSaveMsg.setVisible(true);
						setVisible(false);
					}else{
						JOptionPane.showMessageDialog(null,"Student not found");
					}
				
				}			
			}
		});
		
		//CANCEL BUTTON
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				StudentManagement student = new StudentManagement();
				student.setVisible(true);
				setVisible(false);				
				
			}
		});
		
		
		
		
	}
	
	
}
