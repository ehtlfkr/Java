package home;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyDialog extends JDialog {
	public MyDialog() {
		setTitle(" �۲� ");
		setSize(300,300);
	}
}



public class NotepadEx extends JFrame {
	
	MyDialog dialog;
	
	String notename = "�������";
	
	public NotepadEx() {
		setTitle(notename + " - Notepad");
		createMenu();
		createTextArea();
		setSize(1000, 800);
		setVisible(true);
		
		dialog = new MyDialog();
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();

		JMenu menu1 = new JMenu("����(F)");
		JMenu menu2 = new JMenu("����(E)");
		JMenu menu3 = new JMenu("����(O)");
		JMenu menu4 = new JMenu("����(V)");
		JMenu menu5 = new JMenu("����(H)");
		
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		mb.add(menu4);
		mb.add(menu5);
			
		
		this.setJMenuBar(mb);
		
		mb.setBackground(Color.WHITE);
		
		
		menu3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		
		
		
	}

	private void createTextArea() {	
		
		JTextArea a = new JTextArea();
		
		a.setFont(new Font("�������", Font.CENTER_BASELINE, 20));
		
		this.add(a);
	}

	
	public static void main(String[] args) {
		new NotepadEx();
	}
	
	
}





