abstract class Point {                  //추상클래스
	private int x,y;
	public void set(int x, int y) { 
	this.x=x; this.y=y;
	}
	abstract void showPoint();    //추상메소드

}
public class ColorPoint extends Point {     //추상클래스, showPoint 상속
	
	@Override
	public void showPoint() {
	
		}
	
		public static void main(String[] args) {

	
	}

}
