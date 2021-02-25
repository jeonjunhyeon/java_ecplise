package com.study0223;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int count = 0;
		
		for(int j=1;j<a.length;j++) {
			for(int i=1;i<a.length;i++) {
				System.out.println(i + " * " + j + " = " + i*j);
				if((i*j)%3==0) {
					System.out.println("3배수");
					count++;
				}
				else {
					
				}
			}
		}
		System.out.println("=============종료==============");
		System.out.println("3배수의 갯수 :" + count);
		sc.close();
	}
}