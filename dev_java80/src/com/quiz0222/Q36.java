package com.quiz0222;
class Q36_1{
	void methodC() {
		Q36.methodB();
		Q36 q36 = new Q36();
		q36.methodB();
	}
	
}
/*
 * 5교시. 
 * non-static 영역에서 static타입은 접근할 수 있다. 
 * 
 * 그러나
 * static 영역에서 non-static 영역은 접근이 불가하다.
 * 
 */
public class Q36 {
	//static 블럭
	static {
		System.out.println("static block");
	}
	void methodA() {
		System.out.println("methodA 호출");
		methodB();
	}
	static void methodB() {
		// 이것이 안되는 이유를 아는 것이 중요하다.
		//methodA();
		System.out.println("static methodB 호출");
		
	}
	// 메인메소드도 static이다.
	// main thread 라고 하는데 이 말은 우선순위가 높다는 뜻이다.
	// javascript는 single thread이다.
	public static void main(String[] args) {
		System.out.println("static main");
		methodB();
	}

}
