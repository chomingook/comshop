package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
// - ������ �� ���� ó��
@SuppressWarnings("serial")
@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection) sc.getAttribute("conn");   
			MemberDao memberDao =new MemberDao();
			memberDao.setConnection(conn);
			
			int no = Integer.parseInt(request.getParameter("no"));
			System.out.println(no+"�ۺ��� ��ȣ�� �޾� �Գ�?");
			Member member=memberDao.selectOne(no);
			
			request.setAttribute("member", member);			
			RequestDispatcher rd = request.getRequestDispatcher(
					"/member/MemberUpdateForm.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
			
		} 
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
			String name=request.getParameter("name");
			int no = Integer.parseInt(request.getParameter("no"));
			member.setEmail(email);
			member.setNo(no);
			member.setName(name);
			//member ������ �ּҰ� �����Ϳ����� set�Ͽ� memberDao�� ȣ���Ѵ�.
			memberDao.update(member);
			
			response.sendRedirect("list");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
			
		} 
	}
}
