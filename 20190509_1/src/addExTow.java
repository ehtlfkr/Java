import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addExTow extends JFrame{
	
	public addExTow (){
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("���ϱ�");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("���ϱ�");
		JButton btn4 = new JButton("������");
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
		setTitle("���ϱ�");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("���ϱ� �ұ?");
		jp.add(tt);
		
		
		
		setSize(300,300);
		setVisible(true);
	}
	
}

class mawindow extends JFrame{
	public mawindow(){
		setTitle("����");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("���ϱ� �ұ?");
		jp.add(tt);
		
		
		setSize(300,300);
		setVisible(true);
	}
}

class muwindow extends JFrame{
	public muwindow(){
		setTitle("���ϱ�");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("���ϱ� �ұ?");
		jp.add(tt);
		
		
		
		setSize(300,300);
		setVisible(true);
	}
}

class diwindow extends JFrame{
	public diwindow(){
		setTitle("������");
		
		JPanel jp = new JPanel();
		
		JLabel tt = new JLabel("���ϱ� �ұ?");
		jp.add(tt);
		
		
		setSize(300,300);
		setVisible(true);
	}
}
