class Mouse {
	public String name;
	public void leftbutton() {System.out.print("leftbutton");}
	public void rightbutton() {System.out.print("rightbutton");}
	public void mouseMove() {System.out.print("mouseMove");}
}
class WheelMouse extends Mouse {
	public void scrollWheel() {System.out.print("scrollWheel");}
}
class ThreeButtonMouse extends WheelMouse {
	public void middlebutton() {System.out.print("middlebutton");}
}

public class MouseTest {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.name="�⺻���콺";
		System.out.print(m.name+"�� ����� ");
		m.leftbutton(); System.out.print("+"); m.rightbutton(); 
		System.out.print("+"); m.mouseMove();
		System.out.println("�� ����� �ִ�.");
		
		WheelMouse wm = new WheelMouse();
		wm.name="�ٸ��콺";
		System.out.print(wm.name+"�� ����� �⺻ ���콺�� ��ɰ� ���Ҿ� ");
		wm.scrollWheel(); System.out.println("�� ����� �ִ�.");
		
		ThreeButtonMouse tbm = new ThreeButtonMouse();
		tbm.name="3��ư���콺";
		System.out.print(tbm.name+"�� ����� �⺻ ���콺�� �ٸ��콺�� ��ɰ� ���Ҿ� ");
		tbm.middlebutton(); System.out.print("�� ����� �ִ�.");
	}

}
