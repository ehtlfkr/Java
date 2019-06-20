import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class mainServer extends JFrame {
	private JTextArea TextTF = new JTextArea(5,19);
	private JTextArea ContentTF = new JTextArea(19,25);
	private JButton calcBtn = new JButton("전송");
	private String adminname = "나";
	private String username = "낯선사람";
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public mainServer() {
		super("랜덤채팅");
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setLayout(new FlowLayout());
		c.add(new JScrollPane(ContentTF));
		c.add(new JScrollPane(TextTF));
		c.add(calcBtn);
		setVisible(true);
		setupConnection();
		new ServerThread().start();
		calcBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					String Texttext = TextTF.getText().trim();
	               
					TextTF.setText("");
	               
					if (Texttext == "") 
						return;
					
					out.write(Texttext + "\n");
					out.flush();
	               
					ContentTF.append(adminname + " : " + Texttext + "\n");
	               
				} catch (IOException e) {
					System.out.println("메신저로 부터 연결 종료");
					return;
				}

			}
		});
	}

	class ServerThread extends Thread {
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while (true) {
					socket = listener.accept();
					ContentTF.append(username + "(이)가 입장하였습니다.\n");
					new ServiceThread(socket).start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (listener != null)
					listener.close();
				if (socket != null)
					socket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class ServiceThread extends Thread {
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;

		private ServiceThread(Socket socket) {
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			while (true) {
				try {
					String text = in.readLine();
					
					ContentTF.append(username  + " : " +  text + "\n");
				} catch (IOException e) {
					ContentTF.append(username + "(이)가 퇴장하였습니다.\n");
					System.out.println("메신저로 부터 연결 종료");
					return;
				}
			}
		}
	}

	public void setupConnection() {
		try {
			socket = new Socket("localhost", 9997);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new mainServer();

	}
}


