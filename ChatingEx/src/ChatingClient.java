import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class ChatingClient extends JFrame {
	private Socket socket = null;
	private TextField Chattext = new TextField(20);
	private TextArea Chatcontent = new TextArea(20, 38);
	private JButton sendbtn = new JButton("����");
	BufferedReader in = null;
	BufferedWriter out = null;
	
	
	public ChatingClient() {
		
		setTitle("�������� �Ǵٸ� ä��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JScrollPane(Chatcontent));
		c.add(new JScrollPane(Chattext));
		c.add(new JScrollPane(sendbtn));
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		sendbtn.addActionListener(new MyActionListener());
		
		setSize(300, 500);
		setVisible(true);
	}
	
	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9998); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				out.write(Chattext.getText()+"\n");
				out.flush();
				Chattext.setText("");
				String text = in.readLine();
				Chatcontent.append("�ּ��� : "+text+"\n"+"\n");
			} catch (IOException e2) {
				handleError(e2.getMessage());
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatingClient();
	}

}
