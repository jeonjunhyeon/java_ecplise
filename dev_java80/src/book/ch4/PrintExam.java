package book.ch4;
import java.util.Random;
/*
 * java.util('폴더'라고 생각하면 된다.)에 있는 패키지들은 제공되는 API를 통해서 뭔가를 만들 때, 유용한 기능들을 모아둔 패키지이다.
 * java.lang이 아닌 패키지는 모두 import 대상입니다.
 */
import java.util.Scanner;

public class PrintExam {

	public static void main(String[] args) {
		// 디폴트 생성자를 지원하지 않는 클래스가 존재한다.
		// 여기서 System이란 현재 너가 쓰고 있는 장치(device) - 처리주체이다.
		// 사용자 혹은 업무 담당자가 키보드에 입력한 값을 읽어온다. 입력장치를 나타내는 속성이 필요하다. - attribute
		Scanner sc = new Scanner(System.in); // 이것 자체가 local의 device이고, 서버가 아니므로 동기화가 불가능하며 이전 데이터를 계속 가지고 있다. 또한 새로 등록된 운동 선순에 대한 정보가 없다.
		Scanner sc2 = null;
		sc2 = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요.");
		System.out.println("===========================================");
		System.out.println(sc.nextInt());
		//디폴트 생성자를 제공해준다.
		Random r = new Random(); //채번하기, 난수 발생하기(로또와 같은?)
		int count = 1; //28번과 연동
		int cnt = 0; //29번과 연동
		//int dap = r.nextInt(10);
		for(int i=0;i<10;i=i++) {
			int dap = r.nextInt(10);
			System.out.println(count++ +":"+dap);
			System.out.println(++cnt +":"+dap);
		}
	}

}