package spms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import spms.vo.Member;

public class MemberDao {
	Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	//login �޼��� �ۼ�
	public Member exist(String email, String password) throws Exception{
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			stmt = connection.prepareStatement(
					"SELECT MNAME,EMAIL FROM MEMBERS"
					+ " WHERE EMAIL=? AND PWD=?");
			stmt.setString(1, email);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			Member member = new Member();
			if (rs.next()) {				
				member.setEmail(rs.getString("EMAIL"));
				member.setName(rs.getString("MNAME"));
				return member;
			}else{
				return null;
			}
			
		}catch(Exception e){
			throw e;
		}finally {
			try {if (rs != null) rs.close();} catch (Exception e) {}
			try {if (stmt != null) stmt.close();} catch (Exception e) {}
		}
		
	}
	//�ɹ� ���� update�޼��� �ۼ�
	public int update(Member member) throws Exception{
		PreparedStatement stmt = null;
		int rowCount = 0;
		try{
			stmt = connection.prepareStatement(
					"UPDATE MEMBERS SET EMAIL=?,MNAME=?,MOD_DATE=now()"
					+ " WHERE MNO=?");
			stmt.setString(1,member.getEmail());
			stmt.setString(2, member.getName());
			stmt.setInt(3, member.getNo());
			rowCount = stmt.executeUpdate();
		}catch(Exception e){
			throw e;
		}finally {
			try {if (stmt != null) stmt.close();} catch(Exception e) {}
			//try {if (conn != null) conn.close();} catch(Exception e) {}
		}
		return rowCount;
	}
	//�ɹ� �� �˻� selectOne�޼��� �ۼ�
	public Member selectOne(int no) throws Exception{
		Statement stmt = null;
		ResultSet rs = null;
		Member member=new Member();
		try{
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
				"SELECT MNO,EMAIL,MNAME,CRE_DATE FROM MEMBERS" + 
				" WHERE MNO=" + no);	
			if (rs.next()) {				 
					member
						.setNo(rs.getInt("MNO"))
						.setEmail(rs.getString("EMAIL"))
						.setName(rs.getString("MNAME"))
						.setCreatedDate(rs.getDate("CRE_DATE"));
				return member;
			} else {
				throw new Exception("�ش� ��ȣ�� ȸ���� ã�� �� �����ϴ�.");
			}
		}catch(Exception e){
			throw e;
		}finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) stmt.close();} catch(Exception e) {}
			//try {if (conn != null) conn.close();} catch(Exception e) {}
		}
		
		
	}
	
	//�ɹ� ���� Delete�޼��� �ۼ�
	public int delete(int no) throws Exception{
		Statement stmt = null;
		try{
			stmt = connection.createStatement();
			stmt.executeUpdate(
					"DELETE FROM MEMBERS WHERE MNO=" + 
					no);
		}catch(Exception e){
			throw e;
		}finally {
			try {if (stmt != null) stmt.close();} catch(Exception e) {}
			//try {if (conn != null) conn.close();} catch(Exception e) {}
		}
		
		return no;		
	}
	
	//�ɹ� ��� insert�޼��� �ۼ�
	public int insert(Member member) throws Exception{
		PreparedStatement stmt = null;
		int rowcount =0;
		
		try{
			stmt = connection.prepareStatement(
					"INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)"
					+ " VALUES (?,?,?,NOW(),NOW())");
			stmt.setString(1, member.getEmail());
			stmt.setString(2, member.getPassword());
			stmt.setString(3, member.getName());
			rowcount=stmt.executeUpdate();
			
			return rowcount;//void��� int�� ���ϵǴ� ������ �����ϱ�?	
		}catch(Exception e){
			throw e;
		}finally {
			try {if (stmt != null) stmt.close();} catch(Exception e) {}
			try {if (connection != null) connection.close();} catch(Exception e) {}
		}
			
	}
	
	//�ɹ� ����Ʈ selectList�޼��� �ۼ�
	public List<Member> selectList() throws Exception{
		Statement stmt = null;
		ResultSet rs = null;
		try{			
			stmt=connection.createStatement();		
			rs = stmt.executeQuery("SELECT MNO,MNAME,EMAIL,CRE_DATE" + 
					" FROM MEMBERS" +
					" ORDER BY MNO ASC");
			
			ArrayList<Member> members = new ArrayList<Member>();			
			// �����ͺ��̽����� ȸ�� ������ ������ Member�� ��´�.
			// �׸��� Member��ü�� ArrayList�� �߰��Ѵ�.
			while(rs.next()) {
				members.add(new Member()
							.setNo(rs.getInt("MNO"))
							.setName(rs.getString("MNAME"))
							.setEmail(rs.getString("EMAIL"))
							.setCreatedDate(rs.getDate("CRE_DATE"))	);
			}
			return members;
			
		}catch(Exception e){
			throw e;
		}finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) stmt.close();} catch(Exception e) {}
		}		
	}
}
