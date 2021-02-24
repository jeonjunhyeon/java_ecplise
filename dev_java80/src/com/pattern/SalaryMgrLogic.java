package com.pattern;

import java.util.Vector;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgrLogic {
	SalaryMgrView smView = null;
	public SalaryMgrLogic(SalaryMgrView salaryMgrView) {
		this.smView = salaryMgrView;
	}

	public void getEmpDetail(int pmepno) {
		EmpVO  eVO = new EmpVO();
		eVO.setEname("김유신");
		DeptVO dVO = new DeptVO();
		dVO.setDname("형상관리팀");
		eVO.setdVO(dVO); // 이 전체적인 코드에서 가장 중요한 부분이다.
		//java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다 함
		//연관있는 레코드를 한번에 밀어넣기 위하여 사용.
		Vector oneRow = new Vector();
		oneRow.addElement(eVO.getEname());
		oneRow.addElement(eVO.getdVO().getDname());
		smView.dtm_sal.addRow(oneRow);
		}////////////////// end of getEmpDetail
	}
