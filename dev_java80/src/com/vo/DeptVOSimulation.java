package com.vo;

public class DeptVOSimulation {
	DeptVO methodA() { // 반환값이 전혀 역할을 못함
		
		return new DeptVO();
	}
	void methodB() { //반환값이 3가지가 가능함.
		
	}
	DeptVO[] methodC() { // 반환값이 3가지 종류에 대해서 n개 로우까지도 가능함.
		
		return new DeptVO[3];
	}
	public static void main(String[] args) {
		DeptVO dvo = new DeptVO();
		//위치 - 어디서 호출해야 할까요?
		dvo.setDeptno(30);
		//insert here = 부서번호 30을 출력하도록 코드를 추가하시오.
		int mydeptNo = dvo.getDeptno(); // 30 출력
		System.out.println(mydeptNo);
		
		//dvo.setDname("영업부");
		String myDname = dvo.getDname(); // null 출력
		System.out.println(myDname);
		
		String myLoc = dvo.getLoc(); //null출력
		
		//DeptVO dvo = new DeptVO(); => 이건 왜 안되냐
		dvo = new DeptVO();
		dvo.setDeptno(500);
		int mydeptNo_1 = dvo.getDeptno();
		System.out.println(mydeptNo_1);
		dvo.setDname("영업부");
		String myDname_1 = dvo.getDname();
		System.out.println(myDname_1);
		
		dvo = new DeptVO();
		dvo.setDeptno(440);
		int mydepNo_2 = dvo.getDeptno();
		System.out.println(mydepNo_2);
		
		dvo.setDname("기획부");
		String myDname_2 = dvo.getDname();
		System.out.println(myDname_2);
	}

}
