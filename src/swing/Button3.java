package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button3 {
  
	Button3()
	{
		JFrame frame=new JFrame();
		
		frame.setVisible(true);
		frame.setSize(600,700);
		frame.setLayout(null);
		 
		
		JButton button =new JButton("Add Product");
		button.setBounds(100, 100, 200, 40);
		
		JButton button1 =new JButton("Update");
		button1.setBounds(100, 150, 200, 40);
		
		JButton button2 =new JButton("Delete");
		button2.setBounds(100, 200, 200, 40);
		
		JButton button3 =new JButton("Show");
		button3.setBounds(100, 250, 200, 40);
		
		JButton button4 =new JButton("Sell");
		button4.setBounds(100, 300, 200, 40);
		
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Emp();
			}
		});
		
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new UpdateEmp();
			}
		});
		
		
		
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			new	DeleteEmp();
				
			}
		});
		
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 new ShowEmp();
			}
		});
		
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		
	}
	
}
