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
						rs.getString(user.getUSERNAME());
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
				if(connection!=null)connection.close();
			}catch(Exception ex) {}
		}
		
		return result;		
	}
	
	//user ȸ������Ʈ
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
