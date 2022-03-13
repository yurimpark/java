import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {
		private JTextField tf = new JTextField(10);
		private JButton okButton = new JButton("OK");
		
		public MyDialog(JFrame frame, String title) {
			super(frame,title);
			setLayout(new FlowLayout());
			add(tf);
			add(okButton);
			setSize(200,100);
			
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);	
				}
			});
		}
}

public class DialogEx extends JFrame {
	private MyDialog dialog;
	
	public DialogEx() {
		super("dialogEx ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		dialog = new MyDialog(this, "Test Dialog");
		btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);				
			}
			});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new DialogEx();
		
	}

}
