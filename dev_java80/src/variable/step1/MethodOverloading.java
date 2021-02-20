package variable.step1;

import com.vo.DeptVO;

public class MethodOverloading {
	/****************************************************************************************************************
	 * 같은 타입이지만, 다른 곳에서 사용되는 것이다.
	 * @param pdvo - 조건절에서 사용될 상수값을 담는 클래스가 되는 것이다. where 절에 들어갈 조건 값으로 사용된다.
	 * @return rdvo - 오라클에서 조회된 결과를 담는 변수 - 화면 출력용
	 *****************************************************************************************************************/
	DeptVO go(DeptVO pdvo) {
		System.out.println(pdvo.getDeptno()+"," + pdvo.getDname()+"," + pdvo.getLoc());
		DeptVO rdvo = null;
		rdvo = new DeptVo();
		// 오라클을 경유한 다음, 조회 결과를 받아온 내용을 담는 클래스이다.
		return rdvo;
	}
	//메소드 이름은 같은데 서로 다른 메소드로 인지함.
	void go() {
		System.out.println("파라미터가 없는 go()호출 성공");
	}
	void go(int i) { //값에 의한 호출이다. i에는 메소드가 호출할 때, 파라미터로 넘어오는 10이 복사된다.
		System.out.println("파라미터가 int인 go(10)호출 성공"+i); //원시형 타입을 부르는거니까 값이 출력된다.
	}
	void go(String name) {
		System.out.println("파라미터가 String인 go(Smith)호출 성공");
	}
	
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.go();
		mol.go(10); // 9번의 값은 여기서 결정된다. 메소드 호출할 때 결정된다. 파라미터이다. 값에 의한 호출이다.
		mol.go("Smith"); //참조형 타입이니까 참조에 의한 호출이다. -String만 예외이다. 호출할 때 주소번지가 아니라 값이 출력된다는 점에 대해서..
		DeptVO pdvo = new DeptVO();
		
		pdvo.setDeptno(50); // int Type
		pdvo.setDname("개발1팀"); // String Type
		pdvo.setLoc("제주도"); // String Type
		
		mol.go(pdvo); // 주소번지를 넘겼다. 참조에 의한 호출이다 <==> 값에 의한 호출이다.
		
	}

}
