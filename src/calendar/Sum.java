package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요.");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("두 수의 합은 "+(a+b)+" 입니다.");
//	    위 방법과 다르게 변환주기
		Scanner sc = new Scanner(System.in);
		int a,b;
		String s1,s2;
		System.out.println("두 수를 입력해주세요.");
		s1= sc.next();
		s2= sc.next();
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
//		System.out.println("두 수의 합은"+(a+b)+"입니다");
		System.out.printf("%d와 %d의 합은 %d입니다",a,b,(a+b));
		sc.close();
	}

}
