package com.study0222;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 1부터 n까지의 합을 구하여라(단, n>0)
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int hap = 0;
		
		System.out.println("1부터 n까지의 합을 구하여라");
		end = sc.nextInt();
		for(start=0; start<=end; start++) {
			hap = hap + start;
		}
		System.out.println(hap);
	}
}
