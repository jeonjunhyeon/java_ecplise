package study;

import java.util.Scanner;

public class Exam2_1_1 {
	Exam2_1 methodA() {
		return new Exam2_1();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exam2_1 ex = new Exam2_1();
		System.out.println("1부터 n까지 합계를 구하시오.");
		
		ex.setI(5050);
		int num2 = ex.getI();
		System.out.println(num2);
		
		sc.close();
	}

}
