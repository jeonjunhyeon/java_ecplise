package com.study0223;

import java.util.Scanner;

public class Practice1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int nums = 0;
		
		if(nums%3==0) {
			int num = sc.nextInt();
			System.out.println(nums + "는 3의 배수입니다.");
		}
	}

}
