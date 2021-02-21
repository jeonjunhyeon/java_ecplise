package book.ch4;

public class ForTest {

	public static void main(String[] args) {
		//int i, hap, hap1 = 0;
		int i = 0;
		int hap = 0;
		int hap1 =0;
		
		for(i=1; i<=10; i=i+1) {
			if(i%2 == 0) {
				hap = hap + i;
				
			}else if(i%2 == 1){
			}
			else {			
			}	hap1 = hap1 + i;
			
			System.out.println("짝수합"+hap);
			System.out.println("홀수합"+hap1);
		}
		
	}
}
