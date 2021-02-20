package variable.step1;

import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 N까지의 정수 합계를 구하시오.");
		
		int i = 0;
		int hap = 0;
		
		for(i = 0; i<=100; i++) {
			if(i>0) {
				hap = hap+i;
			}
			else {
				hap = hap+i;
			}
		}
		System.out.println("합계 : " + hap);
		sc.close();
	}
}