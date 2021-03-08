package com.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BaseBallGameEvent1 implements ActionListener {
	BaseBallGameView1 bbgView1 = null;
	BaseBallGameLogic1 bbgLogic1 = null;
	
	public BaseBallGameEvent1(BaseBallGameView1 baseBallGameView1) {
		this.bbgView1 = bbgView1;
	}

	public BaseBallGameEvent1(BaseBallGameView1 baseBallGameView1, BaseBallGameLogic1 bbgLogic1) {
		this.bbgView1 = bbgView1;
		this.bbgLogic1 = bbgLogic1;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		// 라벨값으로 처리하고 싶으면
		String label = ae.getActionCommand(); //새게임,지우기
		System.out.println("event label:"+label);
		if(obj == bbgView1.jtf_input){
			String input =  bbgView1.jtf_input.getText().trim();
			
			//만일 숫자가 아닌 값이 있을 때도 고려해야 한다.
			try {
				Integer.parseInt(input);//356			
			} catch (NumberFormatException nfe) {
				bbgView1.jop.showMessageDialog( bbgView1.jf, "숫자만 입력하세요", "Error", JOptionPane.ERROR_MESSAGE);
				bbgView1.jtf_input.setText("");
				bbgView1.jtf_input.requestFocus();				
				return ;
			}
			
			if(input.length()!=3){
				return;
			}
			else{
				bbgView1.jta_display.append(++bbgLogic1.cnt+"."+ bbgView1.jtf_input.getText()+":"+bbgLogic1.call(input)+"\n");
				bbgView1.jtf_input.setText("");
			}
		}
		else if("지우기".equals(label)){
			bbgView1.jta_display.setText("");
			bbgView1.jtf_input.requestFocus();
		}
		else if("종료".equals(label)){
			System.exit(0);// 자바 가상머신과의 연결고리를 끊는다.
		}
		else if(obj ==  bbgView1.jmi_dap){
			bbgView1.jta_display.append("정답은 "+ bbgLogic1.com[0]+ bbgLogic1.com[1]+ bbgLogic1.com[2]+"\n");
			bbgLogic1.nanSu();
		}
		else if(obj ==  bbgView1.jbtns[1]){
			bbgView1.jta_display.append("정답은 "+ bbgLogic1.com[0]+ bbgLogic1.com[1]+ bbgLogic1.com[2]+"\n");
			bbgLogic1.nanSu();
		}
		//새게임
		else if(obj ==  bbgView1.jbtns[0]){
			bbgLogic1.cnt = 0;
			bbgLogic1.nanSu();
			 bbgView1.jta_display.setText("");
			 bbgView1.jtf_input.setText("");
			 bbgView1.jtf_input.requestFocus();
		}
		
	}
		
}
