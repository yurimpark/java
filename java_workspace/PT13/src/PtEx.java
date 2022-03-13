import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PtEx extends JFrame {
	
	private JLabel imageLabel; //�̹��� ���̺�
	private ImageIcon [] images = new ImageIcon [4]; //�̹��� ��ü �迭
	int currentId; //���� ���õ� �̹��� ��ȣ(0~3)
	
	public PtEx () {
		this.setTitle("Gallery");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = this.getContentPane(); //����Ʈ �� ���
		c.setLayout(new BorderLayout());  	//����Ʈ �ҿ� BorderLayout ���� 
		
	 // �̹��� ���� �ε�
	// ������Ʈ�� images ������ images0.jpg, image1.jpg, image2.jpg, image3.jpg
		for(int i=0; i<images.length; i++)
			images[i] = new ImageIcon("images/image" + i + ".jpg");
		
		currentId = 0; 	//���� ���õ� �̹��� ��ȣ
		imageLabel = new JLabel(images[currentId]);	//���� ���õ� �̹����� ���̺� ���
		c.add(imageLabel, BorderLayout.CENTER); 	//�̹��� ���̺��� CENTER�� ����
		c.add(new MenuPanel(), BorderLayout.SOUTH); //2���� ȭ��ǥ ��ư�� ���� MenuPanel����
		
		this.setSize(300,400);
		this.setVisible(true);
	}
		//�ΰ��� ȭ��ǥ ��ư�� ���� �޴� �г�
		class MenuPanel extends JPanel {
			public MenuPanel() {
			this.setBackground(Color.GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png"); //���� ȭ��ǥ �̹��� �ε�
			ImageIcon rightIcon = new ImageIcon("images/right.png"); //������ ȭ��ǥ �̹��� �ε�
			JButton leftBtn = new JButton(leftIcon); 		//���� ��ư ����
			JButton rightBtn = new JButton(rightIcon);		//������ ��ư ����
			
			this.add(leftBtn);
			this.add(rightBtn);
			
			//���� ȭ��ǥ ��ư�� Action ������ �ޱ�
			leftBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					currentId --; 	//�̹��� ��ȣ ����, ���� �̹���
					currentId += images.length;	//currentId�� ������ �� �� �ֱ� ������ 4�� ����
					currentId %= images.length; //4�� �Ѵ°��� ���� ���� �̹��� ������ ������ ����
					imageLabel.setIcon(images[currentId]);	//�̹��� ���̺� �̹��� ����
					
				}
			});
			//������ ȭ��ǥ ��ư�� Action ������ �ޱ�
			rightBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					currentId ++;	//�̹��� ��ȣ ����. ���� �̹���
					currentId %= images.length;	//4�� �Ѵ°��� ���� ���� �̹��� ������ ������ ����
					imageLabel.setIcon(images[currentId]);  // �̹��� ���̺� �̹��� ����
					
				}
			});
		}
	}
	
	
	public static void main(String[] args) {
		new PtEx();
	}
	}

