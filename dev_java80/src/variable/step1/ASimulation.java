package variable.step1;

public class ASimulation {


	public static void main(String[] args) {
		A a = new A();
		System.out.println("영어 : "+a.eng); //0
		System.out.println("수학 : "+a.math);//
		System.out.println("국어 : "+a.kor); //
		System.out.println("==============================");
		System.out.println("영어 : "+a.eng1); //0
		System.out.println("수학 : "+a.math1);//
		System.out.println("국어 : "+a.kor1); //
		System.out.println("==============================");
		System.out.println("영어 : "+a.eng2); //90
		System.out.println("수학 : "+a.math2);//80
		System.out.println("국어 : "+a.kor2); //70
		A a2 = new A();
		a2.eng2 =95;
		a2.math2 =85;
		a2.kor2 =75;
		System.out.println("==============================");
		System.out.println("영어 : "+a2.eng2); //90
		System.out.println("수학 : "+a2.math2);//80
		System.out.println("국어 : "+a2.kor2); //70
		//인스턴스화를 할때마다 복제본이 여러개 생긴다.
	}
}