import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class RandomThead extends Thread{
	private Container contentPane;
	private boolean flag = false;
	
	public RandomThead(Container contentPane){
		this.contentPane = contentPane;
	}
	
	void finish(){
		flag = true;
	}
	
	public void run(){
		while(true){
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try{
				Thread.sleep(300);
				if(flag == true){
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
					
				}
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
	
}

public class ThreadFinishFlagEx extends JFrame {
	
	private RandomThead th;
	
	public ThreadFinishFlagEx(){
		setTitle("글자 나오다 말기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e){
				th.finish();
			}
			
			
		});
		
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThead(c);
		th.start();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();
	}

}
