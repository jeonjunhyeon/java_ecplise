package study;

import java.util.Scanner;

public class Test2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Test2 nums = new Test2();
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println(i + " * " +j + " = " + (i*j) );
			}
		}
		
		sc.close();
		}
		
	}
