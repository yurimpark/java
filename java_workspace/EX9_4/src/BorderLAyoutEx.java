import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

public class BorderLAyoutEx extends	JFrame {
	public BorderLAyoutEx() {
		this.setTitle("BorderLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLAyoutEx();
	}

}
