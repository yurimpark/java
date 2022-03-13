import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.next();            //문자열 읽기
	System.out.println("이름은"+name+"입니다.");
	
	int number = scanner.nextInt();          //정수 읽기
	System.out.println("학번은"+number+"입니다.");
			
	String major = scanner.next();          //문자열 읽기
	System.out.println("학과는"+major+"입니다.");
	
	scanner.close();
	
	}
	
}
