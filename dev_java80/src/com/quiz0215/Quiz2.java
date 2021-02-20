package com.quiz0215;

import java.util.Scanner;

/*
 * 1부터 N까지(변수 1개) 정수의 합계(변수1개)를 구하시오. ===> 그래서 변수가 2개이다.
 * 
 */
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1부터 end까지 숫자를 세는 변수
		int start = 0;
		// 1부터 어디까지 셀 것인지 담을 변수
		int end = 0;
		//합을 구해서 담을 변수를 선언
		int hap = 0;// 0으로 하는 이유는 합을 구할 때, 결과값에 영향을 줄 수 있기 때문에 0으로 초기화 해야된다.
		System.out.println("계산하고 싶은 정수를 입력하세요.");
		end =sc.nextInt();//?
		
		
		for(start=0;start<=end;start++) {
			hap = hap + start;
		}
		System.out.println(hap);
	}

}
