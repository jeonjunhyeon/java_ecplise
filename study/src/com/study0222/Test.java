package com.study0222;

public class Test {
	double kor, math, soc, eng = 0.0;
	
	public double sum(double kor2, double math2, double soc2, double eng2) {
		// sumScore 라는 변수로 각 파라미터의 값을 더해준다
		double sumScore = kor2 + math2 + soc2 + eng2;
		// sumScore 를 출력
		System.out.println("합계 : " +  sumScore + "점");
		// 타입이 double이기에 리턴값은 sumScore로!
		return sumScore;
	}
	public double avg(double kor, double math, double soc, double eng) { 
		// 과목이 4개이기 때문에 각 과목을 모두 더한 후(avgScore라는 변수 설정), 나누기 4를 해준다.
		double avgScore = (kor + math + soc + eng)/4;  
		// avgScore를 출력
		System.out.println("평균 점수 : " + avgScore + "점");
		// double 타입으로 인해 리턴값은 avgScore로!
		return avgScore;
	}
}
