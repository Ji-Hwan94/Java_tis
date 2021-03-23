import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MakeLogin extends JDialog{
	private JTextField id = new JTextField(10);
	private JPasswordField pw = new JPasswordField(10);
	private JButton login = new JButton("로그인");
	
	public MakeLogin(JFrame frame, String title) {
		super(frame, title, true);
		setLayout(new FlowLayout());
		
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하지 않았습니다.");
					return;
				}
				if(pw.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하지 않았습니다.");
					return;
				}
				else {
					JOptionPane.showMessageDialog(null, "로그인을 성공했습니다.");
					setVisible(false);
				}
				
			}
		});
		
		add(new JLabel(" 아이디 "));
		add(id);
		add(new JLabel("비밀번호"));
		add(pw);
		add(login);
		
		setSize(100, 200);
	
	}
	
}

public class LoginEx extends JFrame {
	private MakeLogin ml;
	
	public LoginEx() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("로그인");
		
		ml = new MakeLogin(this, "로그인 예제");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ml.setVisible(true);
				
			}
		});
		
		getContentPane().add(btn);
		setSize(300, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new LoginEx();

	}

}
