import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ColorMenu extends JFrame {
		
	public static Container c;

	public ColorMenu() {
		setTitle("Color Menu");
		createMenu();
		Container c = getContentPane();
		c.setBackground(Color.black);
		
		setSize(500, 200);
		setVisible(true);
	}
	
	private void createMenu () {

		MenuActionListener listener = new MenuActionListener();
		String [] colors = {"red", "blue", "green", "pink"};
		JMenuItem [] getColor = new JMenuItem[4];
		JMenuBar mb = new JMenuBar();		
		JMenu screenMenu = new JMenu("Colors");
		
		for(int i = 0; i < colors.length; i++) {
			getColor[i] = new JMenuItem(colors[i]);
			getColor[i].addActionListener(listener);
			screenMenu.add(getColor[i]);
		}
		
		mb.add(screenMenu);
		
		setJMenuBar(mb);
		
		
	}
	
	class MenuActionListener implements ActionListener {
		
		Container c = getContentPane();
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "red":
				c.setBackground(Color.RED);
				break;
			case "blue":
				c.setBackground(Color.BLUE);
				break;
			case "green":
				c.setBackground(Color.GREEN);
				break;
			case "pink":
				c.setBackground(Color.PINK);
				break;
			}	
		}
	}

	
	public static void main(String[] args) {
		new ColorMenu();

	}

}
