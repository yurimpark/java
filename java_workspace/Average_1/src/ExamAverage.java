
import java.util.Scanner;

public class ExamAverage {
  
	public static void main(String[] args) {
		System.out.println("�л� �̸�, ����, ����, ���� ������ �Է��Ͽ� ����� ����Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		int korean = scanner.nextInt();
		int english = scanner.nextInt();
		int math = scanner.nextInt();
		System.out.print("����� "+(korean+english+math)/3+"�Դϴ�.");
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
	    while(true) {
		   System.out.println(">>");
		   String text=scanner.nextLine();
		   if(text.equals("exit")) 
			   break; 
		  
	    }
		   System.out.println("����");
		   scanner.close();
	}

}
