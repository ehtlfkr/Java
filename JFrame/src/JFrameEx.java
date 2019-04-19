import javax.swing.*;

import java.awt.*;

public class JFrameEx extends JFrame {
	
	public JFrameEx() {
		setTitle("ø¨Ω¿¡ﬂ¿‘¥œ¥Ÿ.");
		setSize(1000,800);
		
		Container bar =  this.getContentPane();
		bar.setBackground(Color.LIGHT_GRAY);
		
		this.setLayout(new FlowLayout());
		
		JButton a = new JButton("inkyung");
		a.setBackground(Color.WHITE);
		a.setFont(new Font("∏º¿∫∞ÌµÒ", Font.BOLD, 20));
		a.setForeground(Color.BLACK);
		this.add(a);
	
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx();
	}

}
