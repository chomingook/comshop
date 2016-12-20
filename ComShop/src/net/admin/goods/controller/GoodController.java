package net.admin.goods.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.admin.goods.action.ActionForward;
import net.admin.goods.action.AdminGoodsProAction;
import net.admin.goods.interf.ActionInterFace;

@WebServlet("/GoodController")
public class GoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GoodController() {
        super();
    }
    protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("03 doPro GoodController.java");
		request.setCharacterEncoding("euc-kr");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI MController.java");
		System.out.println(contextPath + "<-- contextPath MController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() MController.java");
		System.out.println(command + "<-- command MController.java");
		System.out.println("----------MController.java----------------");
		System.out.println();
		ActionForward mforward = null;
		ActionInterFace action = null;
		
		if(command.equals("/admingoods/admin_goods_write.go")){//상품 등록 폼
			System.out.println("01 조건문 /admingoods/admin_goods_write.go");
			mforward = new ActionForward();
			mforward.setRedirect(false);
			mforward.setPath("/admingoods/admin_goods_write.jsp");
		}else if(command.equals("/admingoods/admin_goods_pro.go")){//상품 리스트
			System.out.println("02 조건문 /admingoods/admin_goods_pro.go");
			action = new AdminGoodsProAction();
			try{
				mforward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/admingoods/admin_goods_list.go")){//상품등록 액션
			System.out.println("03 조건문 /admingoods/AdminGoodsProAction.go");
			action = new AdminGoodsProAction();
			try{
				mforward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doGet GoodController.java");
		doPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("02 doPost GoodController.java");
		doPro(request,response);
	}

}
