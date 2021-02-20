package variable.step1;

public class StaticTest {
	
	static void avg() {
		System.out.println("avg 호출 성공");
	}
	
	public static void main(String[] args) {
		if(args.length==0) {
			// 아래 문장은 조건에 따라 한 번도 실행기회를 못 가질 수도 있다.
			System.out.println("입력해주세요");
			return; // main 메소드 탈출하기
		}
		System.out.println(args[0]+10);
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);
		System.out.println("========>"+imsi+10);
		
		StaticTest.avg();
	}

}
