package ch5.oracle;
/*
 * 이거 지켜보는 것보다 인스턴스화, 오버로딩 등을 더 많이 볼 것.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.util.DBConnectionMgr;

public class NoProcEmpUpdate1 extends JFrame {
	
	Connection 		  con1  	= null;
	Connection 		  con2  	= null;
	Connection 		  con3  	= null;
	PreparedStatement pstm1 	= null;
	PreparedStatement pstm2 	= null;
	PreparedStatement pstm3 	= null;
	ResultSet 		  rs1   	= null;
	ResultSet 		  rs2   	= null;
	String 			  sql1  	= "";
	String 			  sql2  	= "";
	String 			  sql3  	= "";
	DBConnectionMgr   dbMgr 	= null;
	
	public void salUpdate(int p_empno) {
		String r_ename   = null;
		double r_sal     = 0.0;
		double r_avg_sal = 0.0;
		double v_rate 	 = 0.0;
		int    result    = 0; //0이면 수정실패, 1이면 수정 성공
		sql1+="SELECT ename, sal";
		sql1+="  FROM emp";
		sql1+=" WHERE empno = ?";
		sql2+="SELECT avg(sal) sal FROM emp";
		sql2+=" WHERE deptno = (SELECT deptno FROM emp WHERE empno =?)";
		//sql2+=" WHERE deptno = (SELECT deptno FROM emp WHERE empno ="+p_empno+")";
		sql3+="UPDATE emp Set sal = ? WHERE empno =?";
		//sql3+="UPDATE emp Set sal = ? WHERE empno =" +p_empno;
		// 물음표로 치환하는게 더 효율적/동적이다. (32 > 33, 34 > 35)
		dbMgr = DBConnectionMgr.getInstance();
		try {
			con1 = dbMgr.getConnection();
			pstm1 = con1.prepareStatement(sql1);
			pstm1.setInt(1, p_empno);
			rs1 = pstm1.executeQuery();
			rs1.next();
			r_ename = rs1.getString("ename");
			r_sal   = rs1.getDouble("sal");
			System.out.println("입력받은 사원의 " + r_ename + ", 급여"+ r_sal);
			dbMgr.freeConnection(con1, pstm1, rs1);
			
			con2 = dbMgr.getConnection();
			pstm2 = con1.prepareStatement(sql2);
			pstm2.setInt(1, p_empno);
			rs2 = pstm2.executeQuery();
			rs2.next();
			r_avg_sal = rs2.getDouble("sal");
			System.out.println("부서의 평균 급여는 " +r_avg_sal);
			if(r_sal>r_avg_sal) {
				v_rate = 1.1;
			}
			else {
				v_rate = 1.2;
			}
			con3 = dbMgr.getConnection();
			pstm3 = con1.prepareStatement(sql3);
			pstm3.setDouble(1, r_sal*v_rate);
			pstm3.setInt(2, p_empno);
			result = pstm3.executeUpdate();
			System.out.println("result: "+result);
			if(result == 1) {
				JOptionPane.showMessageDialog(this, "수정이 되었습니다.");
			}
			else {
				JOptionPane.showMessageDialog(this, "실패하였습니다.");
			}
			
		} catch(SQLException se) {
			System.out.println("[[sql1]] " + sql1);
		}
		 catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		NoProcEmpUpdate1 neu1 = new NoProcEmpUpdate1();
		String user_input = JOptionPane.showInputDialog("사원번호를 입력하세요");
		int empno = 0;
		if(user_input != null || user_input.length()>1) {
			empno = Integer.parseInt(user_input);
		}
		neu1.salUpdate(empno);

	}

}
