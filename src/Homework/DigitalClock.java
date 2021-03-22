import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLablel; 
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLablel = timerLabel;
	}
	
	
	@Override
	public void run() {
	
		String hour = null;
		while(true) { 
			timerLablel.setText(hour); 
			try {
				Thread.sleep(1000); 
				SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		      	Calendar cal = Calendar.getInstance();
		      	format1.format(cal.getTime());
		      	hour = format1.format(cal.getTime());	
			}
			catch (InterruptedException e) {
				return; 
			}
		}
	}
}

public class DigitalClock extends JFrame {
	private Thread th;
	public DigitalClock() {
		setTitle("Thread Interrupt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); 
		c.add(timerLabel);
		
		setSize(900, 500);
		setVisible(true);
		
		th.start();
	}
	
	
	public static void main(String[] args) {
		new DigitalClock();
	}
}
