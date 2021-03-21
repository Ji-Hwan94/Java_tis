import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	
	private final int FLYING_UNIT = 10;
	private JLabel jl = new JLabel("Hello");
	
 	public FlyingTextEx(){
		setTitle("상, 하, 좌, 우 키를 이용해서 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyLisnter());
		jl.setLocation(50, 50);
		jl.setSize(100, 20);
		c.add(jl);
		
		
		this.setSize(500, 500);
		this.setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	class MyKeyLisnter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			
			case KeyEvent.VK_UP:
				jl.setLocation(jl.getX(), jl.getY() - FLYING_UNIT); 
				break;
			case KeyEvent.VK_DOWN:
				jl.setLocation(jl.getX(), jl.getY() + FLYING_UNIT); 
				break;
			case KeyEvent.VK_LEFT:
				jl.setLocation(jl.getX() - FLYING_UNIT, jl.getY()); 
				break;
			case KeyEvent.VK_RIGHT:
				jl.setLocation(jl.getX() + FLYING_UNIT, jl.getY()); 
				break;
				
			
			}
			
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();

	}

}
