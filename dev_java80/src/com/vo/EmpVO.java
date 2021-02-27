package com.vo;

public class EmpVO {
	public DeptVO getdVO() {
		return dVO;
	}
	public void setdVO(DeptVO dVO) {
		this.dVO = dVO;
	}
	// insert here - 급여 명세서에 부서이름을 출력하기 위한 SELECT문을 가지고 결정해보기
	// 여기 변수들은 모두 private로 한다. - 캡슐레이션(은닉화) - 보호(위변조), 직접 값을 변경불가
	// 각각의 값을 유지하거나, 재사용하는 문제는 인스턴스화에 따라 각각 다르게 활용가능하다.
	// 값을 초기화하는 방법에 대해서는 두 가지가 있습니다. 1) setter, 2) 생성자
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
	public EmpVO(int empno, String ename, String job, int mgr, 
				 String hiredate, double sal, double comm, 
				 int deptno, DeptVO dVO) {
		this.empno    = empno; //대입연산자 - 그 값(지변)이 유지(다른 클래스에서)된다.
		this.ename    = ename;
		this.job 	  = job;
		this.mgr 	  = mgr;
		this.hiredate = hiredate;
		this.sal 	  = sal;
		this.comm 	  = comm;
		this.deptno   = deptno;
		this.dVO 	  = dVO;
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
