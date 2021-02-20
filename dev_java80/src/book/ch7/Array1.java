package book.ch7;

/*
 *  단점 : ⓐ 배열은 한 번 선언하면 원소의 수를 조정 불가하다.
 *  ⓑ 끼워넣기가 안된다.
 *  배열의 주번.length 명사형 -원소의 갯수.  "hello".length() -> 문자열의 길이이다.
 */
public class Array1 {
	
	public void printArray(int empnos[]) {
		int cnt = 0;
		for(int i=0;i<empnos.length;i++) {
			System.out.println(++cnt+"번방"+empnos[i]);
		}
	}
	/*
	 * 20-21-23-24-10-11-12-11-12-11-12-11 .....
	 * 
	 * 
	 */  
	public static void main(String[] args) {
		int empnos[] = new int[30];
		//저 14개의 방에는 어떤 값이 들어있을까요?
		Array1 a1 = new Array1();
		a1.printArray(empnos);
	}
}