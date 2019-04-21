import javax.swing.*;

import java.awt.*;

public class NotepadEx extends JFrame {
	
	String notename = "제목없음";
	
	public NotepadEx() {
		setTitle(notename + " - Notepad");
		createMenu();
		createTextArea();
		setSize(1000, 800);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		String [] text = { "파일(F)", "편집(E)", "서식(O)", "보기(V)" ,"도움말(H)"};

		
		for (int i = 0; i < text.length; i++  ){
			
			mb.add(new JMenu(text[i]));
			
			this.setJMenuBar(mb);
			
		}
		
		
		mb.setBackground(Color.WHITE);
		
	}

	private void createTextArea() {	
		
		JTextArea a = new JTextArea(1000, 800);
		
		a.setFont(new Font("맑은고딕", Font.ITALIC, 20));
		
		add(a, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new NotepadEx();
	}
}