package study;

import java.util.Scanner;

public class Test1 {
	
	double sum(double kor, double math, double eng) {
		double sumScore = kor + math + eng;
		System.out.println("점수 합 :"+sumScore+",");
		return sumScore;
	}
	
	double mean(double sum, int classNum) {
		double meanScore = sum/classNum;
		System.out.println("점수 합 :"+meanScore+",");
		return meanScore;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Test1 acc =new Test1();
		double[] korScore = new double[10];
		double[] mathScore = new double[10];
		double[] engScore = new double[10];
		int classNum = 3;

		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(i+"번째 학생의 국어 점수를 입력하시오 : ");
			korScore[i] = s.nextDouble();
			System.out.println(i+"번째 학생의 수학 점수를 입력하시오 : ");
			mathScore[i] = s.nextDouble();
			System.out.println(i+"번째 학생의 영어 점수를 입력하시오 : ");
			engScore[i] = s.nextDouble();
			acc.mean(acc.sum(korScore[i], mathScore[i],engScore[i]), classNum);
			
		}
		
		
	}

}
