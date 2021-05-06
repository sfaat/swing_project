package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

public class temp {

	public static void main(String[] args) throws Exception{
         		JFrame f=new JFrame("reg");
         		f.setSize(600,700);
         		f.setVisible(true);
         		f.setLayout(null);
                
         		JButton jb=new JButton("update");
         		jb.setBounds(100,400,150, 30);
		
		        JTextField tf1=new JTextField();
		        tf1.setBounds(100, 100, 300, 30);
				JTextField tf2=new JTextField();
		       tf2.setBounds(100,200,300, 30);   
			    
				
				String country[]={"name","pass","Email","Gender","Country"};        
			    JComboBox cb1=new JComboBox(country);
			    cb1.setBounds(100,300,150, 30);
				   
			    
			    
			    
			   String country1[]={"name","pass","Email","Gender","Country"};        
			    JComboBox cb2=new JComboBox(country1);
			   cb2.setBounds(100,350,150, 30);
				   
			    
			    f.add(tf1);
			    f.add(tf2);
			    f.add(cb1);
			    f.add(cb2);
			    
			    f.add(jb);
			    
			    
			    
			    jb.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
				String t1=cb1.getSelectedItem().toString();
					String t2=cb2.getSelectedItem().toString();
					
					String v1=tf1.getText();
					String v2=tf2.getText();
					String q="update r set "+t1+"='"+v1+"'where Email=' "+v2+"' " ;

					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
						 
						 Statement st = c.createStatement();
						int rs = st.executeUpdate(q);  
					//	JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
						
					}catch(Exception ee) 
					{
					System.out.println(ee);	
					}
					
					
					
					
					
					
				
					
						
					//	ResultSet rs=st.executeUpdate("update r set t1 ='"+v1+"' where  t2 ='"+v2+"' ");  
											
				
					
					
					
					
					}
					
				});
			   
			    }

	}



