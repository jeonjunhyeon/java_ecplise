package book.ch4;

import javax.swing.JOptionPane;

public class HanJum {

	public static void main(String[] args) {
		String s_jumsu = JOptionPane.showInputDialog("점수를 입력해주세요.");
		int    i_jumsu = Integer.parseInt(s_jumsu);
		System.out.println("당신이 입력한 점수는 "+s_jumsu+"점 입니다.");
		//System.out.printf("당신이 입력한 점수는 %s %n 입니다.",s_jumsu);
		
		switch(i_jumsu/10) {
			case 9: case 10:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
		}////////////// end of switch문
//		if(i_jumsu/10>=9) {
//			System.out.println("A학점");
//		}
//		else if(i_jumsu/10>=8) {
//			System.out.println("B학점");
//		}
//		else if(i_jumsu/10>=7) {
//			System.out.println("C학점");
//		}
//		else if(i_jumsu/10>=6) {
//			System.out.println("D학점");
//		}
//		else {
//			System.out.println("F학점");
//		}
	}

}
