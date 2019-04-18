import java.awt.Container;

import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("Content Pane and JFrame");
		setDefault(JFrame.EXIT_ON_CLOSE);
		
		Container contentpane = getContentPane();
		contentpane.setBackground(Color.RED);
		contentpane.setLayout(new FlowLayout);
		
		contentpane.add(new JButton("OK"));
		contentpane.add(new JButton("CANCEL"));
		contentpane.add(new JButton("IGNORE"));
		
		setSize(300,200);
		setVisble(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();

	}

}
