package swing;






import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



import java.sql.*;


public class Registation {
	public static void main(String args[]) 
	{
		JFrame jf=new JFrame("reg");
		
		
		JTextField tf=new JTextField();
		//JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		
		JButton jb=new JButton("submit");
		JPasswordField pf=new JPasswordField();
		
		
		JRadioButton r1=new JRadioButton("A) Male");    
		JRadioButton r2=new JRadioButton("B) Female");  
		
		
		
		r1.setBounds(100,300,100,30);    
		r2.setBounds(100,350,100,30);
		ButtonGroup grup=new ButtonGroup();
		grup.add(r1);
		grup.add(r2);
		  String country[]={"India","Aus","U.S.A","England","Newzealand"};        
		    JComboBox cb=new JComboBox(country);    
		    cb.setBounds(100, 400,300,20);  
		tf.setBounds(100, 100, 300, 25);
		//tf1.setBounds(100, 100, 300, 25);
		tf2.setBounds(100, 200, 300, 25);
		pf.setBounds(100, 150, 300, 25);
		jb.setBounds(100, 450, 100, 25);
		r1.setBounds(100,300,100,30);    
		r2.setBounds(100,350,100,30);
		
		jf.add(pf);
		//jf.add(tf1);
		jf.add(tf2);
		jf.add(tf);
		jf.add(jb);
		jf.add(r1);
		jf.add(r2);
		jf.add(cb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
		
				String v1=tf.getText();
				String v2=new String(pf.getPassword());
				String v3=tf2.getText();
				//String v4=gen.getText();s
				
				String gen=null;
				
				if(r1.isSelected()) 
				{
					gen="male";
				}else if(r2.isSelected()) 
				{
					gen="female";
				}
				String v5=cb.getSelectedItem().toString();
				
				
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
				 
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/r","root","root");
			
					Statement st=c.createStatement();
					int r=st.executeUpdate("insert into r values('"+v1+"','"+v2+"','"+v3+"','"+gen+"', '"+v5+"')");
					JOptionPane.showMessageDialog(null, "your data is sucsesfully uplode");
					
				}catch(Exception ee) 
				{
				System.out.println(ee);	
				}
			}
		});
		
		jf.setSize(500,600);
		jf.setLayout(null);
		jf.setVisible(true);
	}

}