import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicDrawImageEx() {
	//this.setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		this.setTitle("패널의 크기에 맞추어 이미지 그리기");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setContentPane(panel);
	//this.setSize(300,420);
	this.setSize(200,500);
	this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicDrawImageEx();
		
	}
	
	class MyPanel extends JPanel {
		
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		public MyPanel () {
			addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Point startP = e.getPoint();
				vStart.add(startP);
			}
			public void mouseReleased(MouseEvent e) {
				Point endP = e.getPoint();
				vEnd.add(endP);
				
				repaint();
			}
			
		});
		}
		//private ImageIcon icon = new ImageIcon("images/image0.jpg");
		//private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
			g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
			//g.drawImage(img, 20, 20, this);
			// g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
		
	//public static void main(String[] args) {
		//new GraphicDrawImageEx();

	}

}
