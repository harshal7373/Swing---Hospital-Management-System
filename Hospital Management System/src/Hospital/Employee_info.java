package Hospital;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Employee_info extends JFrame{

	 Employee_info() {
		JPanel panel=new JPanel();
		panel.setBounds(5,5,990,590);
		panel.setBackground(new Color(109,164,170));
		panel.setLayout(null);
		add(panel);
		
		
		JTable table =new JTable();
		table.setBounds(10,34,980,450);
		table.setBackground(new Color(109,164,170));
		table.setFont(new Font("Tahoma",Font.BOLD,12));
		panel.add(table);
		 
		try {
			Conn c = new Conn();
			 String q="select * from EMP_INFO";
			 ResultSet resultSet = c.statement.executeQuery(q);
			 table.setModel(DbUtils.resultSetToTableModel(resultSet)); 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		JLabel label1=new JLabel("Name");
		label1.setBounds(41,9,70,20);
		label1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label1);
		
		JLabel label2=new JLabel("Age");
		label2.setBounds(175,9,70,20);
		label2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label2);
		
		JLabel label3=new JLabel("Phone Number");
		label3.setBounds(350,9,150,20);
		label3.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label3);
		
		JLabel label4=new JLabel("Salary");
		label4.setBounds(520,9,70,20);
		label4.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label4);
		
		JLabel label5=new JLabel("Gmail");
		label5.setBounds(700,9,70,20);
		label5.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label5);
		
		JLabel label6=new JLabel("Adhar Number");
		label6.setBounds(830,9,150,20);
		label6.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label6);
		
		JButton b1=new JButton("BACK");
		b1.setBounds(350,500,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		panel.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
	
		setUndecorated(true);
		setSize(1000,600);	
		setLocation(350,230);
		setLayout(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new Employee_info();

	}

}
