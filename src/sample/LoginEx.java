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
	private JButton login = new JButton("�α���");
	
	public MakeLogin(JFrame frame, String title) {
		super(frame, title, true);
		setLayout(new FlowLayout());
		
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����� �ʾҽ��ϴ�.");
					return;
				}
				if(pw.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����� �ʾҽ��ϴ�.");
					return;
				}
				else {
					JOptionPane.showMessageDialog(null, "�α����� �����߽��ϴ�.");
					setVisible(false);
				}
				
			}
		});
		
		add(new JLabel(" ���̵� "));
		add(id);
		add(new JLabel("��й�ȣ"));
		add(pw);
		add(login);
		
		setSize(100, 200);
	
	}
	
}

public class LoginEx extends JFrame {
	private MakeLogin ml;
	
	public LoginEx() {
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("�α���");
		
		ml = new MakeLogin(this, "�α��� ����");
		
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
