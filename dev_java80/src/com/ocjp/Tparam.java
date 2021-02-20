package com.ocjp;

class Param {
	int ival;
}

public class Tparam {
	void effectParam(Param p) {
		p = new Param(); //insert here 일 때, 얼마가 출력되는 것일까?
		p.ival = 500;
		System.out.println("sub ival = "+p.ival); // sub ival = 500 ==> Param에서 ival이 0으로 초기화된 후 effectParam에서 다시 500으로 초기화되었기에 500이라고 생각
	}
	
	public static void main(String[] args) {
		//클래스는 반드시 대문자로 시작
		Tparam tp = new Tparam();
		Param p = new Param();
		p.ival = 100;
		tp.effectParam(p);
		System.out.println("main ival = "+p.ival); // main ival = 100
	}
}