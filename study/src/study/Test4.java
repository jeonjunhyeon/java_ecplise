package study;

import java.util.Scanner;

public class Test4{
	
	public int new_M(int m){
		
		int m1 = m - 45;
		int m2 = m1 + 60;
		
		return m2;
	}
	
	public int new_H(int h) {
		
		int h1 = h - 1;
		int h2 = h1 + 24;
		
		return h2;
	}
	
	public static void main(String[] args){
		
		Test4 te = new Test4();
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(0<=h && h<24) {
				if(m < 45) {
					if(h == 0) {
						int m3 = te.new_M(m);
						int h3 = te.new_H(h);
						System.out.printf("%d %d",h3, m3);
					}
					else {
						int m3 = te.new_M(m);
						System.out.printf("%d %d", h-1, m3);
					}
				}
				else if(45 <= m) {
					if(h == 0) {
						System.out.printf("%d %d", h, m-45);
					}
					else if(0 < h) {
						System.out.printf("%d %d", h, m-45);
					}
					else {}
				}
		}
    }
}