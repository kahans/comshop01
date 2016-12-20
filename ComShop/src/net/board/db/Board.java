package net.board.db;

public class Board {
	private int 	bNo;			//글번호
	private String 	bTitle;		//제목
	private String 	bContent;	//내용
	private String 	bName;		//글쓴이
	private String 	bDate;		//작성일
	private	int 	bCheck;		//조회수
	/**
	 * @return the bNo
	 */
	public int getbNo() {
		return bNo;
	}
	/**
	 * @param bNo the bNo to set
	 */
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	/**
	 * @return the bTitle
	 */
	public String getbTitle() {
		return bTitle;
	}
	/**
	 * @param bTitle the bTitle to set
	 */
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	/**
	 * @return the bContent
	 */
	public String getbContent() {
		return bContent;
	}
	/**
	 * @param bContent the bContent to set
	 */
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}
	/**
	 * @param bName the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}
	/**
	 * @return the bDate
	 */
	public String getbDate() {
		return bDate;
	}
	/**
	 * @param bDate the bDate to set
	 */
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	/**
	 * @return the bCheck
	 */
	public int getbCheck() {
		return bCheck;
	}
	/**
	 * @param bCheck the bCheck to set
	 */
	public void setbCheck(int bCheck) {
		this.bCheck = bCheck;
	}
}
