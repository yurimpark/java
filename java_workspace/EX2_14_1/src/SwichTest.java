import java.util.Scanner;

public class SwichTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100):");
		int score=scanner.nextInt();
		switch(score/10) {
		 case 10: case 9: case 8: case 7:
			System.out.println("�հ��Դϴ�.");
			break;
		default:
			System.out.println("���հ��Դϴ�.");
		}
	
	scanner.close();
	
	}

}
