import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		
	    System.out.println("값을 입력하여 짝수와 홀수를 판별해보기: ");
	    int n = scanner.nextInt();
		if (n%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
			
			scanner.close();
		}
	}
}
