import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	
	public IndepClassListener() {
		setTitle("연습하겠습니다용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("inkyung");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		
		setSize(350,150);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			JButton b= (JButton)e.getSource();
			if(b.getText().equals("inkyung")) {
				b.setText("인경");
			}
			else {
				b.setText("inkyung");
			}
		}
	}

}
