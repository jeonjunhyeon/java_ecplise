package com.quiz0222;
class Q39_1{
	Q39 a1 =new Q39();
	Q39 a2 =new Q39();
	Q39 a3 =new Q39();
	sysout
	System.out.printIn(A.getInstanceCount());
}
public class Q39 {
	private int counter = 0;
	public static int getInstanceCount() {
		return counter;
	}
	public Q39() {
		counter++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
