import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

class GradeManagement extends JFrame{
	
	private JButton btnPrfUpdate;
	private JButton btnDbmsUpdate;
	private JButton btnBack;
	
	GradeManagement(){
		setTitle("Grade Management");
		setSize(900, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));

		// ---------------- TITLE ----------------

		JLabel formTitle = new JLabel("Grade Management");
		formTitle.setFont(new Font("", Font.BOLD, 25));
		formTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Add some space around title
		northPanel.add(Box.createVerticalStrut(15));
		northPanel.add(formTitle);
		northPanel.add(Box.createVerticalStrut(20));


		// Add everything to NORTH
		add(northPanel, BorderLayout.NORTH);
		
		//======================================================
		//              MAIN UPDATE OPTION PANEL
		//======================================================

		JPanel mainUpdatePanel = new JPanel(new GridLayout(1, 2, 30, 0));


		//======================================================
		//              PRF MARKS UPDATE PANEL
		//======================================================

		JPanel prfUpdatePanel = new JPanel(new FlowLayout());

		btnPrfUpdate = new JButton("PRF MARKS UPDATE");
		btnPrfUpdate.setFont(new Font("", Font.BOLD, 18));
		btnPrfUpdate.setPreferredSize(new Dimension(250, 50));

		prfUpdatePanel.add(btnPrfUpdate);


		//======================================================
		//              DBMS MARKS UPDATE PANEL
		//======================================================

		JPanel dbmsUpdatePanel = new JPanel(new FlowLayout());

		btnDbmsUpdate = new JButton("DBMS MARKS UPDATE");
		btnDbmsUpdate.setFont(new Font("", Font.BOLD, 18));
		btnDbmsUpdate.setPreferredSize(new Dimension(250, 50));

		dbmsUpdatePanel.add(btnDbmsUpdate);


		//======================================================
		//              ADD PANELS TO MAIN PANEL
		//======================================================

		mainUpdatePanel.add(prfUpdatePanel);
		mainUpdatePanel.add(dbmsUpdatePanel);


		//======================================================
		//              ADD MAIN PANEL TO WINDOW
		//======================================================
		

		add(mainUpdatePanel, BorderLayout.CENTER);
		
		//======================================================
        // BACK BUTTON
        //======================================================

        btnBack = new JButton("Back to Main Menu");
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setPreferredSize(new Dimension(250, 40));
        
        JPanel homePageBtnPanel = new JPanel();
        homePageBtnPanel.add(btnBack);

        add(homePageBtnPanel, BorderLayout.SOUTH);
		
		
		//======================================================
		//              BUTTON TRIGGER
		//======================================================
		
		//PRF Marks Update Button Trigger		
		
		btnPrfUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				PrfMarksUpdate prfMarksUpdate = new PrfMarksUpdate();
				prfMarksUpdate.setVisible(true);
				setVisible(false);
			}
		});
		
		//DBMS Marks Update Button Trigger			
		
		btnDbmsUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				DbmsMarksUpdate dbmsMarksUpdate = new DbmsMarksUpdate();
				dbmsMarksUpdate.setVisible(true);
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
