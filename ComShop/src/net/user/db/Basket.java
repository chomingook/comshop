package net.user.db;

public class Basket {
	private int 	no;			//��ٱ��� �ڵ�
	private User	id;			//������ ���̵�
	private Goods	goodsNo;	//��ǰ ��ȣ
	private Goods	category;	//��ǰī�װ�	
	private Goods	price;		//����
	private String	gCode;		//��ǰ�ֹ��ڵ�
	private int		quantity;	//����
	private int		goodsSum;	//�հ�
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
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
	 * @return the goodsNo
	 */
	public Goods getGoodsNo() {
		return goodsNo;
	}
	/**
	 * @param goodsNo the goodsNo to set
	 */
	public void setGoodsNo(Goods goodsNo) {
		this.goodsNo = goodsNo;
	}
	/**
	 * @return the category
	 */
	public Goods getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Goods category) {
		this.category = category;
	}
	/**
	 * @return the gCode
	 */
	public String getgCode() {
		return gCode;
	}
	/**
	 * @param gCode the gCode to set
	 */
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	/**
	 * @return the price
	 */
	public Goods getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Goods price) {
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
	 * @return the goodsSum
	 */
	public int getGoodsSum() {
		return goodsSum;
	}
	/**
	 * @param goodsSum the goodsSum to set
	 */
	public void setGoodsSum(int goodsSum) {
		this.goodsSum = goodsSum;
	}
}
