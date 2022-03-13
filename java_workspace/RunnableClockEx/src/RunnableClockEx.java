import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClockRunnable implements Runnable {
	JLabel clockLabel;
	public ClockRunnable(JLabel clockLabel) {
		this.clockLabel = clockLabel;
	}
	
	@Override
	public void run() {
	
		Calendar t=Calendar.getInstance();
		int hour = t.get(Calendar.HOUR_OF_DAY);//�ø� �޾ƿ´�
		int min = t.get(Calendar.MINUTE);//���� �޾ƿ´�
		int sec = t.get(Calendar.SECOND);//�ʸ� �޾ƿ´�
		
		while(true) {
			clockLabel.setText((Integer.toString(hour))+":"+(Integer.toString(min))+":"+(Integer.toString(sec)));
			sec++;
			if(sec==60) {
				sec=0;
				min++;
			}
			if(min==60) {
				min=0;
				hour++;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
} 

public class RunnableClockEx extends JFrame {
	public RunnableClockEx() {
		this.setTitle("Runnable ������ �ð�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel clockLabel = new JLabel();
		clockLabel.setFont(new Font("Gothic", Font.BOLD, 80));
		c.add(clockLabel);
		
		ClockRunnable runnable = new ClockRunnable(clockLabel);
		Thread th = new Thread(runnable);
		
		this.setSize(500, 170);
		this.setVisible(true);
		
		th.start();
		
	}

	public static void main(String[] args) {
		new RunnableClockEx();
	}

}
