import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	
	public CheckBoxEx(){
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		
		JCheckBox aplle = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리");
		
		
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
