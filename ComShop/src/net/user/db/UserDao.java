package net.user.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class UserDao {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public UserDao(){
		try{
			Context init = new InitialContext();
			ds=(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			return;
		}
	}
	//user login
	public int loginAdmin(User user){
		String sql = "SELECT * FROM usertb WHERE user_id=?";
		int result = -1;
		
		try{
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUSERID());
			rs=pstmt.executeQuery();
			if(rs.next()){
				if(rs.getString("User_PW").equals(user.getUSERPW())){
					if(rs.getString("User_LEVEL").equals(user.getUSERLEVEL())){
						result =1;
						System.out.println("���̵� ��� ���ѱ��� ����");
					}else{
						result =-2;
						System.out.println("������ Ʋ��");
					}					
				}else{
					result =0;
					System.out.println("����� Ʋ��");
				}
			}else{
				result =-1;
				System.out.println("���̵� Ʋ��");
			}			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {}
		}
		
		return result;		
	}
	
	//user ȸ������Ʈ
	public boolean JoinUser(User user){
		String sql=null;
		boolean result=false;
		try{
			conn=ds.getConnection();
			sql="INSERT INTO usertb VALUES(?,?,?,?,?,?,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, user.getUSERID());
			pstmt.setString(2, user.getUSERPW());
			pstmt.setString(3, user.getUSERNAME());
			pstmt.setString(4, user.getUSERLEVEL());
			pstmt.setString(5, user.getUSERADDR());
			pstmt.setString(6, user.getUSERHP());
			pstmt.setString(7, user.getUSEREMAIL());
			pstmt.setInt(8, user.getUSERPOINT());
			pstmt.executeUpdate();
							
			result = true;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {}
		}
		return result;
		
	}
}
