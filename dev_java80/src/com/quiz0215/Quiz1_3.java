package com.quiz0215;

import java.util.Scanner;

class Common{
	public double moonWeight(double wEarth) {
		//달의 몸무게
		double wMoon = 0.0;
		wMoon = (wEarth*0.17);
		return wMoon;
	}
}

public class Quiz1_3 {

	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		System.out.println("지구의 몸무게를 입력하세요");
		//내가 사용하고 있는 컴퓨터에서 in(입력장치로부터) 읽어보세요
		Scanner sc = new Scanner(System.in);
		wEarth = sc.nextDouble();
		double wMoon = 0.0;
		Quiz1_3 q2 = new Quiz1_3();
		Common cm = new Common();
		wMoon = cm.moonWeight(wEarth);
		System.out.println("달의 몸무게 : "+wMoon +"Kg");
		System.out.println("지구의 몸무게 : "+wEarth + "Kg");
	}
}	
