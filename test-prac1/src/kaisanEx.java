import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class dh{
	public int dhtest(int a, int b){
		return a+b;
		
	}
}

class bg{
	public int bgtest(int a, int b){
		return a-b;
	}
}

class gh{
	public int ghtest(int a, int b){
		return a*b;
	}
}

class nn{
	public int nntest(int a, int b){
		return a/b;
	}
}

class nm{
	public int nmtest(int a, int b){
		return a%b;
	}
}

public class kaisanEx extends JFrame{
	
	int number1 = 10;
	int number2 = 10;
	int num1;
	int num2;
	int num3;
	int num4;
	String tt;
	String numt[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
	String tt2[] = { "+", "-", "*", "/", "%" };
	
	JTextArea text = new JTextArea(2, 20);

	
	public kaisanEx(){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		text.setFont(new Font("asklashfas", Font.PLAIN, 15));
		
		cc.add(text);
		
		
		for(int i = 0; i < numt.length; i++){
			JButton njb = new JButton(numt[i]);
			cc.add(njb);
			
			njb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource(); 
					String a = b.getText();
					text.append(a);
					
					if( tt == null ){
						num3 = Integer.parseInt(a);	
						num1 = (num1 * number1)+num3;
						
					}
					else{
						num4 = Integer.parseInt(a);
						num2 = (num2 * number2)+num4;
					}
				}
			});
		}
		
		for(int j = 0; j < tt2.length; j++){
			JButton tjb = new JButton(tt2[j]);
			cc.add(tjb);
			tjb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					String a = b.getText();
					text.append(a);
					tt = a;
				}
			});
		}
		
		JButton btn = new JButton("=");
		cc.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nan;
				switch (tt) {
					case "+":
						dh dh = new dh();
						nan = dh.dhtest(num1, num2);
						text.setText("");
						text.append(String.valueOf(nan));
						num1 = nan;
						num2 = 0;
						number1 = 1;
						number2 = 1;
						tt = null;
						
						break;
						
					case "-":
						bg bg = new bg();
						nan = bg.bgtest(num1, num2);
						text.setText("");
						text.append(String.valueOf(nan));
						num1 = nan;
						num2 = 0;
						number1 = 1;
						number2 = 1;
						tt = null;
						
						break;
						
					case "*":
						gh gh = new gh();
						nan = gh.ghtest(num1, num2);
						text.setText("");
						text.append(String.valueOf(nan));
						num1 = nan;
						num2 = 0;
						number1 = 1;
						number2 = 1;
						tt = null;
						
						break;
						
					case "/":
						nn nn = new nn();
						if(num1 < num2){
							text.setText("");
							text.append("나누는 수가 더 크면 나눌 수 없습니다.");
							tt = null;
						}
						
						else if(num2 != 0){
							nan = nn.nntest(num1, num2);
							text.setText("");
							text.append(String.valueOf(nan));
							num1 = nan;
							num2 = 0;
							number1 = 1;
							number2 = 1;
							tt = null;
						}
						
						else if(num2 == 0){
							text.setText("");
							text.append("0으론 나눌 수 없습니다.");
							tt = null;
						}
						
						break;
						
					case "%":
						nm nm = new nm();
						if(num1 < num2){
							text.setText("");
							text.append("나누는 수가 더 크면 나눌 수 없습니다.");
							tt = null;
						}
						
						else if(num2 != 0){
							nan = nm.nmtest(num1, num2);
							text.setText("");
							text.append(String.valueOf(nan));
							num1 = nan;
							num2 = 0;
							number1 = 1;
							number2 = 1;
							tt = null;
						}
						
						else if(num2 == 0){
							text.setText("");
							text.append("0으론 나눌 수 없습니다.");
							tt = null;
						}
						
						break;
	
					default:
				}
			}
		});
		
		JButton clear = new JButton("C");
		cc.add(clear);
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				num1 = 0;
				num2 = 0;
				num3 = 0;
				num4 = 0;
				tt = null;
			}
		});
		
		setSize(300,400);
		setVisible(true);
	}
	

	

	public static void main(String[] args) {
		new kaisanEx();
	}

}
