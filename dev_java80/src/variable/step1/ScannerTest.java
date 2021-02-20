package variable.step1;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		System.out.println("달에서의 몸무게 값을 나타내시오.");
		Scanner sc = new Scanner(System.in);
		double imsi = sc.nextDouble();
		
		if(imsi>0) {
			imsi = imsi*0.17;
		}
		else {
			imsi = imsi*0.17;
		}
		
		System.out.println("입력한 값은" + imsi + "입니다.");
		sc.close();
	}
}