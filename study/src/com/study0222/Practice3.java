package com.study0222;

import java.util.Scanner;

public class Practice3 {
	
	private double sum(double kor, double eng, double math) {
		double sumScore = kor + eng + math; 
		System.out.println("합계 : " + sumScore);
		return sumScore;
		}
	
	private double avg(double kor, double eng, double math) {
		double avgScore = (kor + eng + math)/3;
		System.out.println("평균 :" + avgScore);
		return avgScore;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practice3 pt = new Practice3();
		
		double kor[] = new double[5];
		double eng[] = new double[5];
		double math[] = new double[5];
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째의 국어 점수를 입력해주세요.");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째의 영어 점수를 입력해주세요.");
			eng[i] = sc.nextInt();
			System.out.println((i+1)+"번째의 수학 점수를 입력해주세요.");
			math[i] = sc.nextInt();
			
			pt.sum(kor[i], eng[i], math[i]);
			pt.avg(kor[i], eng[i], math[i]);
			
		}

	}

}
