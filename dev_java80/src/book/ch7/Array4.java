package book.ch7;
/*
 * 배열과 메소드 오버로딩에 대한 확인
 * 메소드 오버로딩 규칙
 * 1. 반드시 파라미터의 갯수가 달라야한다.
 * 2. 반드시 파라미터에 타입이 달라야한다.
 *  
 * 주의사항
 * ⓐ 리턴 타입의 유무는 영향이 없다.
 * ⓑ 접근제한자의 유무 또는 다른 것은 영향이 없다. 
 * (public > protected[패키지가 다르더라도, 상속관계라면 가능] > friendly[같은 패키지 안에서만 사용가능] > private)
 */
public class Array4 {
	double ds[], d2;
	double[] d3, d4;
	void mehtodA() {
		ds = new double[3];
		d2 = 3.14;
		d3 = new double[2];
		d4 = new double[5];
	}
	public static void main(String[] args) {
		Array4 a4 = new Array4();
		a4.mehtodA();
	}

}
