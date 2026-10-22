import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class ViewBatchDetails extends JFrame{
	
	private JTable tblStudentDetails;
	private DefaultTableModel dtm;
	
	private JButton btnBack;
	
	ViewBatchDetails(){
		setTitle("View Batch Details Batch");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//==================================================================================================
		
		//Form Title 
		JLabel formTitle = new JLabel("View Batch Details");
		formTitle.setFont(new Font("", 3, 25));
		formTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North", formTitle);
		
		//====================================================================================================
		
		
		
		String [] columnNames = {"No", "Batch No", "Student Count", "Status"};
		dtm = new DefaultTableModel(columnNames,0);
		
		
		for(int i=0; i<BatchCollection.batchArray.length; i++){
			String batchName = Integer.toString(BatchCollection.batchArray[i].getBatchName());
			int studentCount = StudentCollection.countStudentInBatch(batchName);
			
			Object [] rowData = {i+1 , BatchCollection.batchArray[i].getBatchName(), studentCount, BatchCollection.batchArray[i].getBatchStatus() == 0 ? "ENROLLMENT CLOSED" : "ENROLLMENT OPEN" };
			dtm.addRow(rowData);
			
			
			
		}
		
		tblStudentDetails = new JTable(dtm);
		JScrollPane tablePane = new JScrollPane(tblStudentDetails);
		add("Center", tablePane);
		
		//======================================================
        // BACK BUTTON
        //======================================================

        btnBack = new JButton("BACK TO HOMEPAGE");
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setPreferredSize(new Dimension(250, 40));
        
        JPanel homePageBtnPanel = new JPanel();
        homePageBtnPanel.add(btnBack);

        add(homePageBtnPanel, BorderLayout.SOUTH);
		
		
		//BACK BUTTON
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				BatchManagement  homePage = new BatchManagement ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
		
		
	}
	
}
 
