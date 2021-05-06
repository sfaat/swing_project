package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttun2 {
	Buttun2()
	{
	JFrame f=new JFrame();
	f.setVisible(true);
	f.setSize(400,500);
	f.setLayout(null);
	
	
	JButton button=new JButton("Registation");
	button.setBounds(100, 200, 100, 30);
	
	JButton button1=new JButton("Login");
	button1.setBounds(100, 250, 100, 30);
	
	
	JButton button2=new JButton("Settings");
	button2.setBounds(100, 300, 100, 30);
	
	
	f.add(button1);
	f.add(button);
	f.add(button2);
	
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new AdminRegistationForm();
		}
	});
	
	
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		new	LoginAdmine();
			 
		}
	});
	
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	
	}
}
