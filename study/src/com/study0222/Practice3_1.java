package com.study0222;

import java.util.Scanner;

public class Practice3_1 {
	
	double kor, math, soc, eng = 0.0; //각 과목에 대해 0으로 초기화(실수로 받음)
	
	private double sum(double kor, double math, double soc, double eng) { //private을 사용하여 이쪽 클래스에서만 사용할거임! (합계를 구하는 메소드 생성)
		double sumScore = kor + math + soc + eng; // sumScore 라는 변수로 각 파라미터의 값을 더해준다
		System.out.println("합계 : " +  sumScore + "점"); // sumScore 를 출력
		return sumScore; // 리턴값은 sumScore로!
	}
	
	private double avg(double kor, double math, double soc, double eng) { // 평균을 구하는 메소드 생성
		double avgScore = (kor + math + soc + eng)/4;  // 과목이 4개이기 때문에 각 과목을 모두 더한 후(avgScore라는 변수 설정), 나누기 4를 해준다.
		System.out.println("평균 점수 : " + avgScore + "점"); // avgScore를 출력
		return avgScore; //리턴값은 avgScore로!
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자에게 값 받을 준비
		Practice3_1 pr = new Practice3_1(); //위의 private 값을 받기 위해서 인스턴스화
		
		double kor[] = new double[3]; // 국어, 수학, 사회, 영어에 배열을 활용하여 3개의 방을 만들어준다. 26~29번
		double math[] = new double[3];
		double soc[] = new double[3];
		double eng[] = new double[3];
		
		for(int i=0; i<3; i++) { // for문으로 아래 실행문을 3번 반복할 것이다!!
			 
				System.out.println((i+1)+"번째 학생의 국어 점수를 입력해주세요."); // (i는 0부터 시작하기에 +1을 더하여 1번째 적용)사용자로부터 눈에 보이게 하여 작성하게 만들기 
				kor[i] = sc.nextDouble();  // 사용자로부터 국어 점수를 받을 것
				System.out.println((i+1)+"번째 학생의 수학 점수를 입력해주세요."); 
				math[i] = sc.nextDouble(); // 사용자로부터 수학 점수를 받을 것
				System.out.println((i+1)+"번째 학생의 사회 점수를 입력해주세요.");
				soc[i] = sc.nextDouble(); // 사용자로부터 사회 점수를 받을 것
				System.out.println((i+1)+"번째 학생의 영어 점수를 입력해주세요.");
				eng[i] = sc.nextDouble(); // 사용자로부터 영어 점수를 받을 것
				
				pr.sum(kor[i], math[i], soc[i], eng[i]); // sum(9~12) 메소드를 호출하여, 각 과목마다 사용자로부터 받은 점수를 합계!
				pr.avg(kor[i], math[i], soc[i], eng[i]); // avg(15~19) 메소드를 호출하여, 각 과목마다 사용자로부터 받은 점수를 합계!
				}
			}
		}
