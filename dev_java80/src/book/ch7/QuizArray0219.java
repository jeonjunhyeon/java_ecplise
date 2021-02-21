package book.ch7;

import java.util.Random;

public class QuizArray0219 {
	//선언부
	int nums[] = null;
	
	//배열의 초기화
	void initArray(int size) {
		Random r = new Random();
		nums = new int[size];
		for(int x=0; x<nums.length;x++) {
			nums[x] = r.nextInt();
			System.out.println(nums[1]);
		}
	}
	//배열 출력하기
	int maxInArray(int size) {
		int i, imax = nums[0];
		for(i=1;i<size;i++) {
			if(nums[i]>imax) {
				imax = nums[i];
			}
		}
		return imax;
	}
	//최대값 구하기
	void printArray(int size) {
		System.out.println("배열 : ");
		if(nums!=null) {
			for(int x=0; x< nums.length; x++) {
				System.out.printf("%3d", nums[x]);
			}
		}
	}
	
	//main메소드
	public static void main(String[] args) {
		QuizArray0219 qa = new QuizArray0219();
		int size = 10;
		qa.initArray(size);
		qa.printArray(size);
		int max = qa.maxInArray(size);
		System.out.println("최대값 : " + max);
	}
}
