import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class ChatingServer extends JFrame {
	
	private JTextArea ta = new JTextArea(10, 25);
	private HashMap<String, String> dic = new HashMap<String, String>();
	public ChatingServer() {
		super("Chat Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����		
		setSize(300, 300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		

		c.add(new JScrollPane(ta));		
		setVisible(true);
		
		startService();
	}
	
	private void startService() {
		ServerThread server = new ServerThread();
		server.start();
	}
	
	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class ServerThread extends Thread {
		
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;

			try {
				listener = new ServerSocket(9998);
			} catch (IOException e1) {
				handleError(e1.getMessage());
			}
			while(true) {
				try {					
					socket = listener.accept(); // waiting client connection
					
					ServiceThread th = new ServiceThread(socket);
					th.start();
				}
				catch(IOException e) {
					handleError(e.getMessage());
					break;
				}
			}
			try {
				listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	class ServiceThread extends Thread {
		private Socket socket;
		
		public ServiceThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				BufferedWriter out = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));
		
				while(true) {
					String engText = in.readLine(); // client �������κ��� �� ���� �ؽ�Ʈ ���۹ޱ�
					
					out.write(engText+"\n");
					out.flush();

					ta.append("���� (" + engText + ")\n");
					int pos = ta.getText().length();
					ta.setCaretPosition(pos); // caret�� ���� ���������� �̵�
				}
			}
			catch(IOException e) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatingServer();
	}

}