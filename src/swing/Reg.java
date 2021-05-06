

 package swing;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public abstract class Reg {
       public static void main(String args[])
       
       
       { 
    	   
	       JButton b=new JButton("Loging");
    	   JTextField t1=new JTextField();
       
       
    	   JFrame f=new JFrame("LOGING");
   			
   		
   		    t1.setBounds(100, 100, 300, 30);
   		
   		
   		 JPasswordField t2=new JPasswordField();
   		t2.setBounds(100, 150, 300, 30);
   		
   	
   		b.setBounds(100, 200, 120, 30);
   		
   		
   		
   		
   		
   		
   		
   		
   		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String v2=t1.getText();
				String v3=t2.getText();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
					Statement st=c.createStatement();
					
					ResultSet rs=st.executeQuery("select * from r where pass='"+v3+"' and  Email='"+v2+"'");  
					if(rs.next())  
						
						{

						JOptionPane.showMessageDialog(null, "done");
						}
					else 
					{
						JOptionPane.showMessageDialog(null, " not done");
					}
					  
					//JOptionPane.showMessageDialog(null, "done");
					
				}catch(Exception ee) 
				{
				System.out.println(ee);	
				}	
			}
		});
   		
		f.add(t1);
		f.add(t2);
		f.add(b);
		
		
		
		f.setSize(500,600);
		f.setLayout(null); 
			
			
		f.setVisible(true);
		
   		
   		
   		
       }
       }