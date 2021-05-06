package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class abcd  {
	

	public static void main(String[] args) {
           JFrame frame=new JFrame();
		
		   frame.setVisible(true);
		

		JButton button=new JButton("Admine");
		button.setBounds(100, 200, 100, 30);
		
	
		frame.setLayout(null);
		frame.setSize(400,500);
		
		
		
	
		frame.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			new	EmpRegistationForm();
			}
		});
			
			
		


}
}