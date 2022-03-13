import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChartEx extends JFrame {
	private MyPanel panel=new MyPanel();
	
	public ChartEx() {
		this.setTitle("��Ʈ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.GRAY);
		this.setContentPane(panel); //������ �Ⱥ������� �г��� �����̳ʷ� ����
		
		this.setSize(500, 800);
		this.setVisible(true);
	
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int gap=10;
			int height=20;
			int q1=250;
			int q2=200;
			int q3=100;
			int q4=270;
			int gap2=50;
			
			g.drawString("�����", 200, 35);   				//�ؽ�Ʈ
			g.drawString("1/4�б�", 30,60);
			g.drawString("2/4�б�", 30,60+(height+gap));
			g.drawString("3/4�б�", 30,60+(height+gap)*2);
			g.drawString("4/4�б�", 30,60+(height+gap)*3);
			
			g.fillRect(100, 50, q1, height);     			//����� �׷���
			g.fillRect(100, 50+height+gap, q2, height);
			g.fillRect(100, 50+(height+gap)*2, q3, height);
			g.fillRect(100, 50+(height+gap)*3, q4, height);
			
			g.drawLine(100, 400, 100+gap2, 450-q1);			//����� ������ �׷���
			g.drawLine(100+50, 450-q1,100+gap2*2, 450-q2);
			g.drawLine(100+gap2*2, 450-q2, 100+gap2*3, 450-q3);
			g.drawLine(100+gap2*3, 450-q3, 100+gap2*4, 450-q4);
			
			g.setColor(Color.YELLOW);
			g.fillArc(100, 450, 200, 200, 0, 90);
			g.setColor(Color.blue);
			g.fillArc(100, 450, 200, 200, 90, 45);
			g.setColor(Color.white);
			g.fillArc(100, 450, 200, 200, 90+45, 180);
			g.setColor(Color.PINK);
			g.fillArc(100, 450, 200, 200, 90+45+180, 45);
		}
		
	}
	
	public static void main(String[] args) {
		new ChartEx();
		
	}

}
