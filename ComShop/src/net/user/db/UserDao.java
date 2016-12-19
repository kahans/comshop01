package net.user.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.user.action.DBConnect;





public class UserDao {
	Connection connection;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//user login
	public int loginAdmin(User user) throws Exception{
		int result = -1;
		DBConnect db= new DBConnect();
		try{
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
	
	//user 회원리스트
	public boolean JoinUser(User user) throws Exception{
		boolean result=false;
		try{	
			pstmt= connection.prepareStatement("INSERT INTO membertb VALUES(?,?,?,?,?,?,?,?)");
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
