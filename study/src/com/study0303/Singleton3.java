package com.study0303;

public class Singleton3 {
	
	private static Singleton3 instance = new Singleton3();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return instance;
	} 
	
	public static void main(String[] args) {
		Singleton3 st1 = Singleton3.getInstance();
		Singleton3 st2 = Singleton3.getInstance();
		
		for(int i=0; i<3; i++) {
			if(st1 == st2) {
				System.out.println("동일한 객체인가? :"+st1.toString());
			}
			else {
				System.out.println("다른 객체인가? :"+st2.toString());
			}
		}
	}

}
