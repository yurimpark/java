import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
char ch = ' ';
while(true) {
System.out.println("아이디를 입력하세요.");
	String input =scanner.nextLine();
	ch = input.charAt(0);
	
	if(input.contains("!")||input.contains("@")||input.contains("#")||input.contains("$")||input.contains("%")||input.contains("^")) {
          System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");      
      }
      else
      {
          System.out.println("아이디를 사용할 수 있습니다."); 
	
	}
}
}
}