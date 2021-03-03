package com.study0303;

import java.util.Scanner;

public class OperationEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numScore = 0;
		System.out.println("학생의 점수를 입력하세요");
		numScore = sc.nextInt();
		
		if(numScore>=90) {
			System.out.println("A등급");
		}
		else if(80<=numScore && numScore>=89 ) {
			System.out.println("B등급");
		}
		else if(70<=numScore && numScore>=79) {
			System.out.println("C등급");
		}
		else if(60<=numScore && numScore>=69) {
			System.out.println("D등급");
		}
		else {
			System.out.println("F등급");
		}
	}
}
