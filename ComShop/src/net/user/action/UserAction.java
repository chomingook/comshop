package net.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserAction {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
