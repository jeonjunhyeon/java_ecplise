package variable.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginView2 extends JFrame implements ActionListener {// 인터페이스이며, 결합도를 낮추는 코드를 작성할 때 필요함 - 클래스 설계 시에 필요함, 복습할 필요가 없는 이유는 요즘 웹기반으로 처리를 하니까
	// 얘는 java.lang에 있는 package가 아니므로 별도로 import 해야한다.
	JFrame jf = new JFrame(); 
	JButton jbtn_login = new JButton("로그인");
	//화면 그리기 구현
	public void initDisplya(){
		// 내 자신이 이벤트 처리를 담당하는 핸들러 클래스이다. 라는 의미로 this를 사용하기도 한다.
		//jbtn_login.addActionListener(this); //이벤트 소스와 이벤트 처리를 담당하는 클래스를 연결하고 매칭한다. - 콜백함수가 호출된다.
		this.setTitle("네이버 로그인");
		this.add("North", jbtn_login);
		this.setSize(500,400);
		this.setVisible(true);//true이면 화면에 보여줄게, false이면 비활성화해줄게
	}
	//내 안에 있는 메소드이지만 static영역 안에서 non-static을 접근할 수 없으므로 인스턴스화를 통해 해결할 수 있음.
	public static void main(String[] args) {
		LoginView view = new LoginView();
		view.initDisplya();
	}
	
	// 같은 이름의 메소드를 여러개 정의할 수 있다. - 뒷받침하는 개념이 메소드 오버로딩과 오버라이딩(메소드 이름이 같고 서로 상속관계일 때)이다.(2가지)
	// @ 붙은 것은 어노테이션이다. 이것을 바꾼다면 빨간줄이 나타남 대신 @Override를 없애면 사용자메소드로 변경된다.
	// 많이 쓰는 예약어이다.
	@Override
	public void actionPerformed(ActionEvent e) { //콜백메소드라고 함. 내가 호출하는 메소드가 아니라 이벤트 감지가 일어나면 자동 호출됨.
		//로그인 버튼을 누른거야?
		if(jbtn_login == e.getSource()) { //이벤트 감지는 컴터가 하고 버튼의 주번은 내가 정의 함. 주소번지가 같니?
			System.out.println("이순신 님 환영합니다.");
		}
	}

}
