import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
char ch = ' ';
while(true) {
System.out.println("���̵� �Է��ϼ���.");
	String input =scanner.nextLine();
	ch = input.charAt(0);
	
	if(input.contains("!")||input.contains("@")||input.contains("#")||input.contains("$")||input.contains("%")||input.contains("^")) {
          System.out.println("���̵� !,@,#,$,%,^�� ���ԵǸ� �ȵ˴ϴ�.");      
      }
      else
      {
          System.out.println("���̵� ����� �� �ֽ��ϴ�."); 
	
	}
}
}
}