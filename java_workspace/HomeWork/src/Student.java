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
			System.out.println("�̸��� �Է��ϼ���.");
			String name = scanner.nextLine();
			System.out.println("����,����,���� ������ �Է��ϼ���.");
			
			String korean = scanner.next();
			String english = scanner.next();
			String math = scanner.next();
			
			int kor = Integer.parseInt(korean); 
			int eng = Integer.parseInt(english);
			int mathma = Integer.parseInt(math);
			
			int sum =kor + eng + mathma;
			
			System.out.println("����� "+(double)sum/3+"�Դϴ�.");
			System.out.println("���Ḧ ���ϸ� exit�� �Է��ϼ���.");
			String text = scanner.next(); 
			
			if(text.equals("exit")) 
				break;
			}
			System.out.println("�����մϴ�.");
		}
}
			
			
			
			
			

