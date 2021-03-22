import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	private JLabel timerLabel = new JLabel();
	
	public TimerThread(JLabel timJLabel) {
		this.timerLabel = timJLabel;
	}
	
	//시계를 만드는 방법
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e ) {
				return;
			}
		}
	}
	
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx () {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerJLabel = new JLabel();
		timerJLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerJLabel);
		
		TimerThread th = new TimerThread(timerJLabel);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();

	}

}
