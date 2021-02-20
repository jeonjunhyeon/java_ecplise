package book.ch4;

import java.util.Scanner;

public class MltTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}

}
