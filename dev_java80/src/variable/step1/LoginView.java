package variable.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginView extends Object implements ActionListener {// 인터페이스이며, 결합도를 낮추는 코드를 작성할 때 필요함 - 클래스 설계 시에 필요함, 복습할 필요가 없는 이유는 요즘 웹기반으로 처리를 하니까
	// 얘는 java.lang에 있는 package가 아니므로 별도로 import 해야한다.
	JFrame jf = new JFrame(); 
	JButton jbtn_login = new JButton("로그인");
	//화면 그리기 구현
	public void initDisplya(){
		// 내 자신이 이벤트 처리를 담당하는 핸들러 클래스이다. 라는 의미로 this를 사용하기도 한다.
		jbtn_login.addActionListener(this); //이벤트 소스와 이벤트 처리를 담당하는 클래스를 연결하고 매칭한다.
		jf.add("North", jbtn_login);
		jf.setSize(500,400);
		jf.setVisible(true);//true이면 화면에 보여줄게, false이면 비활성화해줄게
	}
	//내 안에 있는 메소드이지만 static영역 안에서 non-static을 접근할 수 없으므로 인스턴스화를 통해 해결할 수 있음.
	public static void main(String[] args) {
		LoginView view = new LoginView();
		view.initDisplya();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//로그인 버튼을 누른거야?
		if(jbtn_login == e.getSource()) { //이벤트 감지는 컴터가 하고 버튼의 주번은 내가 정의 함. 주소번지가 같니?
			System.out.println("이순신 님 환영합니다.");
		}
	}

}
