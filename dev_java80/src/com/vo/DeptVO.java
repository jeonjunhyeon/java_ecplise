package com.vo;

// 오라클과 자바의 만남을 위해 사용
// VO패턴은 데이터의 영속성을 유지해주는 오라클 서버 제품과 연결하기 위한 목적
// Data관리 목적 - 모든 집합의 이름 뒤에 접미어로 VO를 붙여서 사용할 것 (VO를 붙이면 Data라고 생각하기)
// 그러하기 때문에 메인메소드는 필요없으며, 단독으로 실행하지 않는다.
/****************
 * 
 * Number(2) - 정수형으로 담을 수 있는 최대 크기는 0부터 99까지(임계값)
 * 			 - int(4Byte) 또는 long(8Byte)으로 받는다.
 *
 * varchar2(4,000byte까지 받을 수 있다.) - String 타입으로 받아야함.
 * VO패턴을 사용하면 한꺼번에 3가지 종류[부서번호, 부서명, 지역]의 값을 관리할 수 있다.
 * 서버 자체는 항상 동시에 여러 사람이 접속할 수 있다.
 * 이 여러 사람을 따로 관리할 수 있어야 하겠다. -> Thread 공부(자신이 직접 서버를 운영할 수 있는 코딩을 알려줄 예정)
 * 인스턴스화 하는 이유
 * 기존에 봤던 DeptVO dvo = new DeptVO();
 * 
 * dvo = new DeptVO();
 * 
 * dvo = new DeptVO();
 * 
 * 이것(17~19번)이 합법인가?
 * 어떻게 다른건가?
 * 어떤 방빕이 더 좋은 것?
 * 언제 저렇게 작성해야하나?
 * 
 */
public class DeptVO { //변수는 3개이므로 ROW는 한 번에 하나씩만 가능하므로, 3가지를 관리하는 것이다.
	private int    deptno = 0; //원시형 타입 - 부르면 값이 나온다. 이 주소번지는 4Byte이기에 229540, 229544, 229548로 증가
	private String dname = null; //레퍼런스 타입 - Class급으로 값이 아니라 주소번지가 나온다. 영업부가 출력되지 않나요? 돌연변이 이기에 예외로 출력된다.(중요)
	private String loc = null;
	
	// getter메소드 - Read - 리턴타입이 있다.
	public int getDeptno() { //파라미터는 필요없다.
		return deptno;
	}
	// Setter 메소드 - Write, Save 느낌으로 접근해보기
	// 리턴 타입은 필요없다. 하지만, 파라미터는 반드시 필요하다.
	public void setDeptno(int deptno) {
		//deptno = 30; //상수, 재사용성이 떨어짐
		//this는 나 자신을 가리키는 수정자이다. 여기서는 지변과 식별을 위해서 사용함 (생략 가능함/그런데 생략하면 헷갈림)
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) { // 'dname'은 지변
		this.dname = dname;//this가 붙어 있는 것은 전역이라고 생각하면 됨!!! 위에 dname = null;을 보면 됨.
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
