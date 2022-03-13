import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingNextEx extends JFrame {
	private static final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("Hello");
	
	public FlyingNext() {
		this.setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
