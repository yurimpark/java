import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է����ּ���.");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
				
		int[] arr=new int[5];
		try {
		for(int i=0;i<arr.length;i++) {
			arr[i+1]=i;          }  
		} 
		catch(Exception e) {System.out.println("�迭�� ������ ��� �� �����ϴ�.");}
		//DB�� ��� 
		System.out.println("�� �κ��� ����Ǵ��� ������.");
	}
}
