package net.admin.goods.interf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.admin.goods.action.ActionForward;

public interface ActionInterFace {

	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
