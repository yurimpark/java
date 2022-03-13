import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChartEx2 extends JFrame {
	private MyPanel panel=new MyPanel();
	
	public ChartEx2() {
		this.setTitle("차트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.black);
		this.setContentPane(panel); //눈에는 안보이지만 패널을 컨테이너로 설정
		
		this.setSize(800, 650);
		this.setVisible(true);
	
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int gap=10;
			int gap2=50;
			int gap3=30;
			int q1=250;
			int q2=200;
			int q3=100;
			int q4=270;
			int start=60;
			int sum=q1+q2+q3+q4;
		 double ratio1 = (q1/(double)(sum)) * 361; 
		 double ratio2 = (q2/(double)(sum)) * 361;
		 double ratio3 = (q3/(double)(sum)) * 361;
		 double ratio4 = (q4/(double)(sum)) * 361;
		
		   
			g.setColor(Color.YELLOW);
			g.fillArc(400, 150, 300, 300, 0, (int) ratio1);
			g.setColor(Color.BLUE);
			g.fillArc(400, 150, 300, 300, (int) ratio1, (int) ratio2);
			g.setColor(Color.green);
			g.fillArc(400, 150, 300, 300, (int) ratio1+(int) ratio2, (int) ratio3);
			g.setColor(Color.red);
			g.fillArc(400, 150, 300, 300, (int) ratio1+ (int) ratio2+ (int) ratio3, (int) ratio4);
			
			g.setColor(Color.WHITE);
			g.drawString("1/4분기", 600, 130);
			g.drawString("2/4분기", 400, 190);
			g.drawString("3/4분기", 380, 400);
			g.drawString("4/4분기", 600, 470);
			
			g.setColor(Color.red);
			g.drawString("250억", 580, 250);
			g.drawString("200억", 460, 280);
			g.drawString("100억", 480, 350);
			g.setColor(Color.WHITE);
			g.drawString("270억", 590, 350);			
			
			
			g.drawString("매출액", 5, 120);
			g.drawString("분기", 300, 460);
			g.drawString("1/4분기", start+gap2/2, 440+20);      		 //x축 값
			g.drawString("2/4분기", start+gap2/2+gap2, 440+20);
			g.drawString("3/4분기", start+gap2/2+gap2*2, 440+20);
			g.drawString("4/4분기", start+gap2/2+gap2*3, 440+20);
			
			g.drawLine(30, 150, 30, 440);  							//x축
			g.drawLine(30, 440, 300, 440); 							//y축
			
			int n=440;
			g.drawString("0", 20, n);          						//y축 값
			g.drawString("50", 15, n-gap2);
			g.drawString("100", 7, n-gap2*2);
			g.drawString("150", 7, n-gap2*3);
			g.drawString("200", 7, n-gap2*4);
			g.drawString("250", 7, n-gap2*5);
			g.drawString("300", 7, n-gap2*6);
			
			g.drawLine(start, 400, start+gap2, 450-q1);				//매출액 꺾은선 그래프
			g.drawLine(start+gap2, 450-q1, start+gap2*2, 450-q2);
			g.drawLine(start+gap2*2, 450-q2, start+gap2*3, 450-q3);
			g.drawLine(start+gap2*3, 450-q3, start+gap2*4, 450-q4);
			
			g.drawString("250억", start+gap2-gap, 450-q1-gap);
			g.drawString("200억", start+gap2/2+gap2+gap+10, 450-q2-gap);
			g.drawString("100억", start+gap2/2+gap2*2+gap, 450-q3+gap+10);
			g.drawString("270억", start+gap2/2+gap2*3+gap, 450-q4-gap);
			
		
		}
		}
	
	
	public static void main(String[] args) {
		new ChartEx2();
		
	}

}
