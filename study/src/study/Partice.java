package study;

import java.util.Scanner;

public class Partice {

	public double wMoon(double wEarth) {
		double wMoon = 0.0;
		wMoon = (wEarth*0.17);
		return wMoon;
	}
	
	public static void main(String[] args) {
		//지구의 몸무게 값 초기화 및 선언
		double wEarth = 0.0;
		Scanner sc = new Scanner(System.in);
		//출력이 잘되었는지 확인하고자 적은 곳
		System.out.println("지구 몸무게 값을 입력하면 달에서의 몸무게가 나옵니다.");
		wEarth = sc.nextDouble();
		Partice p = new Partice();
		
		
		sc.close();
	}

}
