package study;

import java.util.Scanner;

public class Test2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			if(i<9) {
				sum = sum + i;
			}
			else {
				break;
			}
			System.out.println(sum);
		}
		
	}
}
