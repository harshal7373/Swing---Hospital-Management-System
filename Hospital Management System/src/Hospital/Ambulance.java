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

public class Ambulance extends JFrame {

	public Ambulance() {
		
		JPanel panel = new JPanel();
		panel.setBounds(5,5,890,590);
		panel.setBackground(new Color(90,156,163));
		panel.setLayout(null);
		add(panel);
		
		JTable table =new JTable();
		table.setBounds(10,40,900,450);
		table.setBackground(new Color(90,156,163));
		table.setFont(new Font("Tahoma",Font.BOLD,12));
		panel.add(table); 
		
		try {
			Conn c=new Conn();
			String q="select * from Ambulance";
			ResultSet resultSet=c.statement.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		 
		JLabel label1=new JLabel("Name");
		label1.setBounds(31,11,100,14);
		label1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label1);
		
		JLabel label2=new JLabel("Gender");
		label2.setBounds(264,11,100,14);
		label2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label2);
		
		JLabel label3=new JLabel("Car name");
		label3.setBounds(366,11,100,14);
		label3.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label3);
		
		JLabel label4=new JLabel("Available");
		label4.setBounds(520,11,100,14);
		label4.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label4);
		
		JLabel label5=new JLabel("Location");
		label5.setBounds(750,11,100,14);
		label5.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label5);
		
		
		
		JButton b1=new JButton("BACK");
        b1.setBounds(450,510,120,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
        
        setUndecorated(true);
		
		 setSize(900,600);
		 setLayout(null);
		 setLocation(300,200);
		 setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Ambulance();
		
	}

}
