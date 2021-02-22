package com.quiz0222;
import com.google.gson.Gson;
import com.vo.Member80VO;
public class MemberList {

	public static void main(String[] args) {
		Member80VO mvo = new Member80VO();
		mvo.setMem_id("apple");
		mvo.setMem_pw("123");
		mvo.setGender(true);
		// 지역변수는 초기화 해야하며, 전역변수는 생략이 가능하다.
		mvo = new Member80VO("tomato","123",true);
		Gson gson = new Gson();
		String imsi = gson.toJson(mvo);
		System.out.println(imsi);
		
	}

}
