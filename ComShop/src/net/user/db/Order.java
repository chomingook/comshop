package net.user.db;

import java.util.Date;

public class Order {
	private int 	orderCode;	//�ֹ��ڵ�
	private User 	UserId;		//�����ھ��̵�
	private Goods 	goodsNo;	//��ǰ�ڵ�
	private Goods 	category;	//��ǰī�װ�
	private Goods 	price;		//��ǰ����
	private Basket	gCode;		//�ֹ��׷��ڵ�
	private Basket	quantity;	//�ֹ���
	private Basket	goodsSum;	//�ֹ� �Ҿ�
	private int 	point;		//����� ����Ʈ
	private String	orderWay;	//�ֹ� ���(������)
	private String	bankSelect;	//����(ī���)����
	private Date 	signDate;	//������
	private int 	sumPoint;	//��������Ʈ (���� ����Ʈ)
	private String	signstate;	//�������
	}
