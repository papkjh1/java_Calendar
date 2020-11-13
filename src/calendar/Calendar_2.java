package calendar;

import java.util.Scanner;

public class Calendar_2 extends Calendar{

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요");
		int repeat =sc.nextInt();
		System.out.println("월을 입력하세요");
		for (int i = 0; i < repeat; i++) {
			int month = sc.nextInt();
			System.out.printf("%d월은 %d월까지 있습니다",month,cal.getmaxDaysOfMonth(month));
		}
		sc.close();
		
		
	}

}
