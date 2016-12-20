package net.admin.goods.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.admin.goods.db.GoodsBean;
import net.admin.goods.db.GoodsDao;
import net.admin.goods.interf.ActionInterFace;

public class AdminGoodsProAction implements ActionInterFace {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("01 execute AdminGoodsProAction.java");
		
		GoodsBean g = new GoodsBean();
		g.setGoodsName(request.getParameter("GO_NAME"));
		g.setCategory(request.getParameter("GO_CATEGORY"));
		g.setPrice(Integer.parseInt(request.getParameter("GO_PRICE")));
		g.setGoodsName(request.getParameter("User_name"));
		g.setQuantity(Integer.parseInt(request.getParameter("GO_QUANTITY")));
		g.setManufacturer(request.getParameter("GO_MANUFACTURER"));
		g.setRelease(request.getParameter("GO_RELEASE"));
		
		GoodsDao gDao = new GoodsDao();
		int result2 = gDao.gInsert(g);
		if(result2 !=1){
			System.out.println("+++ 입력처리 불가 +++");
		}
		ActionForward mforward = new ActionForward();
		mforward.setRedirect(true);
		mforward.setPath(request.getContextPath() + "/admingoods/admin_goods_list.go");
		
		return mforward;
	}

}
