package net.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.db.User;
import net.user.db.UserDao;

public class UserJoinAction implements UserAction {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리를 인해 인코딩을 euc-kr로 설정한다.
		request.setCharacterEncoding("euc-kr");
		
		//ActionForward클래스에 forward 객체참조변수를 선언 생성자 메서드 ActionForward를 객체(인스턴스)를 생성한다.
		ActionForward forward= new ActionForward();
		//UserBean클래스에 user 객체참조변수를 선언 생성자 메서드 UserBean를 객체를 생성한다.
		User user= new User();
		UserDao uDao= new UserDao();
		boolean result = false;
		
		
		user.setUSERID(request.getParameter("User_ID"));
		user.setUSERPW(request.getParameter("User_PW"));
		user.setUSERNAME(request.getParameter("User_NAME"));
		user.setUSERLEVEL(request.getParameter("User_LEVEL"));
		user.setUSERADDR(request.getParameter("User_ADDR"));
		user.setUSERHP(request.getParameter("User_HP"));
		user.setUSEREMAIL(request.getParameter("User_EMAIL"));
		user.setUSERPOINT(Integer.parseInt(request.getParameter("User_POINT")));
		
		result = uDao.JoinUser(user);
		
		if(result==false){
			System.out.println("회원가입 실패");
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("./UserLogin.us");
		
		return forward;
	}
}
