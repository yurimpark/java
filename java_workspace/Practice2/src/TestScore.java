import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int korean = scanner.nextInt();
		int english = scanner.nextInt();
		int math = scanner.nextInt();
		int TestScore = (korean+english+math) / 3;
		System.out.println("���� �����"+TestScore+"�Դϴ�.");
		scanner.close();
		
	}

}
