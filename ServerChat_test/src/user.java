import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class user extends JFrame {
	private JTextField TextTF = new JTextField(10);
	private String username = "";
	private JButton calcBtn = new JButton("Chating Start");
	private userchat userchat;
	
	
	public user() {
		super("userChat");
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(TextTF);
		c.add(calcBtn);
		
		setVisible(true);
		
		calcBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				username = TextTF.getText();
				
				if(username != ""){
					userchat.username(username);
					userchat.();
					setVisible(false);
				}
				
			}
		});
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new user();
	}

}
