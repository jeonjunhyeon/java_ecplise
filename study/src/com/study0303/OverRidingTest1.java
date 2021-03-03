package com.study0303;
/*******************************************************************************
 * 오버라이딩 : 메서드 / 매개변수 / 타입 / 리턴타입 모두 동일
 * 오버로딩 : 메서드 이름만 동일 / 매개변수, 타입 : 다름 / 리턴타입 : 상관없음
 * @author frien
 *******************************************************************************/
	class Women{
		public String name;
		public int age;
		
		public void info() {
			System.out.println("남자의 이름은 "+ name +", 나이는 "+age+"살 입니다.");
		}
	}
	
	class Job extends Women{ //Women클래스(부모클래스)를 상속받음.
		String job;
		
		public void info() { //부모 클래스인 Women에 있는 info를 재정의하기 위한 메소드
			super.info();
			System.out.println("남자의 직업은 "+job+"입니다.");
		}
	}
	public class OverRidingTest1 {//메서드명, 변수, 반환형이 모두 같을 때 상위클래스의 모든 변수를 다 재정의해서 사용하겠다!
		public static void main(String[] args) {
		
			Job j = new Job();
			
			j.name = "전준현";
			j.age = 31;
			j.job = "백수";
			
			j.info();
		}
}
