package swing;

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

public class LoginAdmine {

	
public	LoginAdmine()
	{
	
	
	
	
	JFrame frame=new JFrame();
	
	frame.setVisible(true);
	JTextField text1=new JTextField();
	text1.setBounds(100, 100, 300, 30);
	
	JPasswordField pass=new JPasswordField();
	pass.setBounds(100, 150, 300, 30);
	
	JButton button=new JButton("Loging");
	button.setBounds(100, 200, 100, 30);
	
	
	
	
	frame.add(text1);
	frame.add(pass);
	frame.add(button);
	
	frame.setSize(500,600);
	
	frame.setLayout(null);
	button.addActionListener(new ActionListener() {
		
		
		
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String v1=text1.getText();
			String v2=new String(pass.getPassword());
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
		     Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("select * from t where Id='"+v1+"' and  pass='"+v2+"'");
		if(rs.next())
		{
			
			 JOptionPane.showMessageDialog(null, "Don");
		}
		
		     else
		     {
		    	 JOptionPane.showMessageDialog(null, "pelese Inter right id and password");
		    	new LoginAdmine();
		     }
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
	
	
	
	
	
	}
	

