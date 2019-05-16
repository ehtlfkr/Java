package ggd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ggdEx extends JFrame{
	
	int a;

	public ggdEx(){
		setTitle("구구단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		
		cc.add(jb1);
		cc.add(jb2);
		cc.add(jb3);
		cc.add(jb4);
		cc.add(jb5);
		cc.add(jb6);
		cc.add(jb7);
		cc.add(jb8);
		cc.add(jb9);
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 1;
				new newWindow(a);
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 2;
				new newWindow(a);
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 3;
				new newWindow(a);
			}
		});
		
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 4;
				new newWindow(a);
			}
		});
		
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 5;
				new newWindow(a);
			}
		});
		
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 6;
				new newWindow(a);
			}
		});
		
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 7;
				new newWindow(a);
			}
		});
		
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 8;
				new newWindow(a);
			}
		});
		
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 9;
				new newWindow(a);
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ggdEx();

	}

}

class newWindow extends JFrame{
	newWindow(int d){
		setTitle(d+"단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		for(int a = 1; a <= 9; a++){
			int c = d*a;
			String tt = String.valueOf(c);
			JLabel JL = new JLabel(d+" * "+a+" = "+tt);
			JL.setPreferredSize(new Dimension(250, 17));
			cc.add(JL);
		}
		
		JButton dd = new JButton("닫기");
		dd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		add(dd);
		
		setSize(300, 280);
		setVisible(true);
	}
}
