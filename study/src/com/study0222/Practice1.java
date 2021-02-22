package com.study0222;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Eweight = 0;
		int Mweight = 0;
		System.out.println("지구에서의 몸무게를 입력해주세요");
		Eweight = sc.nextInt();
		
		Mweight = (Eweight*17)/100;
		System.out.println("지구의 몸무게 : "+ Eweight + "Kg입니다.");
		System.out.println("달에서의 몸무게 : " + Mweight + "Kg입니다.");
		
		sc.close();
	}

}
