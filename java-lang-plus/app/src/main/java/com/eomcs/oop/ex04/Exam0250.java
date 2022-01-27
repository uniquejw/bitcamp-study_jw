package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0250 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		System.out.println(c);
		//java.util.GregorianCalendar[time=1642366169474,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		// 그레고리안 천문대 기준 시(?)

		// get으로 얻을 수 있는 값들의 순서
		//ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=17,DAY_OF_YEAR=17,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=49,SECOND=29,MILLISECOND=474,ZONE_OFFSET=32400000,DST_OFFSET=0]

		//		System.out.println(c.get(-1));  // 실행 오류
		System.out.println(c.get(0)); //ERA=1
		System.out.println(c.get(1)); // YEAR=2022
		System.out.println(c.get(2) + 1); 
		System.out.println(c.get(5));
		System.out.println(c.get(7));
		System.out.println(c.get(4));
		System.out.println(c.get(10));
		System.out.println(c.get(11));
		System.out.println(c.get(12));
		System.out.println(c.get(3));

		System.out.println("--------------");

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
}
