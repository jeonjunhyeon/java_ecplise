package study;

import java.util.Scanner;

public class Question2 {
	int i = 0;
	int hap = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Question2 qc = new Question2();
		System.out.println("1부터 n까지의 합을 구해라 (단, n>0)");
		
		//qc.i = sc.nextInt();
		//qc.hap = sc.nextInt();
		qc.i = sc.nextInt();
		qc.hap = sc.nextInt();
		
		for(qc.i=1; qc.i<=100; qc.i++) {
			if(qc.i==0){
				qc.hap = qc.hap+qc.i;
			}
			else {
				qc.hap = qc.hap+qc.i;
			}
		}
		System.out.println("합계 :"+ qc.hap);
		
		sc.close();
	}

}
