package net.user.db;

import java.util.Date;

public class Order {
	private int 	orderCode;	//주문코드
	private User 	UserId;		//구매자아이디
	private Goods 	goodsNo;	//상품코드
	private Goods 	category;	//상품카테고리
	private Goods 	price;		//상품가격
	private Basket	gCode;		//주문그룹코드
	private Basket	quantity;	//주문량
	private Basket	goodsSum;	//주문 소액
	private int 	point;		//사용할 포인트
	private String	orderWay;	//주문 방법(결재방법)
	private String	bankSelect;	//은행(카드사)선택
	private Date 	signDate;	//결재일
	private int 	sumPoint;	//적립포인트 (전액 포인트)
	private String	signstate;	//결재상태
	}
