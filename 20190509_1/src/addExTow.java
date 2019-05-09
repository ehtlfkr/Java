import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addExTow extends JFrame{
	
	public addExTow (){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("더하기");
		JButton btn2 = new JButton("뺴기");
		JButton btn3 = new JButton("곱하기");
		JButton btn4 = new JButton("나누기");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new plwindow();	
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mawindow();
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new muwindow();
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new diwindow();
				
			}
		});
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new addExTow();
	}

}

class plwindow extends JFrame{
	public plwindow(){
		setTitle("더하기");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("더하기 할까연?");
		jp.add(tt);
		
		
		
		setSize(300,300);
		setVisible(true);
	}
	
}

class mawindow extends JFrame{
	public mawindow(){
		setTitle("빼기");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("더하기 할까연?");
		jp.add(tt);
		
		
		setSize(300,300);
		setVisible(true);
	}
}

class muwindow extends JFrame{
	public muwindow(){
		setTitle("곱하기");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("더하기 할까연?");
		jp.add(tt);
		
		
		
		setSize(300,300);
		setVisible(true);
	}
}

class diwindow extends JFrame{
	public diwindow(){
		setTitle("나누기");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("더하기 할까연?");
		jp.add(tt);
		
		
		setSize(300,300);
		setVisible(true);
	}
}
