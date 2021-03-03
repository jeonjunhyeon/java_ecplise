package book.ch5;
/************************************************************************************************************************************
 * 싱글톤 패턴의 정의
 * 해당 클래스의 인스턴스가 하나만(정적) 만들어지고 어디서든지(public/캡슐레이션이 아니다.) 그 인스턴스에 접근할 수 있도록 하기 위한 패턴이다.
 * 클래스 변수(static variable이고, 변수는 1개이다.)
 * 인스턴스 변수
 * 생성자도 중복 선언이 가능하다.(같은 이름의 생성자가 여러 개가 올 수 있다.)
 * 방법1 - 고전적인 싱글톤 패턴 구현법
 * 방법2 - 성능이나 병목현상을 고려하여 구현하기
 * 방법3 - 
 * @author frien
 * 
 ************************************************************************************************************************************/
public class Pride {
	//클래스 변수이다.
	static int wheelNum = 0;
		   int speed    = 0;
	//private Pride(){}
	public Pride() {
		
	}
	public Pride(int speed) {
		this.speed = speed; //전역변수의 장애 : 전역변수는 매번 변화된다.
	}
	public Pride(int speed, int wheelNum) {
		this.speed    = speed;
		this.wheelNum = wheelNum;
	}
	void speedUP() { //non-static의 메소드
		speed = speed + 1;
	}
	/*
	static void stop() { //이 경우에는 문법 에러가 발생한다.
		speed = 0;
	}*/
	
	static void change() {
		wheelNum = 2;
		System.out.println(wheelNum);
	}
}
