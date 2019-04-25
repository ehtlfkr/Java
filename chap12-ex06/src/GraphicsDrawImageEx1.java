import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx1(){
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public ImageIcon icon = new ImageIcon("images/image0.jpg");
		public Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();

	}

}
