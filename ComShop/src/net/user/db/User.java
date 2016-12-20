package net.user.db;

public class User {
	private int			No;	
	private String		USERID;		//아이디
	private String		USERPW;		//비밀번호
	private String		USERNAME;	//이름
	private String		USERLEVEL;	//권한
	private String		USERADDR;	//주소
	private String		USERHP;		//전화번호
	private String		USEREMAIL;	//이메일
	private Integer		USERPOINT;	//포인트
	/**
	 * @return the no
	 */
	public int getNo() {
		return No;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		No = no;
	}
	/**
	 * @return the uSERID
	 */
	public String getUSERID() {
		return USERID;
	}
	/**
	 * @param uSERID the uSERID to set
	 */
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	/**
	 * @return the uSERPW
	 */
	public String getUSERPW() {
		return USERPW;
	}
	/**
	 * @param uSERPW the uSERPW to set
	 */
	public void setUSERPW(String uSERPW) {
		USERPW = uSERPW;
	}
	/**
	 * @return the uSERNAME
	 */
	public String getUSERNAME() {
		return USERNAME;
	}
	/**
	 * @param uSERNAME the uSERNAME to set
	 */
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	/**
	 * @return the uSERLEVEL
	 */
	public String getUSERLEVEL() {
		return USERLEVEL;
	}
	/**
	 * @param uSERLEVEL the uSERLEVEL to set
	 */
	public void setUSERLEVEL(String uSERLEVEL) {
		USERLEVEL = uSERLEVEL;
	}
	/**
	 * @return the uSERADDR
	 */
	public String getUSERADDR() {
		return USERADDR;
	}
	/**
	 * @param uSERADDR the uSERADDR to set
	 */
	public void setUSERADDR(String uSERADDR) {
		USERADDR = uSERADDR;
	}
	/**
	 * @return the uSERHP
	 */
	public String getUSERHP() {
		return USERHP;
	}
	/**
	 * @param uSERHP the uSERHP to set
	 */
	public void setUSERHP(String uSERHP) {
		USERHP = uSERHP;
	}
	/**
	 * @return the uSEREMAIL
	 */
	public String getUSEREMAIL() {
		return USEREMAIL;
	}
	/**
	 * @param uSEREMAIL the uSEREMAIL to set
	 */
	public void setUSEREMAIL(String uSEREMAIL) {
		USEREMAIL = uSEREMAIL;
	}
	/**
	 * @return the uSERPOINT
	 */
	public Integer getUSERPOINT() {
		return USERPOINT;
	}
	/**
	 * @param string the uSERPOINT to set
	 */
	public void setUSERPOINT(Integer uSERPOINT) {
		USERPOINT = uSERPOINT;
	}
}
