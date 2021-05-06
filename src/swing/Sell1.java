
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Sell1 {
///public	Sell1()
	public static void main(String args[])
	{
		JFrame f= new JFrame("Label Example");  
		
		 f.setLayout(null);  
	    JLabel l1,l2,l3,l4,l5,l6,l7; 
	    
	    JTextField text=new JTextField();
	    text.setBounds(50, 10, 100, 30);
	    
	    
	    JButton button1=new JButton("Select");
		button1.setBounds(200, 10, 100, 30);
	    
		 JButton button=new JButton("Add");
			button.setBounds(100, 400, 100, 30);
			
	    
			
			 JButton button2=new JButton("Invoice");
				button2.setBounds(100, 450, 100, 30);
				
			
	    l1=new JLabel();
	    l1.setBounds(50,50, 100,30);  
	    
	    
	    l2=new JLabel();  
	    l2.setBounds(50,100, 100,30);
	    
	    
	    l3=new JLabel();  
	    l3.setBounds(50,150, 100,30);
	    
	    l4=new JLabel();  
	    l4.setBounds(50,200, 100,30);
	    
	    l5=new JLabel();  
	    l5.setBounds(50,250, 100,30);
	    
	    
	    l6=new JLabel();  
	    l6.setBounds(50,300, 100,30);
	    
	    l7=new JLabel();  
	    l7.setBounds(50,350, 100,30);
	    
	   
	    
	    JTable jt=new JTable(0,2);    
	    jt.setBounds(350,100,200,300);
	    
	    
	    
	    
	    f.add(l1); f.add(l2);
	    f.add(l3);
	    f.add(l4);
	    f.add(l5);
	    f.add(l6);
	    f.add(l7);
	    f.add(jt);
	    f.add(button);
	    f.add(text);
	    f.add(button1);
	    f.add(button2);
	    
	    f.setSize(700,800);  
	   
	    f.setVisible(true);  
	    
	    
	    
	    
	    
	    

	    
	    button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String v1=text.getText();
					
				try {
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
				    Statement st=c.createStatement();
					ResultSet rs=st.executeQuery("select *from Product where id='"+v1+"'");
					while(rs.next())
					{
					
					//System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
					//JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
				        
			        	String id=rs.getString("id");
						String name=rs.getString("name");
						String product=rs.getString("product");
						String Quantity=rs.getString("Quantity");
						String Description=rs.getString("Description");
						String date=rs.getString("date");
						String price=rs.getString("price");
						
						
		                
		                
		                l1.setText(id);
		                l2.setText(name);
		                l3.setText(product);
		                l4.setText(Quantity);
		                l5.setText(Description);
		                l6.setText(date);
		                l7.setText(price);
					
					}
					
					
					
					
					
					
					
				}
				
				
				catch (Exception ee) {
					// TODO: handle exception
					
					System.out.println(ee);
				}
				
			}
		});
	    
		DefaultTableModel model=(DefaultTableModel) jt.getModel();
	    
	    button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
								try {
									
					
				
					String v1=l2.getText();
					String v2=l7.getText();
					
					
					
					
						//String name=rs.getString("name");
						//String product=rs.getString("product");
					//	String Quantity=rs.getString("Quantity");
						//String Description=rs.getString("Description");
						//String date=rs.getString("date");
					//String 
					//Price=rs.getString("Price");
						
					
					
		                model.addRow(new Object[] {v1,v2});
		                
		                
					}
								
				  
				catch (Exception eee) {
					// TODO: handle exception
					System.out.println(eee);
					
				}
				  
			}
		});
	    
	    
 button2.addActionListener(new ActionListener() {
	 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String f1=l2.getText();
				//String f2=l7.getText();
				try {
				new	Coustomer(model);
				}
				catch (Exception eeee) {
					System.out.println(eeee);
				}
				
					
				
				
				 
				
			}
		});
	    
	    
	    
	    
	   
	    
	    
	}
}
