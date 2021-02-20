package com.base;
/* 선언이 먼저이고 사용은 나중이다 - 위치
 * 순서가 중요하다 - 알고리즘
 * 답안지를 A,B,C 타입....
 * 문제해결 능력이 있다.
 */
public class Pride {
	int wheelNum = 4;
	// int i;    << 전역변수는 9~10번과 같이 따로 분리해서 선언과 초기화를 할 수없다.
	// i = 10;
	int i = 10;
	// herCar.wheelCar = 6;  << herCar가 선언이 안돼있기 때문
	void go(int x) {
		
	}
	public static void main(String[] args) {
		Pride herCar = new Pride(); //인스턴스화
		Pride gnomCar = new Pride(); //인스턴스화
		gnomCar.wheelNum = 6; // 이렇게 초기값을 변경할 수 있다.
		//지역변수는 gnomCar.x라고 쓸 수없다. stack영역에 있고 자원관리를 JVM으로 부터 관리받음
		//전역변수만이 아래와 같이 사용 가능함.
		//gnomCar.x = 100;
		//insert here - 자동차 바퀴수는 4개입니다.
		//non-static의 변수 wheelNum은 static영역인 main안에서 사용할 수 없다.
		//해결방법 : 인스턴스화를 하면 내안에 있는 변수 혹은 메소드라 하더라도 호출할 수 없다.
		System.out.println("자동차 바퀴수가 " +herCar.wheelNum+" 개 입니다.");
		System.out.println("자동차 바퀴수가 " +gnomCar.wheelNum +" 개 입니다.");
		
	}

}
