package book.ch7;
// EmpVO는 가로이기 때문에 1개의 row만 담을 수 있다.
// 14개가 있는데 이것을 한번에 담기 위해서는 객체 배열을 사용해야한다.
public class EmpVO {
	private int    empno = 0;
	private String ename = null;
	private double sal = 0.0;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
