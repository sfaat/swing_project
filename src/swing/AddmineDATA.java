package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddmineDATA {
	
	AddmineDATA()

	{
	JFrame f=new JFrame();
	f.setSize(400, 500);
	f.setVisible(true);
	f.setLayout(null);
	
	JTable jt=new JTable(0,5);    
    jt.setBounds(30,40,400,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);
    f.add(jt);

    try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
	Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("select *from r");
		DefaultTableModel model=(DefaultTableModel) jt.getModel();
		while(rs.next())
		{
		//System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
		//JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
	        String name=rs.getString("name");
        	String pass=rs.getString("pass");
			String Email=rs.getString("Email");
			
			String Gender=rs.getString("Gender");
			String Country=rs.getString("Country");
			String ID=rs.getString("ID");
            model.addRow(new Object[] {name,pass,Email,Gender,Country,ID});
		
		}
		st.close();
		
	}catch(Exception ee) 
	{
	System.out.println(ee);	
	}

	

	
	}
	
}
