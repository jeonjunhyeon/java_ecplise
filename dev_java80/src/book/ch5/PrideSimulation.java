package book.ch5;

public class PrideSimulation {

	public static void main(String[] args) {
		// private이기 때문에, 인스턴스화가 불가능하다. 만약 private가 아닌 public일 경우, 사용 가능하다.
		// 생성자를 선언할 때 private으로 선언했으므로 디폴트 생성자를 활용하고 싶다면 싱글톤패턴으로 정의하여 사용해야 한다.
		Pride myCar  = new Pride();
		Pride herCar = new Pride(10);
		Pride himCar = new Pride(100,4);
		
		himCar.wheelNum = 4;
		herCar.wheelNum = 15;
		System.out.println("himCar wheeNum : "+himCar.wheelNum);
		System.out.println("herCar wheeNum : "+herCar.wheelNum);
		
		Pride.wheelNum = 9;
		System.out.println("=====================Static=====================");
		System.out.println("Pride.wheelNum : "+ Pride.wheelNum);
		
		himCar.speed = 30;
		herCar.speed = 50;
		
		System.out.println("=====================non-Static=====================");
		System.out.println("himCar speed : "+himCar.speed);
		System.out.println("herCar speed : "+herCar.speed);
		
		// 같은 패키지 내에서 static인 경우, 가져오지 못한다. 따라서 생성자를 통하여 가져오는 것이 현명한 방법
		//change ch = new change();
	}

}
