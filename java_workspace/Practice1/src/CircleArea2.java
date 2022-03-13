import java.util.Scanner;

public class CircleArea2 {

	public static void main(String[] args) {
		final double PI = 3.14;                    //원주율을 상수로 선언
		Scanner scanner = new Scanner(System.in);   
		double radius = scanner.nextDouble();      //실수 읽기
		double CircleArea2 = radius*radius*PI;     //원의 면적 계산
		
		System.out.println("원의 면적은" + CircleArea2 + "입니다.");
   
		scanner.close();
		

	}

}
