package calendar;

import java.util.Scanner;


public class Prompt extends Calendar{
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		int month = 0;
		int year = 0;
		while (true) {
			System.out.println();
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			System.out.println("첫번째 요일을 선택하세요.(SU,MO,WE.TH.FR.SA)");
			String weekday = sc.next();
			cal.weekDays(weekday);
			if (month <= 0 || month>=13) {
				break;
			}else {
				cal.printCalendar(year,month);
			}
//			if (month>12) {
//				continue;
//			}
		}
		sc.close();
		System.out.println("bye~");

	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
