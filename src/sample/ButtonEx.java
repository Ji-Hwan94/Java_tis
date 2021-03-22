import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	public ButtonEx () {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normal = new ImageIcon("Image/image1.png");
		ImageIcon rollover = new ImageIcon("Image/image2.png");
		ImageIcon pressed = new ImageIcon("Image/image3.png");
		
		JButton btn = new JButton("Call", normal);
		btn.setPressedIcon(pressed);
		btn.setRolloverIcon(rollover);
		c.add(btn);
		
		this.setSize(250, 150);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}

}
