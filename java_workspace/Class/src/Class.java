import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.next();            //���ڿ� �б�
	System.out.println("�̸���"+name+"�Դϴ�.");
	
	int number = scanner.nextInt();          //���� �б�
	System.out.println("�й���"+number+"�Դϴ�.");
			
	String major = scanner.next();          //���ڿ� �б�
	System.out.println("�а���"+major+"�Դϴ�.");
	
	scanner.close();
	
	}
	
}
