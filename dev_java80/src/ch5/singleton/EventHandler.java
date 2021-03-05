package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	ViewApp1_2 viewApp1_2 = null;
	public EventHandler(ViewApp1_2 viewApp1_2) {
		this.viewApp1_2 = viewApp1_2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp1_2.jbtn) { //NullPointerException
			System.out.println("전송버튼 호출 성공");
		}
	}

}
