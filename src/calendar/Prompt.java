package calendar;

import java.util.Scanner;

public class Prompt{
	private final static String PROMPT="cal> ";
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		int month = 0;
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month <= 0 || month>=13) {
				break;
			}else {
				cal.printCalendar(2017,month);
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
