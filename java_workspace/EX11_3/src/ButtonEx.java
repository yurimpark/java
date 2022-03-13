import java.awt.Container;
import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() { 
		this.setTitle("이미지 버튼 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); 
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		this.setSize(250,150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
	 new ButtonEx();	

	}

}
