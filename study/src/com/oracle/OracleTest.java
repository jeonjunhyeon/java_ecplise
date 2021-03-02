package com.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {
	
	//선언부
	
	static final 	  String _DRIVER  = "oracle.jdbc.driver.OracleDriver";
	static final 	  String _URL 	  = "jdbc:oracle:thin:@192.168.35.2:1521:orcl11";
	String 		 	  _USER 		  = "junhyeon";
	String 		 	  _PW 			  = "wnsgus";
	Connection 	 	  con 			  = null;
	PreparedStatement pstmt 		  = null;
	ResultSet 		  rs 			  = null;
	
	// 생성부
	
	public OracleTest() {
		String sql = "SELECT * FROM corona";
		try {
			Class.forName(OracleTest._DRIVER);
			con 		 = DriverManager.getConnection(_URL, _USER, _PW);
			pstmt 		 = con.prepareStatement(sql);
			rs 			 = pstmt.executeQuery();
			CoronaVO cVO = null;
			rs.next();
			
			while(rs.next()) {
				cVO = new CoronaVO();
				cVO.setSerial_num(rs.getInt("serial_num"));
				cVO.setConfirmation_date(rs.getNString("confirmation_date"));
				cVO.setLoc(rs.getNString("loc"));
				cVO.setInfected_loc(rs.getNString("Infected_loc"));
				System.out.println(cVO.getSerial_num()+" , "+cVO.getConfirmation_date()+" , "
									+cVO.getLoc()+" , "+cVO.getInfected_loc());
			}
		}
		catch(ClassNotFoundException ce) {
			System.out.println("드라이버 클래스 로딩 실패");
			return;
		}
		  
		catch(SQLException se) {
			  System.out.println("SQLException :" + se.getMessage());
		  }
		System.out.println("Here");
	}
	
	// 오라클 서버 접속
	
	public static void main(String[] args) {
		OracleTest ot = new OracleTest(); 

	}

}
