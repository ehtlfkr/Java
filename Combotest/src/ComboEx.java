import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboEx extends JFrame {
	private String [] fruits = { "apple", "inkyung1", "inkyung2", "inkyung3", "inkyung4" };
	private ImageIcon [] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/inkyung1.jpg"),
			new ImageIcon("images/inkyung2.jpg"),
			new ImageIcon("images/inkyung3.jpg"),
			new ImageIcon("images/inkyung4.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	

	public ComboEx() {
		setTitle("Secret photo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(1000,800);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new ComboEx();
	}

}