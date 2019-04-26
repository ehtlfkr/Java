import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends JFrame{
	public Grid(){
		super("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			int dw = getWidth()/10;
			for(int i = 0; i<=10; i++){
				g.drawLine(i*dw, 0, i*dw, getHeight());
			}
			
			int dh = getHeight()/10;
			for(int i = 0; i<=10; i++){
				g.drawLine(i*dw, 0, i*dw, getWidth());
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid();
	}

}
