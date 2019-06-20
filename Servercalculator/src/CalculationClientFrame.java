import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class CalculationClientFrame extends JFrame {
	private JTextField startTF = new JTextField(5);
	private JTextField operatorTF = new JTextField(5);
	private JTextField endTF = new JTextField(5);
	private JTextField resTF = new JTextField(5);
	private JButton calcBtn = new JButton("�������");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	
	public CalculationClientFrame() {
		super("��� Ŭ���̾�Ʈ");
		setSize(410, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(startTF);
		c.add(operatorTF);
		c.add(endTF);
		c.add(new JLabel(" = "));
		c.add(resTF);
		c.add(calcBtn);
		
		setVisible(true);
		setupConnection();
		
		
		calcBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					String startText = startTF.getText().trim();
					String operatorText = operatorTF.getText().trim();
					String endText = endTF.getText().trim();
					
					if( startText.length() == 0 || operatorText.length() == 0 || endText.length() == 0 )
						return;
					out.write(startText+"\n");
					out.write(operatorText+"\n");
					out.write(endText+"\n");
					out.flush();
					
					String result = in.readLine();
					resTF.setText(result);
					
				} catch (IOException e) {
					System.out.println("Ŭ���̾�Ʈ : �����κ��� ���� ����");
					
					return;
				}
				
			}
		});
	
	}
	
	public void setupConnection() {
		try {
			socket = new Socket("localhost",9998);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculationClientFrame();
	}

}
