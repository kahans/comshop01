package net.user.db;

import java.util.Date;

public class Goods {
	private int 	goodsNo;		//상품코드(번호)
	private User 	id;				//판매자 아이디
	private String 	GoodsName;		//상품이름
	private String 	category;		//카테고리
	private int 	price;			//가격
	private int 	quantity;		//수량
	private String 	manufacturer;	//제조사
	private Date 	release;		//출시일
	/**
	 * @return the no
	 */
	public int getGoodsNo() {
		return goodsNo;
	}
	/**
	 * @param no the no to set
	 */
	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}
	/**
	 * @return the id
	 */
	public User getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(User id) {
		this.id = id;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the release
	 */
	public Date getRelease() {
		return release;
	}
	/**
	 * @param release the release to set
	 */
	public void setRelease(Date release) {
		this.release = release;
	}
}
