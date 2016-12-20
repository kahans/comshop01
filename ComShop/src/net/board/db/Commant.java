package net.board.db;

public class Commant {
	private int 	cNo;			//댓글 번호
	private String	cContent;	//댓글 내용
	private String	cName;		//댓글 글쓴이
	private	String	cDate;		//작성일
	/**
	 * @return the cNo
	 */
	public int getcNo() {
		return cNo;
	}
	/**
	 * @param cNo the cNo to set
	 */
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	/**
	 * @return the cContent
	 */
	public String getcContent() {
		return cContent;
	}
	/**
	 * @param cContent the cContent to set
	 */
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cDate
	 */
	public String getcDate() {
		return cDate;
	}
	/**
	 * @param cDate the cDate to set
	 */
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

}
