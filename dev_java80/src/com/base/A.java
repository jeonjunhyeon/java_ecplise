package com.base;

public class A {
	int age = 30;
	public static void main(String[] args) {
		A a = null; // NullPointerException 발생하지 않음
		//사용할때 Exception 발생
		a = new A ();
		System.out.println(a.age);

	}

}
