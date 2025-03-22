package Hospital;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame{

	Reception(){
				
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(5, 160, 1525, 670); // ✅ Corrected
		panel.setBackground(new Color(109, 164, 170)); // ✅ Corrected
		add(panel);

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(5, 5, 1525, 150); // ✅ Corrected
		panel1.setBackground(new Color(109, 164, 170)); // ✅ Corrected
		add(panel1);

		
		
		ImageIcon i1 = new ImageIcon("Icons/dr.png");
		Image image = i1.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(image);
		JLabel label = new JLabel(i2);
		label.setBounds(1300, 0, 250, 250); // ✅ Fixed
		panel1.add(label);
		
		ImageIcon i11 = new ImageIcon("Icons/amb.png");
		Image image1 = i11.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
		ImageIcon i22 = new ImageIcon(image1);
		JLabel label1 = new JLabel(i22);
		label1.setBounds(1000, 50, 300, 100); // ✅ Fixed
		panel1.add(label1);

		JButton btn1 = new JButton("Add New Patient"); // ✅ Fixed
		btn1.setBounds(30, 15, 200, 30); // ✅ Fixed
		btn1.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn1);
		btn1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      new NEW_PATIENT();
		    }
		});
		
		
		JButton btn2 = new JButton("Room"); // ✅ Fixed
		btn2.setBounds(30, 58 , 200, 30); // ✅ Fixed
		btn2.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn2);
		btn2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      
		    	new Room();
		    	
		    }
		});
		
		
		JButton btn3 = new JButton("Department"); // ✅ Fixed
		btn3.setBounds(30, 100, 200, 30); // ✅ Fixed
		btn3.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn3);
		btn3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		     new  Department();
		    }
		});
		
		
		JButton btn4 = new JButton("All Employee Info"); // ✅ Fixed
		btn4.setBounds(270, 15, 200, 30); // ✅ Fixed
		btn4.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn4);
		btn4.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      new Employee_info();
		    }
		});
		
		JButton btn5 = new JButton("Patient Info"); // ✅ Fixed
		btn5.setBounds(270, 58, 200, 30); // ✅ Fixed
		btn5.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn5);
		btn5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      new ALL_Patient_info();
		    }
		});
		
		JButton btn6 = new JButton("Patient Discharge"); // ✅ Fixed
		btn6.setBounds(270, 100, 200, 30); // ✅ Fixed
		btn6.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn6);
		btn6.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      
		    	new Patient_discharge();
		    	
		    }
		});
		
		JButton btn7 = new JButton("Update Patient Details"); // ✅ Fixed
		btn7.setBounds(510, 15, 200, 30); // ✅ Fixed
		btn7.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn7);
		btn7.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      
		    	new update_patient_details();
		    }
		});
		
		JButton btn8 = new JButton("Hospital Ambulance"); // ✅ Fixed
		btn8.setBounds(510, 58, 200, 30); // ✅ Fixed
		btn8.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn8);
		btn8.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        new Ambulance();
		    }
		});

		JButton btn9 = new JButton("Search Room"); // ✅ Fixed
		btn9.setBounds(510, 100, 200, 30); // ✅ Fixed
		btn9.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn9);
		btn9.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		     
		    	new SearchRoom();
		    }
		});
		
		JButton btn10 = new JButton("Logout"); // ✅ Fixed
		btn10.setBounds(750, 15, 200, 30); // ✅ Fixed
		btn10.setBackground(new Color(246, 215, 118)); // ✅ Fixed
		panel1.add(btn10);
		btn10.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      
		    	setVisible(false);
		    	new Login();
		    }
		});

	
		setSize(1950, 1090); // ✅ Corrected
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Reception();
	}
}
