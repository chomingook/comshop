package net.admin.goods.db;

import net.user.db.User;

public class GoodsBean {

	private int 	GoodsNo;		//��ǰ�ѹ� 1
	private String	GoodsID;		//��ǰ�ڵ�(��ȣ)
	private String 	Id;				//�Ǹ��� ���̵�
	private String 	GoodsName;		//��ǰ�̸� 1
	private String 	Category;		//ī�װ� 1
	private int 	Price;			//����
	private int 	Quantity;		//���� 1
	private String 	Manufacturer;	//������ 1
	private String 	Release;		//����� 1
	public int getGoodsNo() {
		return GoodsNo;
	}
	public void setGoodsNo(int goodsNo) {
		GoodsNo = goodsNo;
	}
	public String getGoodsID() {
		return GoodsID;
	}
	public void setGoodsID(String goodsID) {
		GoodsID = goodsID;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getRelease() {
		return Release;
	}
	public void setRelease(String release) {
		Release = release;
	}
	
	
	
	
}
