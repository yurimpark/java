import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) +1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.HOUR));             //12시간 표기법
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));  	//24시간 표기법
		System.out.println(now.get(Calendar.MILLISECOND));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
	}

}
