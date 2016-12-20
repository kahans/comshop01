package net.user.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.user.action.DBConnect;





public class UserDao {
	Connection connection;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//회원 리스트 메서드
	public List<User> searchMember() throws Exception{
		List<User> userList = new ArrayList<User>();
		
		try{
			DBConnect db = new DBConnect();
			connection = db.driverDbcon();
			pstmt = connection.prepareStatement("select * from membertb");
			rs = pstmt.executeQuery();
			while(rs.next()){
				User user= new User();
				user.setUSERID(rs.getString("USER_ID"));
				user.setUSERNAME(rs.getString("USER_NAME"));
				user.setUSERLEVEL(rs.getString("USER_LEVEL"));
				user.setUSERADDR(rs.getString("USER_ADDR"));
				user.setUSEREMAIL(rs.getString("USER_EMAIL"));
				user.setUSERHP(rs.getString("USER_HP"));
				user.setUSERPOINT(rs.getInt("USER_POINT"));
				userList.add(user);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(connection!=null) try{connection.close();}catch(SQLException ex){}
		}
		return userList;
		
			
	}
	
	//user login메서드
	public int loginAdmin(User user) throws Exception{
		int result = -1;		
		try{
			DBConnect db= new DBConnect();
			connection = db.driverDbcon();
			pstmt=connection.prepareStatement("SELECT * FROM membertb WHERE user_id=?");
			pstmt.setString(1, user.getUSERID());
			rs=pstmt.executeQuery();
			if(rs.next()){
				if(rs.getString("User_PW").equals(user.getUSERPW())){
					if(rs.getString("User_LEVEL").equals(user.getUSERLEVEL())){
						result =1;
						System.out.println("아이디 비번 권한까지 맞음");
					}else{
						result =-2;
						System.out.println("권한이 틀림");
					}					
				}else{
					result =0;
					System.out.println("비번이 틀림");
				}
			}else{
				result =-1;
				System.out.println("아이디 틀림");
			}			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(connection!=null)connection.close();
			}catch(Exception ex) {}
		}
		
		return result;		
	}
	
	//user 회원등록
	public boolean JoinUser(User user) throws Exception{
		boolean result=false;
		try{	
			DBConnect db= new DBConnect();
			connection = db.driverDbcon();
			pstmt= connection.prepareStatement("INSERT INTO membertb(user_id,user_pw,user_name,user_level,user_addr,user_hp,user_email,user_point)"
					+ " VALUES(?,?,?,?,?,?,?,?,?)");
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
				if(connection!=null)connection.close();
			}catch(Exception ex) {}
		}
		return result;
		
	}
}
