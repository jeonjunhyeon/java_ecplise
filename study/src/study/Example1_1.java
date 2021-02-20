package study;

import java.util.Scanner;

public class Example1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 1;
		
		while(i<5) {
			i++;
			while(j<10) {
				j++;
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		sc.close();
	}

}
