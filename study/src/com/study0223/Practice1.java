package com.study0223;

import java.util.Scanner;

public class Practice1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int nums = 0;
		
		for(int i=0;i<5;i++) {
			nums = sc.nextInt();
			if(nums%3==0) {
				System.out.println(nums + "는 3의 배수입니다.");
			}
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
			i++;
		}
		
	}

}
