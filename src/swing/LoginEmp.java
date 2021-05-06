package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginEmp {
	
	LoginEmp()
	{
		JFrame frame=new JFrame("EmpLogin");
		
		frame.setVisible(true);
		JTextField text1=new JTextField();
		text1.setBounds(100, 100, 300, 30);
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100, 150, 300, 30);
		
		JButton button=new JButton("LogingEmp");
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
				ResultSet rs=st.executeQuery("select * from p where Id='"+v1+"' and  pass='"+v2+"'");
					
					c.close();
				}
				catch (Exception eee) {
					// TODO: handle exceptionso
					System.out.println(eee);
				}
			}
		});
		

	}

}



