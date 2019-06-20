import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class userchat extends JFrame {
	private JTextField TextTF = new JTextField(10);
	private JTextArea ContentTF = new JTextArea(18,25);
	private String username = "수용이";
	private JButton calcBtn = new JButton("전송");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	public void username(String username){
		this.username = username;
	}
	
	public userchat() {
		super("userChat");
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JScrollPane(ContentTF));
		c.add(new JScrollPane(TextTF));
		c.add(calcBtn);
		
		setVisible(true);
		setupConnection();
		
		
		calcBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					String Texttext = TextTF.getText().trim();
					
					TextTF.setText("");
					
					if( Texttext == "" )
						return;
					
					out.write(username + " : " + Texttext+"\n");
					out.flush();
					
					ContentTF.append(username + " : " + Texttext + "\n");
					
				} catch (IOException e) {
					System.out.println("클라이언트 : 서버로부터 연결 종료");
					
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
	
	public void run() {
		while(true){
			try{
				String text = in.readLine();
				
				ContentTF.append(text + "\n");
				
			}
			catch (IOException e) {
				return;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new userchat();
	}


}
