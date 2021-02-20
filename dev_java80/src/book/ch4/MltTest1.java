package book.ch4;

import java.util.Scanner;

public class MltTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int j = 1;
		
		while(i<10) {
			i++;
			if(i==9) {
				break;
			}
			while(j<10) {
				j ++;
				
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
		}
	}

}
