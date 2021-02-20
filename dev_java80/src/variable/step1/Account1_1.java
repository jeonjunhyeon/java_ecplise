package variable.step1;


public class Account1_1 {
	double kor,math,eng =0;
	
	private double hap(double kor2,double math2,double eng2) {
		double tot = kor2 + math2 + eng2;
		return tot;
	}
	private double avg(double tot,int count) {
		return  tot/count;
	}
	
	
	public static void main(String[] args) {
		Account1_1 ac = new Account1_1();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		int count = 3;
		double tot = ac.hap(ac.kor,ac.math,ac.eng);
		double test_avg = ac.avg(tot,count);
		System.out.println(test_avg);
	}

}
