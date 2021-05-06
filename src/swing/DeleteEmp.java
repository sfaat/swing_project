package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DeleteEmp {
	DeleteEmp()
	{
		JFrame f=new JFrame();
		
		
		////	JButton b=new JButton("UPLODE");
			//b.setBounds(100, 300, 100, 30);
			f.setVisible(true);
			
			JTextField t=new JTextField();
			t.setBounds(100, 100, 300, 30);
			
			
			//JTextField t2=new JTextField();
			//t2.setBounds(100, 150, 300, 30);
			
			JButton button=new JButton("UPLODE");
			button.setBounds(100, 250, 300, 30);
			
			
			f.add(t);
			//.f.add(t2);
			f.add(button);
			f.setLayout(null);
			f.setSize(500,600);
			
			
			
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String v1=t.getText();
					//String v2=t2.getText();
					
					
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
						Statement st=c.createStatement();
						
						int rs=st.executeUpdate("   DELETE FROM Product WHERE name='"+v1+"' ");  
						
						  
						//JOptionPane.showMessageDialog(null, "done");
					}
					
					
					catch (Exception eE) {
						// TODO: handle exception
						System.out.println(eE);
					}
				}
			});
			
	}
}
