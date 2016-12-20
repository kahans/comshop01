package net.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.db.User;
import net.user.db.UserDao;

public class UserJoinAction implements UserAction {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//�ѱ�ó���� ���� ���ڵ��� euc-kr�� �����Ѵ�.
		request.setCharacterEncoding("euc-kr");
		
		//ActionForwardŬ������ forward ��ü���������� ���� ������ �޼��� ActionForward�� ��ü(�ν��Ͻ�)�� �����Ѵ�.
		ActionForward forward= new ActionForward();
		//UserBeanŬ������ user ��ü���������� ���� ������ �޼��� UserBean�� ��ü�� �����Ѵ�.
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
			System.out.println("ȸ������ ����");
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("./main.us");
		
		return forward;
	}
}
