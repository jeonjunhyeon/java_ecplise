package book.ch7;
// 전제 조건은 반드시 메소드 이름이 같을 때만 고려함.
import com.vo.DeptVO;

public class MethodOverloading {
	void go() {
		
		
	}
	//public void go() {} // 접근제한자는 영향이 없다.
	public void go(int[] a) {} // 이것이 메소드 오버로딩이다. (파라미터의 갯수가 달라졌기 때문에)
	//public void go(int[] b) {} // 이것은 메소드 오버로딩이 아니다.
	public void getDeptList(DeptVO dvo) {
		//메소드 오버로딩을 만족하는 경우}
	}
	/*리턴타입의 유무와는 상관없다.
	 * int go() {
		return 0;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
