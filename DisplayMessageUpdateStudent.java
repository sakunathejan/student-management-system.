import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class DisplayMessageUpdateStudent extends JFrame{
	
	private JButton btnBack;
	private JButton btnAddStudent;
	
	DisplayMessageUpdateStudent(String regNo){
		setTitle("Display Message");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		//setLayout(new GridBagLayout());
		getContentPane().setBackground(new Color(150, 200, 250));
		
		//Main Panel
		JPanel mainDisplayBox = new JPanel();
		mainDisplayBox.setFont(new Font("",1,20));
		mainDisplayBox.setLayout(new GridLayout(2,1));
		mainDisplayBox.setBorder(new javax.swing.border.EmptyBorder(10, 10, 10, 10));
		mainDisplayBox.setPreferredSize(new Dimension(500, 100));
		
		
		
		//Student RegNo Display
		JLabel successMsgRegNo = new JLabel(regNo + "Details Successfully Updated !");
		successMsgRegNo.setFont(new Font("",1,20));
		//add(successMsgRegNo);
		
		//Student RegNo Display Panel
		JPanel panelSuccessMsgRegNo = new JPanel();
		panelSuccessMsgRegNo.setFont(new Font("",1,20));
		panelSuccessMsgRegNo.add(successMsgRegNo);
		panelSuccessMsgRegNo.setLayout(new GridLayout(1,0));
		panelSuccessMsgRegNo.setLayout(new FlowLayout());
		
		mainDisplayBox.add(panelSuccessMsgRegNo);
		
		
		add(mainDisplayBox);
		
		
		// Bottom Panel Buttons
		
		//Main Bottom Panel
		JPanel panelBottomBtn = new JPanel(new GridLayout(1,2));
		
		btnBack = new JButton("BACK TO HOMEPAGE");
		btnBack.setFont(new Font("", 1,25));
		
		
		JPanel panelBtnBack = new JPanel();
		panelBtnBack.add(btnBack);
		panelBottomBtn.add(panelBtnBack);
		
		btnAddStudent = new JButton("UPDATE NEW STUDENT");
		btnAddStudent.setFont(new Font("", 1,25));
		
		JPanel panelBtnAddStudent = new JPanel();
		panelBtnAddStudent.add(btnAddStudent);
		panelBottomBtn.add(panelBtnAddStudent);
		
		add("South", panelBottomBtn);
		
		
		//BACK BUTTON
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				StudentManagement  homePage = new StudentManagement ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
		
		//UPDATE ANOTHER NEW STUDENT
		btnAddStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				UpdateStudent updateStudent = new UpdateStudent ();
				updateStudent.setVisible(true);
				setVisible(false);
			}
		});
	}
	
}
