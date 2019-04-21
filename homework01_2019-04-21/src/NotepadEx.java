import javax.swing.*;

import java.awt.*;

public class NotepadEx extends JFrame {
	
	String notename = "�������";
	
	public NotepadEx() {
		setTitle(notename + " - Notepad");
		createMenu();
		createTextArea();
		setSize(1000, 800);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		String [] text = { "����(F)", "����(E)", "����(O)", "����(V)" ,"����(H)"};

		
		for (int i = 0; i < text.length; i++  ){
			
			mb.add(new JMenu(text[i]));
			
			this.setJMenuBar(mb);
			
		}
		
		
		mb.setBackground(Color.WHITE);
		
	}

	private void createTextArea() {	
		
		JTextArea a = new JTextArea(1000, 800);
		
		a.setFont(new Font("�������", Font.ITALIC, 20));
		
		add(a, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new NotepadEx();
	}
}