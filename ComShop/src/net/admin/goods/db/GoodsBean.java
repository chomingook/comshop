package net.admin.goods.db;

import java.util.Date;

import net.user.db.User;

public class GoodsBean {

	private int 	goodsNo;		//��ǰ�ѹ�
	private String	goodsID;		//��ǰ�ڵ�(��ȣ)
	private User 	id;				//�Ǹ��� ���̵�
	private String 	GoodsName;		//��ǰ�̸�
	private String 	category;		//ī�װ�
	private int 	price;			//����
	private int 	quantity;		//����
	private String 	manufacturer;	//������
	private Date 	release;		//�����
	
	
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
