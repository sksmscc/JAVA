package day14;

import java.sql.Date;
import java.util.Calendar;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜시간 클래스
		 * Calendar 클래스 사용. => 추상클래스
		 * 직접 객체를 생성할 수 없음. 
		 * new 연산자를 통해 객체 구현 X
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴트를 얻어 옴.
		 * 
		 * month : (0월 ~ 11월) +1
		 * week : 1=일; 2=월, ...
		 * am_pm : am = 0; pm = 1
		 * 
		 * 
		 */
//		Date d = new Date();
//		d.getDate(); //depercated : 비권장

		Calendar now = Calendar.getInstance();  //현재 날짜
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; //0월부터 시작
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = now.get(Calendar.SECOND);
		System.out.println(second); 
		System.out.println(hour+":"+minute+":"+second);

		
		//2023-02-17(금)
		//오후 2:42
		String stweek = null;
		switch(week) {
		case Calendar.MONDAY :
			stweek = "월";
			break;
		case Calendar.TUESDAY :
			stweek = "화";
			break;
		case Calendar.WEDNESDAY :
			stweek = "수";
			break;
		case Calendar.THURSDAY :
			stweek = "목";
			break;
		case Calendar.FRIDAY :
			stweek = "금";
			break;
		case Calendar.SATURDAY :
			stweek = "토";
			break;
		default :
			stweek = "일";
			break;
			
		}
		System.out.println(year+"-"+month+"-"+day+"("+stweek+")");

		
		int ampm = now.get(Calendar.AM_PM);
		String AmPm =null;
		if(ampm ==Calendar.AM) {
			AmPm = "오전";
		}else {
			AmPm = "오후";
		}
		System.out.println(AmPm+" "+hour+":"+minute+":"+second);
	}
	

}
