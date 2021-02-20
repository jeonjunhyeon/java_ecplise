package study;

public class ScannerTest1 {

	public static void main(String[] args) {
		
		int x = 5;
		ScannerTest1 sc = new ScannerTest1();
		sc.doStuff(x);
		System.out.print("main x = " + x);
		
		
	   }
		
		 void doStuff(int x) {
		 System.out.print(" doStuff x = "+ x++);  
		 
		 }
		
		 
		 
		
	}
