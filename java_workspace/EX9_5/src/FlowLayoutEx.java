import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FlowLayoutEx extends JFrame {
		public FlowLayoutEx () {
			this.setTitle("���� �ð� ���");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn2 = new JButton("��ư2");
			btn2.addActionListener(new MyActionListener());
			c.add(btn2);
			setSize(350,150);
			setVisible(true);
			
		}
		
		LocalDateTime now = LocalDateTime.now();

		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
		


		private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("��ư2"))
				b.setText(formatedNow);
		
		}
		}

		public static void main(String[] args) {
		new FlowLayoutEx();
		}
}
		