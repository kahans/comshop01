package net.user.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.user.action.ActionForward;
import net.user.db.User;
import net.user.db.UserDao;

public class UserLoginAction implements UserAction {

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		//�α����ϰ� ������ ���� �ϱ� ���� ������ ����
		request.setCharacterEncoding("euc-kr");
		HttpSession session = request.getSession();
		User user= new User();
		UserDao uDao= new UserDao();
		
		int result = -2;
		user.setUSERID(request.getParameter("User_ID"));
		user.setUSERPW(request.getParameter("User_PW"));
		user.setUSERLEVEL(request.getParameter("User_LEVEL"));
		System.out.println(request.getParameter("User_LEVEL")+" UserLoginAction.java");
		result = uDao.loginAdmin(user);
		
		if(result==0){
			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
	   		out.println("location.href='./UserLogin.us';");
	   		out.println("</script>");
	   		out.close();
	   		return null;
   		}else if(result==-1){
   			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('���̵� �������� �ʽ��ϴ�.');");
	   		out.println("location.href='./UserLogin.us';");
	   		out.println("</script>");
	   		out.close();
	   		return null;
	   	}else if(result==-2){
   			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('������ �ƴմϴ�..');");
	   		out.println("location.href='./UserLogin.us';");
	   		out.println("</script>");
	   		out.close();
	   		return null;
	   	}
   		
   		//�α��� ����
   		session.setAttribute("id", user.getUSERID());
   		session.setAttribute("level", user.getUSERLEVEL());
   		System.out.println(user.getUSERID()+"<--id �α��� ����");
   		System.out.println(user.getUSERLEVEL()+"<--level �α��μ���");
   		forward.setRedirect(true);
   		forward.setPath("./main.us");
   		return forward;
	
	}

}
