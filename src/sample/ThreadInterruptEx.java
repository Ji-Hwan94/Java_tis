import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLablel; //Ÿ�̸� ���� ��µ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLablel = timerLabel;
	}
	
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���ѷ���
			timerLablel.setText(Integer.toString(n)); // Ÿ�̸� ���� ���̺� ���
			n++; //ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�� ���� ���� �ܴ�.
			}
			catch (InterruptedException e) {
				return; //���� �߻��� ����
			}
		}
		
	}
	
}

public class ThreadInterruptEx extends JFrame {
	
	private Thread th;
	
	public ThreadInterruptEx() {
		setTitle("Thread Interrupt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//Ÿ�̸� ������� ����� Runnable ��ü�� �����Ѵ�.
		//Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ� �����Ѵ�.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); //������ ����
		c.add(timerLabel);
		
		//��ư�� �����ϰ� Action ������ ���
		JButton btn = new JButton("Stop");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // Ÿ�̸� ������ ���� ����
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //��ư ��Ȱ��ȭ
			}
		});
		
		c.add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); // ������ ���۽�Ŵ
	}
	
	
	public static void main(String[] args) {
		new ThreadInterruptEx();

	}

}
