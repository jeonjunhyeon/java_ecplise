package com.study0223;

import java.util.Scanner;

public class Practice1_1 {
	
	//곱셈에 대한 메소드 생성
	public void mult(int first, int second) {
		int mult = first * second;
		System.out.println("곱셈 : " + mult);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//클래스 인스턴스화
		Practice1_1 pt = new Practice1_1();
		
		// firstNum에게 0인 9개 방 제공
		int[] firstNum = new int[9];
		
		// 3의 배수를 어떻게 빼야하나.......
		if(pt.mult(i, i)%3==0) {
			System.out.println("3의 배수입니다.");
			for(int i=0;i<firstNum.length;i++) { // i
				System.out.println((i+1) +"의 배수 출력시작");
				for(int j=0;j<firstNum.length;j++) { // 1부터 9까지 곱셈 시작!
					pt.mult((i+1), (j+1));
					}
				}
			}
		else {
			
		}
	}

}
