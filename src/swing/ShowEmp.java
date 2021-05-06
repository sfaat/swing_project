package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ShowEmp {
	
  public ShowEmp()
{

		
		
	
JFrame f=new JFrame();
f.setVisible(true);
f.setSize(400, 500);

f.setLayout(null);


JTextField text =new JTextField();
text.setBounds(100, 50, 100, 30);
f.add(text);

JButton b=new JButton("Showdata");

b.setBounds(100, 100, 100, 30);
f.add(b);
f.setLayout(null);
f.setSize(400,500);
b.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	JFrame f=new JFrame();
		 String v1=text.getText();
		
		 JTable jt=new JTable(0,8);    
		    jt.setBounds(30,40,400,300);          
		    JScrollPane sp=new JScrollPane(jt);    
		    f.add(sp);
		    f.add(jt);
		

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
		    Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select *from Product where id='"+v1+"'");
			DefaultTableModel model=(DefaultTableModel) jt.getModel();
			while(rs.next())
			{
			
			//System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
			//JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
		        String Id=rs.getString("Id");
	        	String name=rs.getString("name");
				String Product=rs.getString("Product");
				
				String Quantity=rs.getString("Quantity");
				String Description=rs.getString("Description");
				String date=rs.getString("date");
				String price=rs.getString("price");
				
				
                model.addRow(new Object[] {Id,name,Product,Quantity,Description,date,price});
			
			}
			st.close();
			
		}catch(Exception ee) 
		{
		System.out.println(ee);	
		}

		
		
		
	}
});
	
	
		
		
		
		
		
			}

		
		
		
		
		}	

		
	

