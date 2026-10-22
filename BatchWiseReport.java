import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;


class BatchWiseReport extends JFrame{

    private JButton btn105;
    private JButton btn106;
    private JButton btn107;
    private JButton btn108;
    private JButton btn109;
    private JButton btn110;
    
    private JButton btnBack;

    BatchWiseReport(){

        setTitle("Batch Wise Report");
        setSize(900, 500);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());


        //======================================================
        //                  NORTH - TITLE
        //======================================================

        JPanel titlePanel = new JPanel();

        JLabel lblTitle = new JLabel("BATCH WISE REPORT");
        lblTitle.setFont(new Font("", Font.BOLD, 24));

        titlePanel.add(lblTitle);

        add(titlePanel, BorderLayout.NORTH);


        //======================================================
        //                  MAIN PANEL
        //======================================================

        JPanel mainBatchPanel = new JPanel(new GridLayout(6, 1, 0, 12));


        //======================================================
        //                  105 BATCH PANEL
        //======================================================

        JPanel batch105Panel = new JPanel();

        btn105 = new JButton("105 Batch");
        btn105.setFont(new Font("", Font.BOLD, 18));
        btn105.setPreferredSize(new Dimension(290, 50));
        btn105.setFocusPainted(false);

        batch105Panel.add(btn105);


        //======================================================
        //                  106 BATCH PANEL
        //======================================================

        JPanel batch106Panel = new JPanel();

        btn106 = new JButton("106 Batch");
        btn106.setFont(new Font("", Font.BOLD, 18));
        btn106.setPreferredSize(new Dimension(290, 50));
        btn106.setFocusPainted(false);

        batch106Panel.add(btn106);


        //======================================================
        //                  107 BATCH PANEL
        //======================================================

        JPanel batch107Panel = new JPanel();

        btn107 = new JButton("107 Batch");
        btn107.setFont(new Font("", Font.BOLD, 18));
        btn107.setPreferredSize(new Dimension(290, 50));
        btn107.setFocusPainted(false);

        batch107Panel.add(btn107);


        //======================================================
        //                  108 BATCH PANEL
        //======================================================

        JPanel batch108Panel = new JPanel();

        btn108 = new JButton("108 Batch");
        btn108.setFont(new Font("", Font.BOLD, 18));
        btn108.setPreferredSize(new Dimension(290, 50));
        btn108.setFocusPainted(false);

        batch108Panel.add(btn108);


        //======================================================
        //                  109 BATCH PANEL
        //======================================================

        JPanel batch109Panel = new JPanel();

        btn109 = new JButton("109 Batch");
        btn109.setFont(new Font("", Font.BOLD, 18));
        btn109.setPreferredSize(new Dimension(290, 50));
        btn109.setFocusPainted(false);

        batch109Panel.add(btn109);


        //======================================================
        //                  110 BATCH PANEL
        //======================================================

        JPanel batch110Panel = new JPanel();

        btn110 = new JButton("110 Batch");
        btn110.setFont(new Font("", Font.BOLD, 18));
        btn110.setPreferredSize(new Dimension(290, 50));
        btn110.setFocusPainted(false);

        batch110Panel.add(btn110);


        //======================================================
        //              ADD PANELS TO MAIN PANEL
        //======================================================

        mainBatchPanel.add(batch105Panel);
        mainBatchPanel.add(batch106Panel);
        mainBatchPanel.add(batch107Panel);
        mainBatchPanel.add(batch108Panel);
        mainBatchPanel.add(batch109Panel);
        mainBatchPanel.add(batch110Panel);


        //======================================================
        //              ADD MAIN PANEL TO WINDOW
        //======================================================

        add(mainBatchPanel, BorderLayout.CENTER);
        
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
		//                  BUTTON ACTIONS
		//======================================================

		// 105 BATCH
		btn105.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch105StuRep batch105 = new Batch105StuRep();
				batch105.setVisible(true);
				setVisible(false);

			}
		});


		// 106 BATCH
		btn106.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch106StuRep batch106 = new Batch106StuRep();
				batch106.setVisible(true);
				setVisible(false);

			}
		});


		// 107 BATCH
		btn107.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch107StuRep batch107 = new Batch107StuRep();
				batch107.setVisible(true);
				setVisible(false);

			}
		});


		// 108 BATCH
		btn108.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch108StuRep batch108 = new Batch108StuRep();
				batch108.setVisible(true);
				setVisible(false);

			}
		});


		// 109 BATCH
		btn109.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch109StuRep batch109 = new Batch109StuRep();
				batch109.setVisible(true);
				setVisible(false);

			}
		});


		// 110 BATCH
		btn110.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				Batch110StuRep batch110 = new Batch110StuRep();
				batch110.setVisible(true);
				setVisible(false);

			}
		});
		
		//BACK BUTTON
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				ReportManagement  homePage = new ReportManagement ();
				homePage.setVisible(true);
				setVisible(false);
			}
		});
    }
}
