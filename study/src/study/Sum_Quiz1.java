package study;

import java.util.Scanner;

public class Sum_Quiz1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.println("두 개의 정수를 입력해주세요.");
		
		a = sc.nextInt();
		b = sc.nextInt();
		if(0<a && a<10 && 0<b && b<10) {
			System.out.println("합계 :" + (a+b));
		}else {
			System.out.println("1부터 9사이의 값을 입력해주세요.");
		}
	}
}