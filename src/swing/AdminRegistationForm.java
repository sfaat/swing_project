package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdminRegistationForm {
        
	AdminRegistationForm() {
		
	JFrame frame=new JFrame();
	
	frame.setVisible(true);
	JTextField text1=new JTextField();
	
	
	text1.setBounds(100, 100, 300, 30);
	
	JPasswordField pass=new JPasswordField();
	pass.setBounds(100, 150, 300, 30);
	
	JTextField text2=new JTextField();
	text2.setBounds(100, 200, 300, 30);
	
	JTextField text3=new JTextField();
	text3.setBounds(100, 250, 300, 30);
	
	JTextField text4=new JTextField();
	text4.setBounds(100, 300, 300, 30);
	
	JTextField text5=new JTextField();
	text5.setBounds(100, 350, 300, 30);
	
	JButton button=new JButton("OK");
	button.setBounds(100, 400, 100, 30);
	
	
	
	
	frame.add(text1);
	frame.add(pass);
	frame.add(text2);
	frame.add(text3);
	frame.add(text4);
	frame.add(text5);
	frame.add(button);
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String v1=text1.getText();
			String v2=new String(pass.getPassword());
			String v3=text2.getText();
			String v4=text3.getText();
			String v5=text4.getText();
			String v6=text5.getText();
			
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
			 
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
		
				Statement st=c.createStatement();
				int r=st.executeUpdate("insert into t values('"+v1+"','"+v3+"','"+v2+"','"+v4+"','"+v5+"','"+v6+"')");
						
				JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
				
			}catch(Exception ee) 
			{
			System.out.println(ee);	
			}
			
		}
	});
	
	
	
	frame.setSize(700,800);
	frame.setLayout(null);
}
}