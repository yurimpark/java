import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame implements ActionListener {
	public IndepClassListener() {
		this.setTitle("Action �̺�Ʈ ������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(this);  //btn�� ���Ǵ� ������ ����
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
		
	}
}
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");		
	}
}


			
			
		

