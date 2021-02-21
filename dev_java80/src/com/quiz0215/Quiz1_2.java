package com.quiz0215;

import java.util.Scanner;

public class Quiz1_2 {
	public double moonWeight(double wEarth) {
		//달의 몸무게
		double wMoon = 0.0;
		wMoon = (wEarth*0.17);
		return wMoon;
	}

	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		//출력이 잘되는지 확인
		System.out.println("지구의 몸무게를 입력하세요");
		//내가 사용하고 있는 컴퓨터에서 in(입력장치로부터) 읽어보세요
		Scanner sc = new Scanner(System.in);
		//지구의 몸무게는 작성자가 직접 작성해라!
		wEarth = sc.nextDouble();
		// 달의 몸무게 초기화
		double wMoon = 0.0;
		// 인스턴스화 (moonWeight라는 메소드의 값을 가져오기 위해서)
		Quiz1_2 q2 = new Quiz1_2();
		// wMoon이라는 값을 가져옴
		wMoon = q2.moonWeight(wEarth);
		// 달의 몸무게 출력
		System.out.println("달의 몸무게 : "+wMoon +"Kg");
		// 지구의 몸무게 출력
		System.out.println("지구의 몸무게 : "+wEarth + "Kg");
	}
}	
