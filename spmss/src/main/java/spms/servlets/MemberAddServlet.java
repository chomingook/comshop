package spms.servlets;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.MemberDao;
import spms.vo.Member;

// JSP ����
// - �Է��� �� ���� ó�� 
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(
				"/member/MemberForm.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		try {
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection) sc.getAttribute("conn");  
			
			MemberDao memberDao = new MemberDao();
			
			memberDao.setConnection(conn);
			Member member=new Member();
			//MemberForm.jsp���� ���� input�±� name�� ���� �޾� �´�.			
			String email=request.getParameter("email");
			String pw=request.getParameter("password");
			String name=request.getParameter("name");
			
			member.setEmail(email);
			member.setPassword(pw);
			member.setName(name);
			//member ������ �ּҰ� �����Ϳ����� set�Ͽ� memberDao�� ȣ���Ѵ�.
			memberDao.insert(member);
			
			response.sendRedirect("list");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
			
		}
	}
}
