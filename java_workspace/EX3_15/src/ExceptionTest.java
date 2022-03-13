import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 두개를 입력해주세요.");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
				
		int[] arr=new int[5];
		try {
		for(int i=0;i<arr.length;i++) {
			arr[i+1]=i;          }  
		} 
		catch(Exception e) {System.out.println("배열의 범위를 벗어날 수 없습니다.");}
		//DB에 기록 
		System.out.println("이 부분이 실행되는지 보세요.");
	}
}
