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
		m.name="기본마우스";
		System.out.print(m.name+"의 기능은 ");
		m.leftbutton(); System.out.print("+"); m.rightbutton(); 
		System.out.print("+"); m.mouseMove();
		System.out.println("의 기능이 있다.");
		
		WheelMouse wm = new WheelMouse();
		wm.name="휠마우스";
		System.out.print(wm.name+"의 기능은 기본 마우스의 기능과 더불어 ");
		wm.scrollWheel(); System.out.println("의 기능이 있다.");
		
		ThreeButtonMouse tbm = new ThreeButtonMouse();
		tbm.name="3버튼마우스";
		System.out.print(tbm.name+"의 기능은 기본 마우스와 휠마우스의 기능과 더불어 ");
		tbm.middlebutton(); System.out.print("의 기능이 있다.");
	}

}
