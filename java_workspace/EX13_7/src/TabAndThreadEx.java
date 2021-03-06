import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;
	
	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;		
	}

	public void paintComponents(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) {return;}
		}
		barSize++;
		repaint();
		notify();
	}
	synchronized void consume() {
		if(barSize==0) {
			try {
				wait();
			} catch (InterruptedException e) {
			return;
			}
		}
		barSize--;
		repaint();
		notify();
}
}
class ConsumerThread extends Thread {
	MyLabel bar;
	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(2000);
				bar.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class TabAndThreadEx extends JFrame {
	private MyLabel bar = new MyLabel(100);
	
	TabAndThreadEx(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)	{
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	public static void main(String[] args) {
		new TabAndThreadEx("아무거나 빨리 눌러 바 채우기");
	}

}
