import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionSave {

	public static void main(String[] args) throws Exception {
		
		System.out.println("���ܰ� �߻��ϸ� �����޽����� �α׿� ����ϴ� ���α׷� �ۼ��ϱ�.");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�������� �Է��Ͻÿ�");
		int x = sc.nextInt();
		
		System.out.println("�������� �Է��Ͻÿ�");
		int y = sc.nextInt();
		
		try {
			System.out.println(x + "�� " + y + "�� ������ ���� " + x/y + "�Դϴ�." );
			
		}
		catch (Exception e) {
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyymmddhhmmss");
		Date time = new Date();
		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.getTime();
		String today = simpleDate.format(cal.getTime());
		
		String FileName = today + ".log";
		String FileFullName = "c://log" + FileName;
		File file = new File(FileFullName);
		BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, false));
			
			writer.write(e.getMessage());
			writer.close();
			System.out.println("������ �߻��Ͽ����ϴ�.");
			
		}
		sc.close();
		
	}
	}