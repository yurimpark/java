
import java.util.Scanner;

public class ExamAverage {
  
	public static void main(String[] args) {
		System.out.println("학생 이름, 국어, 영어, 수학 점수를 입력하여 평균을 출력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		int korean = scanner.nextInt();
		int english = scanner.nextInt();
		int math = scanner.nextInt();
		System.out.print("평균은 "+(korean+english+math)/3+"입니다.");
		
		System.out.println("exit를 입력하면 종료합니다.");
	    while(true) {
		   System.out.println(">>");
		   String text=scanner.nextLine();
		   if(text.equals("exit")) 
			   break; 
		  
	    }
		   System.out.println("종료");
		   scanner.close();
	}

}
