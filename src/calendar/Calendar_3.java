package calendar;

import java.util.Scanner;

public class Calendar_3 extends Calendar_2 {

	public static void main(String[] args) {
		String PROMPT = "cal> ";
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		int month = 0;
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = sc.nextInt();
			System.out.printf("%d달은 %d월까지 있습니다", month, cal.getmaxDaysOfMonth(month, 0));
			if (month <= 0 && month>12) {
				break;
			}
		}
		sc.close();
		System.out.println("bye~");
	}

}
