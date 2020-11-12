package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		
		int [] maxDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(month+"의 달은"+maxDays[month]+"일까지 있습니다.");
		sc.close();
	}

}
