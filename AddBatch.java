import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class AddBatch extends JFrame{
	
	private JTextField txtBatchName;
	
	private JButton btnCancel;
	private JButton btnAdd;
	private JButton btnClear;
	
	AddBatch(){
		setTitle("Add Batch");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		
		//==================================================================================================
		
		//Form Title 
		JLabel formTitle = new JLabel("Add Batch");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		//=================================================
		//	STUDENT DETAIL DISPLAY PANEL
		//=================================================
		
		JPanel mainViewStudentPanel = new JPanel(new BorderLayout());
		
		
		//****************************************
		//				LABEL PANEL
		//****************************************
		
		JPanel lblPanel = new JPanel();
		
		//Label Name
		JLabel lblName = new JLabel("Batch Name");
		lblName.setFont(new Font("", Font.BOLD, 18));
		
		lblPanel.add(lblName);
		
		add("West" , lblPanel);
		
		
		
		//****************************************
		//				TEXT FIELD PANEL
		//****************************************

		JPanel txtPanel = new JPanel();


		// Text Field Name
		txtBatchName = new JTextField(20);
		txtBatchName.setFont(new Font("", Font.BOLD, 18));

		txtPanel.add(txtBatchName);
		
		add("East", txtPanel);
		
		//============================================
		//					BUTTONS
		//============================================	
		
		//Button Panel	
		JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("", 1,25));
		
		//Add cancel button to the panel
		panelButton.add(btnCancel);
		
		
		btnAdd = new JButton("ADD BATCH");
		btnAdd.setFont(new Font("", 1,25));
		
		//Add cancel button to the panel
		panelButton.add(btnAdd);
		
		
		add("South", panelButton);
		
		
		btnAdd.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent evt){
				
				
				if(txtBatchName.getText().trim().isEmpty()){
					
					JOptionPane.showMessageDialog(null,"Fields Cannot Be Empty");
					return;
					
				}
				
				String batchNum = txtBatchName.getText();
				int batchNumConvert = Integer.parseInt(batchNum);
				
				if(batchNumConvert < 100){
					JOptionPane.showMessageDialog(null,"Invalid Batch Format");
					return;
				}
				
				if(BatchCollection.isAvailable(batchNum)){
					JOptionPane.showMessageDialog(null,"This batch is already added to the system!");
				}else{
					if(BatchCollection.saveBatchArray(batchNum)){
						JOptionPane.showMessageDialog(null,"Batch is successfully Added!");
						DisplayMessageAddBatch batch = new DisplayMessageAddBatch();
						batch.setVisible(true);
						setVisible(false);
					}
				}
				
			}
		});
		
		//Cancel BUTTON
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				BatchManagement  homePage = new BatchManagement ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
		
		
		
	}
	
	
}
