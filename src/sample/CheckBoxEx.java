import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon flagIcon = new ImageIcon("Image/image1.png");
		ImageIcon checkFlag = new ImageIcon("Image/image2.png");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox flag = new JCheckBox("국기", flagIcon);
		
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
