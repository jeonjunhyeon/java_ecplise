package com.oracle;

public class CoronaVO {

	private int 		serial_num		    = 0;    // 코드넘버
	private String 		confirmation_date   = null; // 확인날짜
	private String 		loc  				= null; // 지역
	private String 		Infected_loc 		= null; // 감염지역
	
	public CoronaVO() {}
	public CoronaVO(int serial_num, String confirmation_date,
			String loc, String Infected_loc ) {
		this.serial_num 		= serial_num;
		this.confirmation_date 	= confirmation_date;
		this.loc 				= loc;
		this.Infected_loc 		= Infected_loc;
	}
	
	// getter, setter 자리
	public int getSerial_num() {
		return serial_num;
	}
	public void setSerial_num(int serial_num) {
		this.serial_num = serial_num;
	}
	public String getConfirmation_date() {
		return confirmation_date;
	}
	public void setConfirmation_date(String confirmation_date) {
		this.confirmation_date = confirmation_date;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getInfected_loc() {
		return Infected_loc;
	}
	public void setInfected_loc(String infected_loc) {
		this.Infected_loc = infected_loc;
	}
	
}