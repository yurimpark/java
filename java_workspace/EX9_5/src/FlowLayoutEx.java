import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FlowLayoutEx extends JFrame {
		public FlowLayoutEx () {
			this.setTitle("현재 시간 출력");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn2 = new JButton("버튼2");
			btn2.addActionListener(new MyActionListener());
			c.add(btn2);
			setSize(350,150);
			setVisible(true);
			
		}
		
		LocalDateTime now = LocalDateTime.now();

		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		


		private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("버튼2"))
				b.setText(formatedNow);
		
		}
		}

		public static void main(String[] args) {
		new FlowLayoutEx();
		}
}
		