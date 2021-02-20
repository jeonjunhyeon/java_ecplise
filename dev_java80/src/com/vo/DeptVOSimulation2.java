package com.vo;

public class DeptVOSimulation2 {
	
	public static void main(String[] args) {
		DeptVO1 dvo_1 = new DeptVO1();
		dvo_1.setDeptno(50);
		int myDvo1 = dvo_1.getDeptno();
		//System.out.println(myDvo1);
		
		dvo_1.setDname("개발1팀");
		String myDvo2 = dvo_1.getDname();
		//System.out.println(myDvo2);
		
		dvo_1.setLoc("경기도 광명시");
		String myDvo3 = dvo_1.getLoc();
		
		
		dvo_1 = new DeptVO1();
		dvo_1.setDeptno(115);
		int myDvo4 = dvo_1.getDeptno();
		
		dvo_1.setDname("기획팀");
		String myDvo5 = dvo_1.getDname();
		
		dvo_1.setLoc("서울시 관악구");
		String myDvo6 = dvo_1.getLoc();
		
		System.out.println(myDvo3 + "," +myDvo2 + "," +myDvo1);
		System.out.println(myDvo6 + ":" + myDvo5 + ":" +myDvo4);
		
	}
}
