package variable.step1;

public class A {
   //전역변수의 경우 초기화를 생략할 수 있다.
   public double kor,math,eng = 0; // public으로 선언해줌으로써 다른 패키지에서도 이 변수에대한 사용이 가능하다
   
   double kor1,math1,eng1; 
   
   
   double kor2 = 70, math2 = 80, eng2 = 90;
   
   void methodA() {
      /* 지역변수이다.
      double kor = 0;
      double math = 0;
      double eng = 0;
      */
      kor  = 70;
      math = 80;
      eng  = 90;
   }
  

}