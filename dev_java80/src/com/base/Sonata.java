package com.base;

public class Sonata {
	//전역변수 선언
	//변수를 부르면(호출하면)
	//바퀴수를 담을 변수 선언
	int wheelNum = 4;		//선언과 초기화를 동시에 처리
	//타입이 String 이면 문자열을 담을 수 있다.
	String carColor = "black";
	/*
	 * 메소드 선언하기
	 * @param args - 파라미터의 타입은 배열이다.
	 * :파라미터는 사용자가 입력한 값을 받는 곳이다.
	 * :파라미터 자리에도 변수를 선언할 수 있다.
	 * -> 이것을 지역변수라 한다.
	 * -> 초기화를 할 수 없다.
	 * -> 왜냐하면 호출될때 값이 넘어 오기 때문.
	 */
	/* 자바가상머신은 일하는 순서[알고리즘]가 있다.
	 * 23[main 메소드 -main 스레드 - entry point- 가장먼저 시작됨 -exe 파일로 만들수있음] -24~36[주석-실행하지 않음] 
	 * 38[출력담당] -39[인스턴스화:himCar - 지역변수성격] - 45~46[변수선언] -47[변수초기화: 생략불가함] -48-49-50-51-52
	 */
	public static void main(String[] args) {
		// System - 클래스이다.
		// out은 변수인데 출력은 담당하는 변수
		// 사용자가 입력한 값을 입력 받고 싶을땐 System.in과 같이 사용함.
		// System은 로컬에서 사용되고 있는 컴퓨터를 말함.
		// 출력창에 뭔가를 내보내고 싶을때 사용하는 변수(속성) -out
		// out을 제공하는 자가 누구인가 ? System
		/* 자바가상머신이 이것을 확인하려면 속성에 접근할 수 있어야 하는데
		   이때 사용하는 식별자가 .(dot)연산자 이다.*/
		// 소유주.속성.메소드이름()
		// 클래스의 구성요소 2가지는 무엇일까요? 메소드와 변수
		// 변수와 메소드를 구분할 수 있는가?
		// 생긴모양,syntax 로 구분할 수 있다.
		// 이런(변수와 메소드) 것들은 어떻게 사영하나요?
	
		System.out.println("나는 소나타 입니다.");
		Sonata himCar = null; //선언만 할경우엔 Null Pointer Exception 이 발생
		himCar = new Sonata();// = <Sonata himCar = null;> =<himCar = new Sonata;>
		/* 반드시 메소드 안에서 해야 되는 건 아니지만 변수를 접근해야 하는 위치가
		main메소드 안이기 때문에 이런 경우에는 반드시 메인 메소드 안에서 해야된다. 
		& 다르게 말하면 static이 붙어있기 때문에 main 메소드 안에서 해야된다.*/
		//인스턴스화를 하면 전역변수에 접근할수있다
		System.out.println("소나타의 바퀴 수는 "+himCar.wheelNum+" 개입니다.");
		
		int speed;
		speed = 0; // 에러땜에 임시로 초기화 시킴
		System.out.println("현재 소나타의 속도는 "+speed);// 변수 초기화 안됨 = 에러 
		speed = 50;
		System.out.println("현재 소나타의 속도는 "+speed);
		speed = 30;
		System.out.println("현재 소나타의 속도는 "+speed);
	}
}
