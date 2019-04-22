import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] name = {"사과", "배", "체리" } ;
	private JLabel sumLabel;
	
	
	
	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i; i < fruits.length; i++){
			fruits[i] = new JCheckBox(names[i]); // names[]의 문자열로 체크박스 생성
			fruits[i].setBorderPainted(true); // 체크박스 외곽선 보이도록 설정
			c.add(fruits[i]); // 컨텐트팬에 체크박스 삽입
			fruits[i].addItemListener(listener); // 체크박스에 Item 리스너 등록
		}
		
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0;
		
		public void itemStateChanged(ItemEvent e){
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
