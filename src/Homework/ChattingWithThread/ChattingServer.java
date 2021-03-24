import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MakeID extends JDialog {
	private JTextField name = new JTextField(10);
	private JButton okbtn = new JButton("Ok");
	String id; 
	
	
	public MakeID (JFrame frame, String title) {
		
		super(frame, title, true);
		setLayout(new FlowLayout());
		
		
		okbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ID를 입력하세요");
					return;
				}
				id = name.getText();
				setVisible(false);
			}
		});
		add(name);
		add(okbtn);
		
		setSize(200, 95);
		setVisible(true);
	}
}

public class ChattingServer extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver;
	private JTextField sender;
	private MakeID makeId;
	private String id;
	
	public ChattingServer() {
		setTitle("서버 채팅창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		sender = new JTextField();
		sender.addActionListener(this);
		
		makeId = new MakeID(this, "아이디 설정");
		id = makeId.id;
		
		add(new JScrollPane(receiver), BorderLayout.CENTER);
		add(sender, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver);
		th.start();
	}
	
	private void setupConnection() throws IOException{
		listener = new ServerSocket(9999);
		socket = listener.accept();
		receiver.append("클라이언트로부터 연결 완료");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String msg = null;
			while(true) {
				try {
					msg = in.readLine();
				} catch (IOException e) {
					handleError(e.getMessage());
				}
				this.append("\n " + id + "에게 온 메세지 : " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sender) {
			String msg = sender.getText();
			try {
				out.write(msg + "\n");
				out.flush();
				
				receiver.append("\n "+ id +" : " + msg);
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos);
				sender.setText(null);
			} catch (Exception e1) {
				handleError(e1.getMessage());
			}
		}
		
	}

	
	public static void main(String[] args) {
		new ChattingServer();

	}
}
