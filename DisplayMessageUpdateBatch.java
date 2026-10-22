import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;


class DisplayMessageUpdateBatch extends JFrame{
	
	private JButton btnBack;
	private JButton btnAddStudent;
	
	DisplayMessageUpdateBatch(String batchNum){
		setTitle("Update Message");
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
		
		
		//Student Name Display
		JLabel successMsgName = new JLabel(batchNum + " Batch Status Sucessfully Updated!");
		successMsgName.setFont(new Font("",1,20));
		//add(successMsgName);		
		
		//Student Name Display Panel
		JPanel panelSuccessMsgName = new JPanel();
		panelSuccessMsgName.setFont(new Font("",1,20));
		panelSuccessMsgName.add(successMsgName);
		panelSuccessMsgName.setLayout(new GridLayout(1,0));
		panelSuccessMsgName.setLayout(new FlowLayout());
		
		
		mainDisplayBox.add(panelSuccessMsgName);
		
		
		
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
				
				HomePage  homePage = new HomePage ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
		
		//UPDATE NEW STUDENT
		btnAddStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				UpdateBatch updateNewStudent = new UpdateBatch ();
				updateNewStudent.setVisible(true);
				setVisible(false);
			}
		});
	}
	
	
}
