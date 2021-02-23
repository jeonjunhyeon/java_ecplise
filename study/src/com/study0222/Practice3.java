package com.study0222;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 국어점수 선언 및 초기화
		double kor = 0;
		// 영어점수 선언 및 초기화
		double eng = 0;
		// 수학점수 선언 및 초기화
		double math = 0; 
		
		for(int i=0;i<3;i++) { //3번만 돌리자!
			System.out.println((i+1)+"번째의 국어 점수를 입력해주세요."); 
			// 사용자에게 국어 점수 값 받기
			kor = sc.nextDouble(); 
			System.out.println((i+1)+"번째의 영어 점수를 입력해주세요.");
			// 사용자에게 영어 점수 값 받기
			eng = sc.nextDouble();
			System.out.println((i+1)+"번째의 수학 점수를 입력해주세요.");
			// 사용자에게 수학 점수 값 받기
			math = sc.nextDouble(); 
			
			// 국어+영어+수학 총 점수받기
			double sumScore = kor + eng + math; 
			// 과목수 선언 및 초기화
			int sjNum = 3; 
			// 국어+영어+수학 총 점수의 평균받기
			double avgScore = (kor + eng + math)/sjNum; 
			// 총점 출력하기
			System.out.println((i+1)+"번째 학생의 총점 : " + sumScore + "점"); 
			// 평균 출력하기
			System.out.println((i+1)+"번째 학생의 평균 : " + avgScore + "점"); 
		}
		sc.close();

	}

}
