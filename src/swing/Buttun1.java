package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttun1 extends JFrame {
	
	Buttun1()
	{
	JFrame frame=new JFrame();
	
	frame.setVisible(true);
	

	JButton button=new JButton("Admine");
	button.setBounds(100, 200, 100, 30);
	
	JButton button1=new JButton("Emp");
	button1.setBounds(100, 250, 100, 30);
	
	
	frame.add(button1);
	frame.add(button);
	frame.setSize(500,600);
	frame.setLayout(null);
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		new	Buttun2();
			
		}
	});
	
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		new	EmpRegistationForm();
		}
	});
	
	
	
	
	
	}
}

