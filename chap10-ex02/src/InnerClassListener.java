import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("오늘의 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("inkyung");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);

	}	
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("inkyung")) 
				b.setText("인경");
			else 
				b.setText("inkyung");
			
	
			InnerClassListener.this.setTitle(b.getText());  
		}
	}	
	public static void main(String [] args) {
		new InnerClassListener();
	}
} 