import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon flagIcon = new ImageIcon("Image/image1.png");
		ImageIcon checkFlag = new ImageIcon("Image/image2.png");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��");
		JCheckBox flag = new JCheckBox("����", flagIcon);
		
		flag.setBorderPainted(true);
		flag.setSelectedIcon(checkFlag);
		
		c.add(apple);
		c.add(pear);
		c.add(flag);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
