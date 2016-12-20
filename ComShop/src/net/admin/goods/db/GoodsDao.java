package net.admin.goods.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.user.action.DBConnect;

public class GoodsDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//상품 입력
	public int gInsert(GoodsBean g) throws SQLException{
		System.out.println("01 입력처리메서드 선언 gdao.java");
		int result = 0;
		DBConnect db= new DBConnect();
		
		try{
			conn = db.driverDbcon();
			pstmt = conn.prepareStatement("insert into goodtb(GO_ID,USER_ID,GO_NAME,GO_CATEGORY,GO_PRICE,GO_QUANTITY,GO_MANUFACTURER,GO_RELEASE)" 
											+"values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, g.getGoodsID());
			pstmt.setString(2, g.getId());
			pstmt.setString(3, g.getGoodsName());
			pstmt.setString(4, g.getCategory());
			pstmt.setInt(5, g.getPrice());
			pstmt.setInt(6, g.getQuantity());
			pstmt.setString(7, g.getManufacturer());
			pstmt.setString(8, g.getRelease());
			
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			
		}
		return result;
		
	}
	
	}
	



