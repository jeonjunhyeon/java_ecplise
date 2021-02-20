package book.ch7;

public class Array5 {
	void mehtodB(boolean isOk[]) {
		System.out.println(isOk.length);
		// System.out.println(isOk[3]);
	}
	/*
	 * 10-11(선언만 됨, 초기화가 안됐다. 방 크기가 결정되지 않았다. isOk.lengh:NullPointerException) 
	 */
	public static void main(String[] args) {
		boolean isOk[] = null; //선언만 되고, 크기가 결정되지 않음!
		Array5 a5 = new Array5();
		a5.mehtodB(isOk);
	}

}
/*
 변수는 한번에 하나값만 담을 수 있다. - 장애
 배열은 한번에 여러개의 값을 담을 수 있다. 
 그러나, 다른 타입은 담을 수가 없다.[문제제기] - 객체 배열, ArrayLIst는 가능[문제해결능력]
 또, 끼워넣기가 불가하다. (크기조정 불가) - ArrayList 를 사용하면 문제가 해결된다.
 
 자료구조(List계열, Map계열, Set계열) - 늘었다 줄었다. 한다. 끼워넣기 가능. 회원탈퇴, 신입사원 등록
 이런 자료구조는
 First In, First Out
 Left In First Out
 Left In, Left Out
 이렇게 되어 있다.
 
 세션과 쿠키가 있다.
 
 오라클 서버 (영원함)
*/