package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login1 {
	
	Login1()
	 {
		
		JFrame frame=new JFrame();
		
		frame.setVisible(true);
		String sc[]= {"Admine","Employee"};
		
		JComboBox cb=new JComboBox(sc);
		cb.setBounds(100, 50, 300, 30); 
		
		JTextField text1=new JTextField();
		text1.setBounds(100, 100, 300, 30);
		
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100, 150, 300, 30);
		
		JButton button=new JButton("Loging");
		button.setBounds(100, 200, 100, 30);
		
		
		JButton button2=new JButton("Showdatabases");
		button2.setBounds(100, 250, 100, 30);
		
		
		frame.add(cb);
		
		frame.add(text1);
		frame.add(pass);
		frame.add(button);
		frame.add(button2);
		
		frame.setSize(500,600);
		
		frame.setLayout(null);
		
		
		
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new	AllDATAname();
				
			}
		});
		button.addActionListener(new ActionListener() {
			
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String v1=text1.getText();
				String v2=new String(pass.getPassword());
				String v5=cb.getSelectedItem().toString();
				
				
					
					
					
					
					
					
				try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
			     Statement st=c.createStatement();
			     
			     if(v5=="Admine")
			     {
			    	 ResultSet rs=st.executeQuery("select * from t where Id='"+v1+"' and  pass='"+v2+"'");
			    	 if(rs.next()) {
			    	 
			    	 new Buttun1();
			    	 }
			    	 else
				     {
				    	 
				    	 JOptionPane.showMessageDialog(null, "pelese Inter right id and password");
				    	 new Login1();
				     }
			     }
			     
				
			      if(v5=="Employee")
			     {
			    	  ResultSet rs=st.executeQuery("select * from p where Id='"+v1+"' and  pass='"+v2+"'");
			    	  if(rs.next())
			    	  {
			    	 new Button3();
			    	  }
			    	  else 
			    	  {
			    		  JOptionPane.showMessageDialog(null, "pelese Inter right id and password");
					    	 new Login1();
					    	 frame.dispose();
			    	  }
			    	  }
			    
			     
			     
			     
			     
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//if(rs.next())
			//{
				//System.out.println("don");
				//Buttun1 b=new Buttun1();
			//}
			
			  //   else
			     //{
			    //	 JOptionPane.showMessageDialog(null, "pelese Inter right id and password");
				//new Login1();
			     //}
			    // ResultSet s=st.executeQuery("INSERT INTO t VALUES ('1', 'Stavanger', 'Stavanger','Stavanger@gmail.com','Delhi','abcd')");
				
				
				
				c.close();
				
				}
				catch (Exception ee) {
					// TODO: handle exception
					
					System.out.println(ee);
				}
			}
		});
	 }
		public static void main(String args[])
		{
			
			new Login1();
	}

}
