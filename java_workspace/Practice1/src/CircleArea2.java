import java.util.Scanner;

public class CircleArea2 {

	public static void main(String[] args) {
		final double PI = 3.14;                    //�������� ����� ����
		Scanner scanner = new Scanner(System.in);   
		double radius = scanner.nextDouble();      //�Ǽ� �б�
		double CircleArea2 = radius*radius*PI;     //���� ���� ���
		
		System.out.println("���� ������" + CircleArea2 + "�Դϴ�.");
   
		scanner.close();
		

	}

}
