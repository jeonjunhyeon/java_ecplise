package study;

import java.util.Scanner;

public class Quiz1_2 {
	Scanner sc = new Scanner(System.in);
	
	public double moonWight (double wEarth) {
		double wMoon = 0.0;
		wMoon = wEarth *0.17;
		return wMoon;
	}
	
	public double earthWight (double wMoon) {
		double wEarth = 0.0;
		wEarth = sc.nextDouble();
		return wEarth ;
	}
	
	public static void main(String[] args) {
		Quiz1_2 qu = new Quiz1_2();
		double wMoon = 0;
		double monWight = qu.earthWight(wMoon);
		
		System.out.println("지구에서의 몸무게를 작성해주세요. (숫자만 입력해주세요)");
		
		System.out.println("달에서 저의 몸무게는" + qu.earthWight(wMoon) + "Kg 입니다.");
		
	}

}
