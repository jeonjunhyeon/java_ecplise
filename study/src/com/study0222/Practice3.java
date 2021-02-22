package com.study0222;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kor = 0;
		double eng = 0;
		double math = 0;
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째의 국어 점수를 입력해주세요.");
			kor = sc.nextDouble();
			System.out.println((i+1)+"번째의 영어 점수를 입력해주세요.");
			eng = sc.nextDouble();
			System.out.println((i+1)+"번째의 수학 점수를 입력해주세요.");
			math = sc.nextDouble();
			
			double sumScore = kor + eng + math;
			int sjNum = 3;
			double avgScore = (kor + eng + math)/sjNum;
			System.out.println((i+1)+"번째 학생의 총점 : " + sumScore + "점");
			System.out.println((i+1)+"번째 학생의 평균 : " + avgScore + "점");
		}
		sc.close();

	}

}
