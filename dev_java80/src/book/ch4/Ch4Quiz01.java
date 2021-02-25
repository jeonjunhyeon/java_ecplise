package book.ch4;

public class Ch4Quiz01 {
	
	public static void main(String[] args) {
		int[] a = new int[100];
		
		for(int i=1;i<a.length;i++) {
			switch(i%5) {
			case 0:
				System.out.println("fizz");
				break;
			case 2:
				System.out.println("buzz");
				break;
			}
			System.out.println(i);
			
		}
	}
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] a = new int[100]; 
//		
//		for(int i=0;i<a.length;i++) {
//			if(i%35==0) {
//				System.out.println("fizzbuzz");
//			}
//			else if(i%7==0) {
//				System.out.println("buzz");
//			}
//			else if(i%5==0) {
//				System.out.println("fizz");
//			}
//			else {
//				System.out.println(i+1);
//			}
//		}
//	}

}
