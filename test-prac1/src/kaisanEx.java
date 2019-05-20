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
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	String tt;
	String numt[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
	String tt2[] = { "+", "-", "*", "/", "%" };
	
	private JTextArea text = new JTextArea(2, 25);
	
	public kaisanEx(){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		
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
				if(tt == null)
					text.setText("");
				else {
					switch (tt) {
						case "+":
							dh dh = new dh();
							int nan1 = dh.dhtest(num1, num2);
							text.setText("");
							text.append(String.valueOf(nan1));
							num1 = nan1;
							num2 = 0;
							number1 = 1;
							number2 = 1;
							tt = null;
							
							break;
							
						case "-":
							bg bg = new bg();
							int nan2 = bg.bgtest(num1, num2);
							text.setText("");
							text.append(String.valueOf(nan2));
							num1 = nan2;
							num2 = 0;
							number1 = 1;
							number2 = 1;
							tt = null;
							
							break;
							
						case "*":
							gh gh = new gh();
							int nan3 = gh.ghtest(num1, num2);
							text.setText("");
							text.append(String.valueOf(nan3));
							num1 = nan3;
							num2 = 0;
							number1 = 1;
							number2 = 1;
							tt = null;
							
							break;
							
						case "/":
							nn nn = new nn();
							int nan4;
							if(num1 < num2){
								text.setText("");
								text.append("나누는 수가 더 크면 나눌 수 없습니다.");
								tt = null;
							}
							
							else if(num2 != 0){
								nan4 = nn.nntest(num1, num2);
								text.setText("");
								text.append(String.valueOf(nan4));
								num1 = nan4;
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
							int nan5;
							
							if(num1 < num2){
								text.setText("");
								text.append("나누는 수가 더 크면 나눌 수 없습니다.");
								tt = null;
							}
							
							else if(num2 != 0){
								nan5 = nm.nmtest(num1, num2);
								text.setText("");
								text.append(String.valueOf(nan5));
								num1 = nan5;
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
			}
		});
		
		
		setSize(300,400);
		setVisible(true);
	}
	

	

	public static void main(String[] args) {
		new kaisanEx();
	}

}
