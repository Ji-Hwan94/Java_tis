package Homework;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class OuterButton implements ActionListener {

   @Override
   public void actionPerformed(ActionEvent e) {
      JLabel jl = Greeting.jl;
      JButton b = (JButton)e.getSource();
      
      if(b.getText().equals("Click"))
         b.setText("외부 클래스");
      else 
         b.setText("Click");
      SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      format1.format(cal.getTime());
      String hour = format1.format(cal.getTime());
      jl.setText(hour);
      
   }
   
}

public class Greeting extends JFrame {
	static JLabel jl = new JLabel();
	
   public Greeting () {
	   
      setTitle("Greeting");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      jl.setSize(30, 30);
      jl.setLocation(50, 50);
      
      JButton btn = new JButton("Click");
      btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Click"))
               b.setText("익명 클래스");
            else 
               b.setText("Click");
            
            SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            String hour = format1.format(cal.getTime());
            jl.setText(hour);
            
                  
         }
      });
      this.add(btn);
      this.add(jl);
      
      JButton btn2 = new JButton("Click");
      btn2.addActionListener(new OuterButton());
      
      JButton btn3 = new JButton("Click");
      btn3.addActionListener(new innerButton());
      
      
      c.add(btn2);
      c.add(btn3);
      c.add(jl);
      
      this.setSize(350, 150);
      this.setVisible(true);
      
   }
   
   public static void main(String[] args) {
      new Greeting();
      
   }
   
   class innerButton implements ActionListener {

	   @Override
	   public void actionPerformed(ActionEvent e) {
	      
	      JButton b = (JButton)e.getSource();
	      
	      if(b.getText().equals("Click"))
	         b.setText("내부 클래스");
	      else 
	         b.setText("Click");
	      SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	      Calendar cal = Calendar.getInstance();
	      format1.format(cal.getTime());
	      String hour = format1.format(cal.getTime());
	      jl.setText(hour);
	      
	   }
	   
	}
   
   
}