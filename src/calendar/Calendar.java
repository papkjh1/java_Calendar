package calendar;


public class Calendar {
	private static final int[] MAX_DAYS= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS= {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	
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
	public int weekdays(String weekday) {
			 if (weekday.equals("su")) return 0;
		else if (weekday.equals("mo")) return 1;
		else if (weekday.equals("tu")) return 2;
		else if (weekday.equals("we")) return 3;
		else if (weekday.equals("th")) return 4;
		else if (weekday.equals("fr")) return 5;
		else if (weekday.equals("sa")) return 6;
		else return 0;
	}
	public void printCalendar(int year , int month, int weekday) {
		System.out.printf("    <<%4d년%2d월>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		int maxDay = getmaxDaysOfMonth(year,month);
		for (int i = 0; i < weekday+(weekday*2); i++) {
			System.out.print(" "); //공백부분
		}
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i % 7 == 7-weekday) {
				System.out.println();
			} 
		}
		System.out.println();
	}

}
//switch (weekDays) {
//case "MO":
//	System.out.print("   ");
//for (int i = 1; i <= maxDay; i++) {
//	System.out.printf("%3d",i);
//	if (i%7==6) {System.out.println();}}
//System.out.println();break;
// 띄어쓰기 날짜