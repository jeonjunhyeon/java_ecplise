package com.vo;

public class Member80VO {  
	 private String mem_id = null; //아이디담기
	 private String mem_pw = null; // 비번 담기
	 private boolean gender = false; // 성별 담기
	 /*
	  * 생성자는 반환타입이 없다.
	  * 클래스 이름과 동일해야 함
	  * 역할 : 전역변수의 초기화 담당
	  * static블럭에서 하는 일을 맡겨도 괜찮다. (Q36 볼 것)
	  * 만일 소켓통신을 통하여 서버사이드와 클라이트 사이트를 직접 구현(구축)할 때 이러한 초기화 부분은 중요하다.
	  * 
	  * 메소드 오버로딩
	  * 전제조건은 모두 같은 이름이며, 다른 이름이라면 해당 없다.
	  * 접근제한자의 유무에 영향은 없다.
	  * 리턴타입이 있고, 없고 영향이 없다. - 생성자는 해당 없음
	  * 예외를 던지고 그렇지 않고는 영향이 없다.
	  * void go() throws Exception, SQLException{}
	  * 
	  */
	 
	 public Member80VO() { // 디폴트 생성자
		 
	 } 
	 public Member80VO(String mem_id) { // 파라미터가 있는 생성자
		 this.mem_id = mem_id;
	 } 
	 public Member80VO(String mem_id, String mem_pw) { // 파라미터가 있는 생성자
		 this.mem_id = mem_id;
		 this.mem_pw = mem_pw;
	 } 
	 public Member80VO(String mem_id, String mem_pw, boolean gender) { // 파라미터가 있는 생성자
		 this.mem_id = mem_id;
		 this.mem_pw = mem_pw;
		 this.gender = gender;
		 
	 } 
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public boolean getGender() {
		return gender;
	}
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}    