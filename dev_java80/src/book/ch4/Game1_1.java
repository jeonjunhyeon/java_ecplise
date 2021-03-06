package book.ch4;

import java.util.Random;
import java.util.Scanner;

public class Game1_1 {

	public static void main(String[] args) {
		// 난수 발생을 지원하는 클래스 추가하기(인스턴스화 하기)
		Random r = new Random();
		// 그 클래스가 제공하는 메소드를 호출하여 채번하기
		int sum = r.nextInt(10); // 정수 정답 = r.메소드이름();
		// 사용자로부터 입력한 값 받아오기
		Scanner sc = new Scanner(System.in);
		// 사용자가 입력한 값 담기 - 선언하기, 초기화
		
		// 0부터 9중에서 골라봐!
		System.out.println("0부터 9까지 골라서 작성하세요.");
		int count = 0;
		int dap = 0 ;
		String user = null;
		// 3번의 기회를 줄게 - 1번, 2번, 3번 ==> 반복문
		for(;(user=sc.nextLine())!=null;){
			// insert here - 실행문
			
			// 판별식이 와야한다.
			if(count<3) {
				//1번, 2번, 3번을 이 안에서 해야한다.
				if(Integer.parseInt(user)==dap) {
					System.out.println("축하합니다. 정답입니다.");
					break;//for문 탈출
				}
			}
			// 너 바보?
			else {
				// 바보 -break; ==> for문을 탈출하기 , if문을 탈출하려면 return;
				System.out.println("바보");
				break;
			}
			// 정답
			
		}
	}

}
