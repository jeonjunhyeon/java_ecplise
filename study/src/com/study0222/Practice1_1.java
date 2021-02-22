package com.study0222;

import java.util.Scanner;

public class Practice1_1 {

	public double MoonWeight(double Eweight) {
		double Mweight = 0.0;
		Mweight = (Eweight*0.17);
		return Mweight;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Eweight = 0.0;
		
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 사람의 지구 몸무게를 입력해주세요");
			Eweight = sc.nextInt();
			Practice1_1 pt = new Practice1_1();
			double Mweight = 0.0;
			Mweight = pt.MoonWeight(Eweight);
			
			System.out.println("지구의 몸무게 : "+ Eweight + "Kg입니다.");
			System.out.println("달에서의 몸무게 : " + Mweight + "Kg입니다.");
		}
		sc.close();
	}

}
