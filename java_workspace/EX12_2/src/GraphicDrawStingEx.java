import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class GraphicDrawStingEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicDrawStingEx() {
		this.setTitle("drawString ��� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�",30,30);
			g.drawLine(30, 40, 300, 300);
			g.drawLine(300, 40, 300, 300);
		}
			
			
		}
		
	
	public static void main(String[] args) {
	new GraphicDrawStingEx();

	}

}
