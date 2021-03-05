package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ViewApp1_1 implements ActionListener{
	// 13, 14번 setSize 이전에 인스턴스화를 진행했다.
	JFrame jf = new JFrame();
	
	public ViewApp1_1() {
		initDisplay();
	}
	
	public void initDisplay() {
		// 선언부에서 JFrame을 활용하여 창을 열어주었다.
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		ViewApp1_1 vs = new ViewApp1_1();
		vs.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
