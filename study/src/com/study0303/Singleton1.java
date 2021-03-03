package com.study0303;

public class Singleton1 { 
	private Singleton1() {
		System.out.println("Hello singleton1!!");
	}
	
	private static Singleton1 singleton = new Singleton1();
	
	public static Singleton1 getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton1 singleton = Singleton1.getInstance();
	} 
}