package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month];
	}
	public void printCalendar(int year , int month) {
		System.out.printf("    <<%4d년%2d월>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		int maxDay = getmaxDaysOfMonth(month);
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println("-------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("21 22 23 24 25 26 27");
//		System.out.println("28 29 30 31");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		
		System.out.println(month+"의 달은"+cal.getmaxDaysOfMonth(month)+"일까지 있습니다.");
		sc.close();
	}

}
