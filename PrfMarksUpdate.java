import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class PrfMarksUpdate extends JFrame{
	
	private JTextField txtSearchBox;	
	private JTextField txtStudentCount;
	private JTextField txtPrfMarks;
	private JTextField txtStuNic; 	
	private JTextField txtStuName; 
	private JTextField txtPrfMarksUpdate; 
		
	private JButton btnSearch; 
	private JButton btnUpdate; 
	private JButton btnCancel; 
	
	PrfMarksUpdate(){
	
		setTitle("PRF Marks Update");
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

		JLabel formTitle = new JLabel("PRF Marks Update");
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
		
		//=========================================================
		
		//Main panel for label 
		JPanel labelPanel = new JPanel();
		labelPanel.setFont(new Font("", 1,20));		
		labelPanel.setLayout(new GridLayout(4,2));
		
		//================================
		//		ADD STUDENT LABELS
		//================================
		
		//Batch Number Label
		JLabel lblStuName = new JLabel("Name");
		lblStuName.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblStuName = new JPanel();
		panelLblStuName.add(lblStuName);
		
		//Add to main panel
		labelPanel.add(panelLblStuName);
		
		//============================================
		
		
		//NIC Label
		JLabel lblNic = new JLabel("NIC");
		lblNic.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblNic = new JPanel();
		panelLblNic.add(lblNic);
		
		//Add to main panel
		labelPanel.add(panelLblNic);
		
		//============================================
		
		
		//PRF Marks Label
		JLabel lblPrfMarks = new JLabel("PRF Marks");
		lblPrfMarks.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblPrfMarks = new JPanel();
		panelLblPrfMarks.add(lblPrfMarks);
		
		//Add to main panel
		labelPanel.add(panelLblPrfMarks);
		
		//============================================
		
		
		//Enter New Marks Label
		JLabel lblPrfNewMarks = new JLabel("Enter New PRF Marks");
		lblPrfNewMarks.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblPrfNewMarks = new JPanel();
		panelLblPrfNewMarks.add(lblPrfNewMarks);
		
		//Add to main panel
		labelPanel.add(panelLblPrfNewMarks);
		
		
		//================================
		//		ADD STUDENT TEXT FIELDS 
		//================================
		
		//Main panel for text field
		JPanel textPanel = new JPanel();
		textPanel.setFont(new Font("", 1,20));
		textPanel.setLayout(new GridLayout(4,1));
		
		//*********************************************
		
		//Batch Num Text
		txtStuName = new JTextField(10);
		txtStuName.setFont(new Font("", 1,25));
		txtStuName.setHorizontalAlignment(JTextField.LEFT);
		
		//Add num field to panel
		JPanel txtStuNamePanel = new JPanel();
		txtStuNamePanel.add(txtStuName);
		
		//Add to main panel
		textPanel.add(txtStuNamePanel);
		
		//============================================
		
		
		//Nic Text
		txtStuNic = new JTextField(10);
		txtStuNic.setFont(new Font("", 1,20));
		
		//Add num field to panel
		JPanel txtNicPanel = new JPanel();
		txtNicPanel.add(txtStuNic);
		
		//Add to main panel
		textPanel.add(txtNicPanel);
		
		//============================================
		
		
		//PRF Marks Text
		txtPrfMarks = new JTextField(10);
		txtPrfMarks.setFont(new Font("", 1,20));
		
		//Add num field to panel
		JPanel txtPrfMarksPanel = new JPanel();
		txtPrfMarksPanel.add(txtPrfMarks);
		
		//Add to main panel
		textPanel.add(txtPrfMarksPanel);
		
		//============================================
		
		
		//New PRF Marks
		txtPrfMarksUpdate = new JTextField(10);
		txtPrfMarksUpdate.setFont(new Font("", 1,20));
		
		//Add num field to panel
		JPanel txtPrfMarksUpdatePanel = new JPanel();
		txtPrfMarksUpdatePanel.add(txtPrfMarksUpdate);
		
		//Add to main panel
		textPanel.add(txtPrfMarksUpdatePanel);
		
		//============================================
		
		//add("East", textPanel);
		
		add("West", labelPanel);
		add("East", textPanel);	
		
		labelPanel.setBorder(
			BorderFactory.createEmptyBorder(20, 30, 20, 30)
		);	
		
		textPanel.setBorder(
			BorderFactory.createEmptyBorder(20, 30, 20, 150)
		);
	
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
		
		labelPanel.setVisible(false);
		textPanel.setVisible(false);
		
		
		//SEARCH BUTTON
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String searchedRegNo = txtSearchBox.getText();
				
				if(txtSearchBox.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Field cannot be empty");
					return;
				}else if(StudentCollection.isAvailable(searchedRegNo)){					
					labelPanel.setVisible(true);
					textPanel.setVisible(true);
					
					
					Student student = StudentCollection.searchStudent(searchedRegNo);
					
					txtStuName.setText(student.getStuName()+"");
					txtStuNic.setText(student.getNic()+"");
					
					//PRF MARKS
					if(student.getPrfMarks() == -1){
						txtPrfMarks.setText("Absent");
					}else if(student.getPrfMarks() == -2){
						txtPrfMarks.setText("Not Conducted");
					}else{
						String prfMarkConvert = Integer.toString(student.getPrfMarks());
						txtPrfMarks.setText(prfMarkConvert);
						
					}				
					
					
					
				}else{
					JOptionPane.showMessageDialog(null,"This student does not exist in the system");
				}
				
				
				
			}
		});
		
		//UPDATE BUTTON
		btnUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				boolean isSuccess = false;
				
				String searchedRegNo = txtSearchBox.getText();
				
				String newPrfMarks = txtPrfMarksUpdate.getText();
				Integer newPrfMarksConverted = Integer.parseInt(newPrfMarks);
				
				if(newPrfMarksConverted instanceof Integer){
					isSuccess = true;
					int index = StudentCollection.findIndex(searchedRegNo);
					StudentCollection.studentArray[index].setPrfMarks(newPrfMarksConverted);
				}
				
				if(isSuccess == true){
					JOptionPane.showMessageDialog(null,searchedRegNo + " Student's Marks Successfully Updated");
					DisplayMarksUpdateMessage marks = new DisplayMarksUpdateMessage(searchedRegNo);
					marks.setVisible(true);
					setVisible(false);
					
				}else{
					JOptionPane.showMessageDialog(null,"PRF Marks Update Failed");
				} 
				
				System.out.println(Arrays.toString(StudentCollection.studentArray));
				
				
				
				
			}
		});
		
		
		//CANCEL BUTTON
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				GradeManagement batch = new GradeManagement();
				batch.setVisible(true);
				setVisible(false);				
				
			}
		});
	
	
	
	
	}
		
		
}
