import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon beauty=new ImageIcon("images/beauty.jpg");
		JLabel imageLabel=new JLabel(beauty);
		c.add(imageLabel);
		
		this.setSize(400,600);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LabelEx();

	}

}
