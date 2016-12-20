package net.admin.goods.db;

import java.util.Date;

import net.user.db.User;

public class GoodsBean {

	private int 	goodsNo;		//상품넘버
	private String	goodsID;		//상품코드(번호)
	private User 	id;				//판매자 아이디
	private String 	GoodsName;		//상품이름
	private String 	category;		//카테고리
	private int 	price;			//가격
	private int 	quantity;		//수량
	private String 	manufacturer;	//제조사
	private Date 	release;		//출시일
	
	
	public int getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public User getId() {
		return id;
	}
	public void setId(User id) {
		this.id = id;
	}
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getRelease() {
		return release;
	}
	public void setRelease(Date release) {
		this.release = release;
	}
	
	
}
