import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("인경누님이 좋습니다요");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("inkyung");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("inkyung")) 
					b.setText("인경");
				else 
					b.setText("inkyung");
				
				
				setTitle(b.getText());
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}	
	public static void main(String [] args) {
		new AnonymousClassListener();
	}
}