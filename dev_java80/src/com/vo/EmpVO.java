package com.vo;

public class EmpVO {
	public DeptVO getdVO() {
		return dVO;
	}
	public void setdVO(DeptVO dVO) {
		this.dVO = dVO;
	}
	//insert here - 급여 명세서에 부서이름을 출력하기 위한 SELECT문을 가지고 결정해보기
	private DeptVO dVO        =null;
	private int    empno      =0; //7566
	private String ename      =""; // 사원명
	private String job        =""; //
	private int    mgr    	  =0; //그룹코드
	private String hiredate   =""; // 입사일자
	private double sal        =0; // 급여
	private double comm       =0; // 인센티브
	//릴레이션은 부모로부터 내려받은 속성이다.
	private int    deptno     =0; //부서번호(FK) - 외래키 - 조인시에 사용되는 컬럼 - 릴레이션이다.
	//생성자의 경우 생략할 수 있고, 생략되었을 때 JVM이 대신 제공해줌
	//그러나 한개라도 생성자가 정의되어 있다면, 제공되지 않는다. (이것은 디폴트 생성자 포함이다. - 디폴트 생성자는 파라미터를 가지지 않는 생성자를 말함.)
	public EmpVO() {}
	public EmpVO(int empno) {
		this.empno = empno; //대입연산자 - 그 값(지변)이 유지(다른 클래스에서)된다. 
	}	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
