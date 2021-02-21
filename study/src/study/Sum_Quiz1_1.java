package study;

import java.util.Scanner;

public class Sum_Quiz1_1 {
	
	public void sum(int[] firstNum) {
		int sumScore = firstNum[0] + firstNum[1]; // sumScore
		System.out.println("합계 :" + sumScore);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum_Quiz1_1 sq = new Sum_Quiz1_1();
				
		int[] firstNum = new int[5];
		
		for(int j=0; j<3; j++) {
			System.out.println((j+1)+"번째 출력");
			for(int i=0; i<2; i++) {
				System.out.println((i+1) +"번째 정수를 입력해주세요.");
				firstNum[i] = sc.nextInt();
				
				if(0<firstNum[i] && firstNum[i]<10 ) {
					
				}else {
					System.out.println("다시 입력해주세요.");
					i--;
				}
			}
			sq.sum(firstNum);
		}
	}
}