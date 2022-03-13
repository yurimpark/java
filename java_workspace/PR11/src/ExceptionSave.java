import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionSave {

	public static void main(String[] args) throws Exception {
		
		System.out.println("예외가 발생하면 에러메시지를 로그에 기록하는 프로그램 작성하기.");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("나뉨수를 입력하시오");
		int x = sc.nextInt();
		
		System.out.println("나눗수를 입력하시오");
		int y = sc.nextInt();
		
		try {
			System.out.println(x + "를 " + y + "로 나누면 몫은 " + x/y + "입니다." );
			
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
			System.out.println("에러가 발생하였습니다.");
			
		}
		sc.close();
		
	}
	}