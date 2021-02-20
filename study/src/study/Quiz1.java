package study;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double wEarth = 0.0;
		double wMoon = 0.0;
		
		System.out.println("지구에서의 몸무게를 작성해주세요. (숫자만 입력해주세요)");
		
		wEarth = sc.nextDouble();
		wMoon = wEarth*0.17;
		
		System.out.println("달에서 저의 몸무게는 " + wMoon + "입니다.");
		
		sc.close();
	}

}
