import java.sql.Timestamp;
import java.util.Calendar;

public class Date {
	public static String time (Calendar calendar1, Calendar calendar2) {
		
		
		
		if(calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR) !=0) {
			int year = calendar2.get(Calendar.YEAR)-calendar1.get(Calendar.YEAR);
			return year+"Năm Trước";
		}
		else if(calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH) !=0) {
			int moth = calendar2.get(Calendar.MONTH)-calendar1.get(Calendar.MONTH);
			return moth+"Tháng Trước";
		}
		else if(calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE) !=0) {
			int date =calendar2.get(Calendar.DATE)-calendar1.get(Calendar.DATE);
			return date+"Ngày Trước";
		}
		else if(calendar2.get(Calendar.HOUR)-calendar1.get(Calendar.HOUR) !=0) {
			int hours = calendar2.get(Calendar.HOUR)-calendar1.get(Calendar.HOUR);
			return hours+"Giờ Trước";
		}
		else if(calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE) !=0){
			int minute = calendar2.get(Calendar.MINUTE)-calendar1.get(Calendar.MINUTE);
			return minute+"Phút Trước";
		}
		else if(calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND) !=0) {
			int second =calendar2.get(Calendar.SECOND)-calendar1.get(Calendar.SECOND);
			return second+"Giây Trước";
		}
		else {
			return "Vừa Mới";
		}
	}
	public static void main(String[] args) {
		
		Timestamp time1 =new Timestamp(System.currentTimeMillis());
		Timestamp time2 =new Timestamp(System.currentTimeMillis());
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(time1);
		calendar1.set(2000,12,12);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(time2);
		
		
//		LocalDateTime localdatetime1= LocalDateTime.parse(time.toString());
		
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		LocalDateTime localdatetime =LocalDateTime.now();
//		localdatetime = localdatetime.format(myFormatObj);
//		
//		System.out.print(myFormatObj);
		
//		String timeString = new SimpleDateFormat("MM/dd/yyy HH:mm:ss").format(time);
//		System.out.print(timeString);
		
//		LocalDateTime local =LocalDateTime.now();
		
//		
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		String formattedDate = local.format(myFormatObj );
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(time);
//		int date = calendar.get(100);
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(time);
//		System.out.println(calendar.get(Calendar.HOUR));
//		System.out.print(time.getDate()-2);
		
		System.out.print(time(calendar1,calendar2));
		
	}
}
