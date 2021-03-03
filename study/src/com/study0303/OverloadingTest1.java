package com.study0303;

public class OverloadingTest1 {

	void cat() {
		System.out.println("매개변수 없음");
	}
	
	void cat(int a, int b) {
		System.out.println("매개변수 : "+a+" , "+b);
	}
	
	void cat(String name, String name1) {
		System.out.println("매개변수 :"+name+" , "+name1);
	}
	
	public static void main(String[] args) {
		OverloadingTest1 olt = new OverloadingTest1();
		olt.cat();
		olt.cat(30, 80);
		olt.cat("전준현", "전정현");
	}

}
