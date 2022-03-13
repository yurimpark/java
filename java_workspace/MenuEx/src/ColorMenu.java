import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class ColorMenu extends JFrame{
	JMenuItem menuItem1 = null;
	JMenuItem menuItem2 = null;
	JMenuItem menuItem3 = null;
	
	public ColorMenu() {
		this.setTitle("컬러 메뉴아이템 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		Container c = getContentPane();
        c.setLayout(new FlowLayout());
		
		//메뉴버튼
		JMenuBar mb = new JMenuBar();
		
		JMenu menu1 = new JMenu("RED");
    	menuItem1 = new JMenuItem("Color Change");
    	menu1.add(menuItem1);
    	mb.add(menu1);
    	
		JMenu menu2 = new JMenu("GREEN");
		menuItem2 = new JMenuItem("Color Change");
    	menu2.add(menuItem2);
    	mb.add(menu2);
		
		JMenu menu3 = new JMenu("BLUE");
		menuItem3 = new JMenuItem("Color Change");
    	menu3.add(menuItem3);
    	mb.add(menu3);
		
		this.setJMenuBar(mb);
		
    	menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("변경완료");
				c.setBackground(Color.RED);
			}
    		
    	});
    	
    	menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("변경완료");
				c.setBackground(Color.GREEN);
			}
    		
    	});
    	
    	menuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("변경완료");
				c.setBackground(Color.BLUE);
			}
    		
    	});
    	
    	
    	this.setSize(300,500);
    	this.setVisible(true);
    	
	} 
	
	
	public static void main(String[] args) {
		new ColorMenu();
	}
	
}
