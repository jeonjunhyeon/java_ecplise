package com.study0303;

public class Sigleton2 {
	private Sigleton2() {}
	
	private static Sigleton2 single = new Sigleton2();
	
	private Sigleton2 getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			Sigleton2 sit = single.getInstance();
			System.out.println("singleton : "+single.toString());
		}
		for(int i=0; i<3; i++) {
			Sigleton2 sit = new Sigleton2();
			sit.getInstance();
			System.out.println("singleton : "+sit.toString());
		}
	}


}
