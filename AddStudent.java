import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;  

class AddStudent extends JFrame{
	private JTextField txtBatchNum;
	private JTextField txtStuNic;
	private JTextField txtStuName;
	private JTextField txtStuLecMode;
	
	private JButton btnCancel;
	private JButton btnAdd;
	private JButton btnClear;
	
	
	AddStudent(){
		setTitle("Add Student");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel addStudentTitle = new JLabel("Add Student");
		addStudentTitle.setFont(new Font("", 1,20));
		addStudentTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", addStudentTitle);
		
		
		//Main panel for label 
		JPanel labelPanel = new JPanel();
		labelPanel.setFont(new Font("", 1,20));		
		labelPanel.setLayout(new GridLayout(4,2));
		
		//================================
		//		ADD STUDENT LABELS
		//================================
		
		//Batch Number Label
		JLabel lblbatchNum = new JLabel("Batch Number");
		lblbatchNum.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblBatchNum = new JPanel();
		panelLblBatchNum.add(lblbatchNum);
		
		//Add to main panel
		labelPanel.add(panelLblBatchNum);
		
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
		
		
		//Name Label
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblName = new JPanel();
		panelLblName.add(lblName);
		
		//Add to main panel
		labelPanel.add(panelLblName);
		
		//============================================
		
		
		//Lecturer Mode Label
		JLabel lblLecMode = new JLabel("Lecture Mode");
		lblLecMode.setFont(new Font("", 1, 20));
		
		//Add Label to panel
		JPanel panelLblLecMode = new JPanel();
		panelLblLecMode.add(lblLecMode);
		
		//Add to main panel
		labelPanel.add(panelLblLecMode);
		
		//============================================
		
		
		
		//================================
		//		ADD STUDENT TEXT FIELDS 
		//================================
		
		//Main panel for text field and
		JPanel textPanel = new JPanel();
		textPanel.setFont(new Font("", 1,20));
		textPanel.setLayout(new GridLayout(4,1));
		
		//*********************************************
		
		//Batch Num Text
		txtBatchNum = new JTextField(10);
		txtBatchNum.setFont(new Font("", 1,25));
		txtBatchNum.setHorizontalAlignment(JTextField.LEFT);
		
		//Add num field to panel
		JPanel txtBatchNumPanel = new JPanel();
		txtBatchNumPanel.add(txtBatchNum);
		
		//Add to main panel
		textPanel.add(txtBatchNumPanel);
		
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
		
		
		//Name Text
		txtStuName = new JTextField(10);
		txtStuName.setFont(new Font("", 1,20));
		
		//Add num field to panel
		JPanel txtNamePanel = new JPanel();
		txtNamePanel.add(txtStuName);
		
		//Add to main panel
		textPanel.add(txtNamePanel);
		
		//============================================
		
		
		//Lecture Mode
		txtStuLecMode = new JTextField(10);
		txtStuLecMode.setFont(new Font("", 1,20));
		
		//Add num field to panel
		JPanel txtLecModePanel = new JPanel();
		txtLecModePanel.add(txtStuLecMode);
		
		//Add to main panel
		textPanel.add(txtLecModePanel);
		
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
		
		
		//============================================
		//					BUTTONS
		//============================================	
		
		//Button Panel	
		JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("", 1,25));
		
		//Add cancel button to the panel
		panelButton.add(btnCancel);
		
		
		btnAdd = new JButton("ADD STUDENT");
		btnAdd.setFont(new Font("", 1,25));
		
		btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("", 1,25));
		
		//Add cancel button to the panel
		panelButton.add(btnAdd);
		panelButton.add(btnClear);
		
		add("South", panelButton);
		
		
		
		
		
		//ADD STUDENT BUTTON
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//Get the data from the fields				
				
				if(txtBatchNum.getText().trim().isEmpty() || txtStuNic.getText().trim().isEmpty() || txtStuName.getText().trim().isEmpty()|| txtStuLecMode.getText().trim().isEmpty()){
					JOptionPane.showMessageDialog(null,"Fields Cannot Be Empty");
					return;
				}
				
				String batchNum = txtBatchNum.getText();
				int batchNumConvert = Integer.parseInt(batchNum);	
				
				if(BatchCollection.isValid(batchNumConvert)){
					JOptionPane.showMessageDialog(null,"Student can not be added to this batch because enrollment is closed!");
				}else if(BatchCollection.isAvailable(batchNum)){
					
					String stuNIC = txtStuNic.getText().trim();
					//int stuNICConvert = Integer.parseInt(stuNIC);
					
					int stuNICLength= stuNIC.length();
					
					if(stuNICLength != 12){
						JOptionPane.showMessageDialog(null, "NIC cannot be greater than or less than 10 characters");
						return;
					}
					
					//Check NIC Duplicate
					if(AccessStudentCollection.getInstance().getStudentCollection().isDuplicate(stuNIC)){
						JOptionPane.showMessageDialog(null,"This student is already added to the system!");
					}else{
						String stuName = txtStuName.getText();
						
						String lecMode = txtStuLecMode.getText();
						lecMode = lecMode.toUpperCase();
						
						String regNo = StudentCollection.regNumGenarator(batchNumConvert,lecMode );
						
						Student s1 = new Student(regNo, stuName, stuNIC, -2, -2);
						boolean isAdded = StudentCollection.addNewStudent(s1);				
						
						
						if(isAdded){
							JOptionPane.showMessageDialog(null,"Student Added Successfully !");
							DisplayMessageAddStudent message = new DisplayMessageAddStudent(batchNumConvert, stuName, lecMode , regNo);
							message.setVisible(true);
							setVisible(false);
						}					
						
					}
					
				}else{
					JOptionPane.showMessageDialog(null,"Entered Batch does not exist in the system");
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
		
		//CLEAR BUTTON
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				txtBatchNum.setText("");
				txtStuName.setText("");
				txtStuNic.setText("");
				txtStuLecMode.setText("");
			}
		});
		
		
		
		
		
		
		
		
	}
}











