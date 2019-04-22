import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] name = {"���", "��", "ü��" } ;
	private JLabel sumLabel;
	
	
	
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("��� 100��, �� 500��, ü�� 20000��"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i; i < fruits.length; i++){
			fruits[i] = new JCheckBox(names[i]); // names[]�� ���ڿ��� üũ�ڽ� ����
			fruits[i].setBorderPainted(true); // üũ�ڽ� �ܰ��� ���̵��� ����
			c.add(fruits[i]); // ����Ʈ�ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); // üũ�ڽ��� Item ������ ���
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
