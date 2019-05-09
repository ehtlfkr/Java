import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addEx extends JFrame{
	
	private static final JLabel JLabel = null;

	int a = 0;
	int b = 0;
	String c = "";
	
	public addEx () {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		zapan(JLabel);
		
		setSize(250, 200);
		setVisible(true);
	}

	public void zapan(JLabel aa){
		JPanel jp = new JPanel();
		
		setContentPane(jp);
		jp.setBackground(Color.darkGray);
		
		String nan[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String yan[] = {"+", "-", "*", "/", "=", "CE" };
		
		int num = 0;
		
		for(int i = 0; i <nan.length; i++){
			JButton jb = new JButton(nan[i]);
			jp.add(jb);
		}
		
		
		for(int i = 0; i <yan.length; i++){
			JButton jb = new JButton(yan[i]);
			jp.add(jb);
		}
		
		if(aa != null){
			JTextField tt = new JTextField(""+aa);
			jp.add(tt);
		}
		if(aa == null){
			JTextField tt = new JTextField(10    );
			jp.add(tt);
		}
	}
	
	public void plma(){
		int ban = 0;
		
		if(c == "+")
			ban = a+b;
		if(c == "-")
			ban = a-b;
		
		ans(ban);
	}
	
	public void mudi(){
		int ban = 0;
		
		if(c == "*")
			ban = a*b;
		if(c == "/")
			ban = a/b;
		
		ans(ban);
	}
	
	public void ans(int n){
		
		JLabel aa = new JLabel("결과 : " + n);
		zapan(aa);
		
	}
	

	public static void main(String[] args) {
		new addEx();
	}

}
