import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		
	    System.out.println("���� �Է��Ͽ� ¦���� Ȧ���� �Ǻ��غ���: ");
	    int n = scanner.nextInt();
		if (n%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
			
			scanner.close();
		}
	}
}
