package study;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구해라 (단, n>0)");
		
		int n = 0;
		int hap = 0;
		
		for(n=1; n<=100; n++) {
			if(n==0){
				hap = hap+n;
			}
			else {
				hap = hap+n;
			}
		}
		System.out.println("합계 :"+hap);
		
		sc.close();
	}

}
