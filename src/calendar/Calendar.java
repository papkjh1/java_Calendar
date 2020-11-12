package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month];
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
