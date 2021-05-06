package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javax.swing.text.Document;

public class Coustomer 
{

	public Coustomer(DefaultTableModel m ) 
		
	

	
	
//	public static void main(String args[])
	{
JFrame frame=new JFrame();
		
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setLayout(null);
		
		
		
		
		
		 JTable jt=new JTable (m);    
		    jt.setBounds(450,100,200,300);
		    
		    
		    
		    
		    
		    
		JTextField text1=new JTextField();
		
		
		text1.setBounds(100, 100, 300, 30);
		
		
		JTextField text2=new JTextField();
		text2.setBounds(100, 150, 300, 30);
		
		JTextField text3=new JTextField();
		text3.setBounds(100, 250, 300, 30);
		
		JTextField text4=new JTextField();
		text4.setBounds(100, 300, 300, 30);
		
		
		
		
		//JTextField text5=new JTextField();
		//text5.setBounds(100, 350, 300, 30);
		
		JButton print=new JButton("Print");
		print.setBounds(100, 400, 100, 30);
		
		
		
		
		frame.add(text1);
		frame.add(jt);
		
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		//frame.add(text5);
		frame.add(print);
		
		
		print.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				String v1=text1.getText();
				String v2=text2.getText();
				String v3=text3.getText();
				String v4=text4.getText();
				
								
				
				
				
				
				//Document doc=new Document(m);
				//try {
					//PdfWriter writer=PdfWriter.getInstance(doc,new FileOutputStream("tech.pdf"));
					
					//doc.open();
					
					//PDFTable table=new PdfTable(m);
					//table.setWidthPercentage(105);
					
					
		            //doc.add(table); 
		            //doc.close();
		            //writer.close();
				//}
				//catch ()//DocumentException e) 
					//	{
					//e.printStackTrace();
			//	}
				
				

			
					
				
				
				try {
					
					
					
					
					
				
					//jt.print();
					//jt.print();
					
					Class.forName("com.mysql.jdbc.Driver");
					 
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
			
					Statement st=c.createStatement();
					int r=st.executeUpdate("insert into Coustomer values('"+v1+"','"+v2+"','"+v3+"','"+v4+"')");
					JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
					jt.print();
					
					//MessageFormat head=new MessageFormat("report print");
					//MessageFormat fo=new MessageFormat("page{0, number,integer}");
				
			
				
				}
			catch (Exception eee) {
			
				System.out.println(eee);
			}
				
			}	
				
				
			});

			
		
		}

		
	
	

		
		
	
	


}
