import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	
	public ToolTipEx() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 150);
		setVisible(true);
		
	}
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("JiHwan Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�");
		bar.add(newBtn);
		
		JButton openBtn = new JButton("Open");
		openBtn.setToolTipText("������ ���ϴ�");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton("Save");
		saveBtn.setToolTipText("������ �����մϴ�");
		bar.add(saveBtn);
		bar.add(new JLabel("Search"));
		
		JTextField tf = new JTextField("Text Field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���");
		bar.add(tf);
		
		contentPane.add(bar, BorderLayout.NORTH);
		
		
	}
	
	public static void main(String[] args) {
		new ToolTipEx();
	}

}
