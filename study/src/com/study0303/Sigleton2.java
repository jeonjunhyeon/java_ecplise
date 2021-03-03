package com.study0303;

public class Sigleton2 {
	private Sigleton2() {}
	
	private static Sigleton2 single = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			Sigleton2 sit = Sigleton2.getInstance();
			System.out.println("singleton : "+Sigleton2.toString());
		}
		for(int i=0; i<3; i++) {
			Sigleton2 sit = Sigleton2.getInstance();
			System.out.println("singleton : "+Sigleton2.toString());
		}
	}

}
