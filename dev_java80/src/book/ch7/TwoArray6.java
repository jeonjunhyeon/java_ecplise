package book.ch7;

public class TwoArray6 {
	void init() {
		int is[][] = {{1,2},{3,4},{5,6}};
		int x = 0;
		while(x<is.length) {
			int y = 0;
			while(y<is[x].length) {
				System.out.println("is["+x+"]["+y+"]="+is[x][y]);
				y = y+1;
			}//////////////////end of inner while
			x = x+1;
		}//////////////////////end of outter while
	}
	public static void main(String[] args) {
		//앞에 있는 2는 ROW를 말함
		//3은 칼럼을 말함
		int is [][] = new int[2][3];
		for(int i=0;i<is.length; i++) {
			for(int j=0; j<is[i].length;j++) {
				System.out.println("is["+i+"]["+j+"]="+is[i][j]);
			}////////////////end of Inner
		}//////
		//////////////end of outter for
	}

}
