package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AllDATAname {
 
	
	{
	JFrame f= new JFrame();  
	
   
	f.setVisible(true);
	
	
    JButton b1=new JButton("AddmineDATA");
    b1.setBounds(100, 100, 150, 30);
    
    
    JButton b2=new JButton("EmployeeDATA");
    b2.setBounds(100, 150, 150, 30);
    
    
    JButton b3=new JButton("ShowProductDATA");
    b3.setBounds(100, 200, 150, 30);
    
    JButton b4=new JButton("CoustomerDATA");
    b4.setBounds(100, 250, 150, 30);
    
    
    
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    
  //  f.setVisible(true);
    f.setSize(500,600);
    f.setLayout(null);
    
    
    b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new AddmineDATA();
		}
	});
    
    
b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new EmployeeDATA();
			
		}
	});


b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	new  ShowProductDATA();	
	}
});

b4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	new	CoustomerDATA();
	}
});

    
    
    
    
    
	}
	
}
