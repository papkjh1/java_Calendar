package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS= {0,31,29,31,30,31,30,31,31,30,31,30,31};
	private static final String [] WEEK_DAYS= {"0","1","2","3","4","5","6"};
	public boolean isLeapYear(int year) {
		if (year%4 == 0 && (year%100 != 0 || year%400 ==0)) {
			return true;
		}else {
		return false;
		}	
	}
	
	public int getmaxDaysOfMonth(int year,int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}
	}	
	public void printCalendar(int year , int month , String WEEKDAY) {
		System.out.printf("    <<%4d년%2d월>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		int maxDay = getmaxDaysOfMonth(year,month);
		for (int i = 1; i <= maxDay; i++) {
			System.out.println(WEEKDAY = WEEK_DAYS[i]);
			System.out.printf("%3d",i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
//년도를 입력하세요.
//YEAR> 2017
//달을 입력하세요.
//MONTH> 3
//첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)
//WEEKDAY> WE
//
//    <<2017년  3월>>
// SU MO TU WE TH FR SA
//---------------------
//           1  2  3  4
//  5  6  7  8  9 10 11
