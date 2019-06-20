import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class mainServer extends JFrame {
	private JTextField TextTF = new JTextField(10);
	private JTextArea ContentTF = new JTextArea(18,25);
	private JButton calcBtn = new JButton("전송");
	private String adminname = "admin";
	private String username = "";
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	public mainServer(){
		super("Admin Chat");
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JScrollPane(ContentTF));
		c.add(new JScrollPane(TextTF));
		c.add(calcBtn);
		setVisible(true);
		
		
		calcBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					String Texttext = TextTF.getText().trim();
					
					TextTF.setText("");
					
					if( Texttext == "" )
						return;
					
					out.write(adminname + " : " + Texttext+"\n");
					out.flush();
					
					ContentTF.append(adminname + " : " + Texttext+"\n");
					
				} catch (IOException e) {			
					return;
				}
				
			}
		});
		
		new ServerThread().start();
	}
	
	class ServerThread extends Thread{
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while(true){
					socket = listener.accept();
					ContentTF.append(username + "(이)가 접속했습니다.\n");
					new SercverThread(socket).start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class SercverThread extends Thread {
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;

		public SercverThread(Socket socket) {
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			while(true){
				try{
					String text = in.readLine();
					
					ContentTF.append(text + "\n");
					
				}
				catch (IOException e) {
					ContentTF.append("님이 나가셨습니다. \n");
					return;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainServer();
	}

}
