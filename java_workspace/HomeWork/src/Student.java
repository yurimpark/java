import java.util.Scanner;

public class Student {

//	    String name;
//	    int korean;
//	    int english;
//	    int math;
//		int sum;
//		int average;
		
		public Student() { }
		
		public static void main(String[] args) {
	
			while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름을 입력하세요.");
			String name = scanner.nextLine();
			System.out.println("국어,영어,수학 점수를 입력하세요.");
			
			String korean = scanner.next();
			String english = scanner.next();
			String math = scanner.next();
			
			int kor = Integer.parseInt(korean); 
			int eng = Integer.parseInt(english);
			int mathma = Integer.parseInt(math);
			
			int sum =kor + eng + mathma;
			
			System.out.println("평균은 "+(double)sum/3+"입니다.");
			System.out.println("종료를 원하면 exit을 입력하세요.");
			String text = scanner.next(); 
			
			if(text.equals("exit")) 
				break;
			}
			System.out.println("종료합니다.");
		}
}
			
			
			
			
			

