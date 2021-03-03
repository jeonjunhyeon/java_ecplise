package com.study0303;

public class Singleton1 { 
	// 싱글톤 패턴은 공공재라고 생각하면 된다! 공공재는 우리가 필요할 때 만드는 것이 아니라,
	// 이미 만들어진 것에 우리가 접근하여 이요하는 것처럼 외부에서도 마음대로 새로 생성할 수 없다.
	private Singleton1() {}
	
	private static Singleton1 single = null;
	
	public static Singleton1 getInstance() {
		
		if(single == null) {
			System.out.println("싱글톤 생성..");
			single = new Singleton1();
		}
		return single;
	}

}