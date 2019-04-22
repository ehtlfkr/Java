import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	
	public CheckBoxEx(){
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		
		JCheckBox aplle = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��");
		JCheckBox cherry = new JCheckBox("ü��");
		
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		
		c.add(aplle);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
