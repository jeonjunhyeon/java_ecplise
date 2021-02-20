package com.base;

import java.lang.reflect.Method;

import javax.swing.JFrame;

public class SeoulTemp {
	void methodA() {
		
	}
	double methodB() {
		return 3.14;
	}
	float methodC() {
		return 3.14f;
	}
	int methodD() {
		return (int)3.14;
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		SeoulTemp b = new SeoulTemp();
		System.out.println(b.methodD());
	}

}
