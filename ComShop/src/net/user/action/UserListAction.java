package net.user.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.db.User;
import net.user.db.UserDao;

public class UserListAction implements UserAction{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserDao uDao = new UserDao();
		List<User> UserList = new ArrayList<User>();
		
		UserList = uDao.searchMember();
		
		request.setAttribute("UserList", UserList);
		System.out.println("리스트 작동");
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./user_list.jsp");
		return forward;
	}

}
