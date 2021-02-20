package book.ch4;

import java.util.Random;
import java.util.Scanner;
// 문제 : 0부터 9사이에 임의의 숫자를 채번하고, 그 숫자를 맞추는 게임을 작성해보시오.
// 기회는 3번만 제공되며, 그안에 못맞추면 '넌 바보'라고 출력하고 게임종료
// 더 큰 숫자일 땐 힌트를 '낮춰라'
// 더 작은 수일 땐, '높여라'
// 정답을 맞추었을 때, '축하합니다. 정답입니다.' (게임종료)
// 3번 안에 정답을 못맞추어도 게임 종료
public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자로부터 받을 내용
		Random r = new Random(); // 인스턴스화
		System.out.println("값을 입력해주세요."); // 출력을 위해서 작성된 내용
		int dap = r.nextInt(10); // random에서 불러왔을 때, dap이라는 변수명으로 10까지 랜덤으로 불러올거다!
		System.out.println(dap);// dap이란 임의의 변수명을 숫자로 출력!
		
		for(int i=0; i<3;i++) { // i는 0부터 10까지 반복, 대신 +2씩해서 3번만 나오게 만들기
			
			int write = sc.nextInt(); //작성된 내용을 정수로 나타내라!
			if(dap==write) { // 랜덤으로 부른 값과 작성된 정수값이 같냐? 오, 같아!
				System.out.println("축하합니다. 정답입니다. 종료"); // 그럼 정답이라고 출력해줘!
				break; // 딱 여기가 답이라 게임 끝!
			}
			else if(dap>write) { // random 값이 작성된 값보다 높아!
				System.out.println("높여라"); //그럼 높여야지!
			}
			else if(dap<write) { // 작성된 값이 더 높아!
				System.out.println("낮춰라"); // 그럼 낮춰라! 라는 내용을 작성해!
			}
			else { // 이 모든 경우의 수가 아니면 바보라고 하고 게임 끝내!
				System.out.println("바보");
				break; // for문 닫기
			}
		}
	}

}
