package com.quiz0215;

import java.util.Scanner;

/*
 * 에러의 2가지 종류
 * 1. 컴파일 타임 에러(문법 에러)
 * 2. 런타임 에러(실행 오류/논리의 오류)
 * 
 */
public class Quiz1_4 {
	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		System.out.println("지구의 몸무게를 입력하세요");
		//내가 사용하고 있는 컴퓨터에서 in(입력장치로부터) 읽어보세요
		Scanner sc = new Scanner(System.in);
		wEarth = sc.nextDouble();
		if(sc.hasNextDouble()) { //너 입력한 값이 더블이야? yes!
			wEarth = sc.nextDouble();
			double wMoon = 0.0;
			Quiz1_4 q2 = new Quiz1_4();
			Common cm = new Common();
			wMoon = cm.moonWeight(wEarth);
			System.out.println("달의 몸무게 : "+ wMoon +"Kg");
			System.out.println("지구의 몸무게 : "+ wEarth + "Kg");
		}
		else {
			System.out.println("실수만 입력하세요..제발..");
			//return;// 리턴을 넣어 main메소드를 탈출한다. 25번 아래는 진행할 필요없음!! 제어문에서는 return, 반복문에서는 break
		}
		System.out.println("여기");
		
	}
}	
