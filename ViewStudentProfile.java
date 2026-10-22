import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JTextField;

class ViewStudentProfile extends JFrame{
	private JTextField txtSearchBox; 
	private JTextField txtStuNic; 	
	private JTextField txtStuName; 
		
	private JButton btnSearch;
	private JButton btnHomepage;
	
	private JTextField txtName;
	private JTextField txtNic;
	private JTextField txtPrfMarks;
	private JTextField txtDbmsMarks;
	private JTextField txtGpa; 
	
	ViewStudentProfile(){
		setTitle("View Student Profile");
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

		JLabel formTitle = new JLabel("View Student");
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
		
		
		//=================================================
		//	STUDENT DETAIL DISPLAY PANEL
		//=================================================
		
		JPanel mainViewStudentPanel = new JPanel(new BorderLayout());
		
		
		//****************************************
		//				LABEL PANEL
		//****************************************
		
		JPanel lblPanel = new JPanel(new GridLayout(5,1,4,35));
		
		//Label Name
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblName);
		
		
		//Label NIC
		JLabel lblNic = new JLabel("Nic");
		lblNic.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblNic);
		
		
		//Label PRF Marks
		JLabel lblPrfMarks = new JLabel("PRF Marks");
		lblPrfMarks.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblPrfMarks);
		
		//Label DBMS Marks
		JLabel lblDbmsMarks = new JLabel("DBMS Marks");
		lblDbmsMarks.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblDbmsMarks);
		
		
		//Label GPA Marks
		JLabel lblgpa = new JLabel("GPA");
		lblgpa.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblgpa);
		
		mainViewStudentPanel.add("West",lblPanel);
		
		
		
		//****************************************
		//				TEXT FIELD PANEL
		//****************************************

		JPanel txtPanel = new JPanel(new GridLayout(5,1,4,35));


		// Text Field Name
		txtName = new JTextField(20);
		txtName.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtName);


		// Text Field NIC
		txtNic = new JTextField(10);
		txtNic.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtNic);


		// Text Field PRF Marks
		txtPrfMarks = new JTextField(10);
		txtPrfMarks.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtPrfMarks);


		// Text Field DBMS Marks
		txtDbmsMarks = new JTextField(10);
		txtDbmsMarks.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtDbmsMarks);


		// Text Field GPA
		txtGpa = new JTextField(10);
		txtGpa.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtGpa);
		
		mainViewStudentPanel.add("East",txtPanel);
		
		add("Center", mainViewStudentPanel);
		
		//=================================
		//				BUTTON
		//=================================
		
		JPanel btnBackPanel = new JPanel();
		
		btnHomepage = new JButton("BACK TO HOME PAGE");
		btnHomepage.setFont(new Font("", Font.BOLD, 18));
		
		btnBackPanel.add(btnHomepage);
		
		add("South", btnBackPanel);
		
		mainViewStudentPanel.setVisible(false);
		
		
		//=========================================
		//TRIGGER BUTTONS
		//=========================================
		
		//SEARCH BUTTON
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String searchedRegNo = txtSearchBox.getText();
				
				
				
				Student student = StudentCollection.searchStudent(searchedRegNo);
				
				//String prfStringMark = String.valueOf(student.getPrfMark());
				
				if(txtSearchBox.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Field cannot be empty");
					return;
				}else if(StudentCollection.isAvailable(searchedRegNo)){
					mainViewStudentPanel.setVisible(true);
					
					
					txtName.setText(student.getStuName()+"");
					txtNic.setText(student.getNic()+"");
					
					//PRF MARKS
					if(student.getPrfMarks() == -1){
						txtPrfMarks.setText("Absent");
					}else if(student.getPrfMarks() == -2){
						txtPrfMarks.setText("Not Conducted");
					}else{
						String prfMarkConvert = Integer.toString(student.getPrfMarks());
						txtPrfMarks.setText(prfMarkConvert);
						
					}
					
					//DBMS MARKS
					if(student.getDbmsMarks() == -1){
						txtDbmsMarks.setText("Absent");
					}else if(student.getDbmsMarks() == -2){
						txtDbmsMarks.setText("Not Conducted");
					}else{
						String dbmsMarkConvert = Integer.toString(student.getDbmsMarks());
						txtDbmsMarks.setText(dbmsMarkConvert);
						
					}
					
					double prfMarks = StudentCollection.calculateGPA(student.getPrfMarks());
					double dbmsMarks = StudentCollection.calculateGPA(student.getDbmsMarks());
				
					double gpa =  (prfMarks + dbmsMarks) / 2.0;
					
					String gpaConvert = Double.toString(gpa);
					txtGpa.setText(gpaConvert);
					
					
					
					
					
				}else{
					JOptionPane.showMessageDialog(null,"This student does not exist in the system");
				}
				
				
				
			}
		});
		
		//BACK TO HOME PAGE BUTTON
		btnHomepage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				StudentManagement homePage = new StudentManagement ();
				homePage.setVisible(true);
				setVisible(false);
				
				
				
				
			}
		});
		
	}
}
