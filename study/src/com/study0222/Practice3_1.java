package com.study0222;

import java.util.Scanner;

public class Practice3_1 {
	//각 과목에 대해 0으로 초기화(실수로 받음)
	//double kor, math, soc, eng = 0.0; 
	
//	//private을 사용하여 이쪽 클래스에서만 사용할거임! (합계를 구하는 메소드 생성)
//	private double sum(double kor, double math, double soc, double eng) {
//		// sumScore 라는 변수로 각 파라미터의 값을 더해준다
//		double sumScore = kor + math + soc + eng;
//		// sumScore 를 출력
//		System.out.println("합계 : " +  sumScore + "점");
//		// 타입이 double이기에 리턴값은 sumScore로!
//		return sumScore;
//	}
//	
//	// 평균을 구하는 메소드 생성
//	private double avg(double kor, double math, double soc, double eng) { 
//		// 과목이 4개이기 때문에 각 과목을 모두 더한 후(avgScore라는 변수 설정), 나누기 4를 해준다.
//		double avgScore = (kor + math + soc + eng)/4;  
//		// avgScore를 출력
//		System.out.println("평균 점수 : " + avgScore + "점");
//		// double 타입으로 인해 리턴값은 avgScore로!
//		return avgScore;
//	}

	public static void main(String[] args) {
		Test tt = new Test();
		//사용자에게 값 받을 준비
		Scanner sc = new Scanner(System.in); 
		//위의 private 값을 받기 위한 인스턴스화
		//Practice3_1 pr = new Practice3_1(); 
		
		// 국어, 수학, 사회, 영어에 배열을 활용하여 3개의 방을 만들어준다. 36~39번
		double kor[] = new double[3]; 
		double math[] = new double[3];
		double soc[] = new double[3];
		double eng[] = new double[3];
		
		for(int i=0; i<3; i++) { // for문으로 아래 실행문을 3번 반복할 것이다!!
			
			// 사용자로부터 국어 점수를 받을 것
			System.out.println((i+1)+"번째 학생의 국어 점수를 입력해주세요."); 
			kor[i] = sc.nextDouble();
			System.out.println((i+1)+"번째 학생의 수학 점수를 입력해주세요."); 
			math[i] = sc.nextDouble(); // 사용자로부터 수학 점수를 받을 것
			System.out.println((i+1)+"번째 학생의 사회 점수를 입력해주세요.");
			soc[i] = sc.nextDouble(); // 사용자로부터 사회 점수를 받을 것
			System.out.println((i+1)+"번째 학생의 영어 점수를 입력해주세요.");
			eng[i] = sc.nextDouble(); // 사용자로부터 영어 점수를 받을 것
				
			// sum(9~12) 메소드를 호출하여, 각 과목마다 사용자로부터 받은 점수를 합계!
			tt.sum(kor[i], math[i], soc[i], eng[i]); //(kor[i], math[i], soc[i], eng[i]); 
			// avg(15~19) 메소드를 호출하여, 각 과목마다 사용자로부터 받은 점수를 합계!
			tt.avg(kor[i], math[i], soc[i], eng[i]); 
			}
		}
	}
