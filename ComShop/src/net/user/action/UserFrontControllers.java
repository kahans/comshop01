package net.user.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserFrontControllers
 */
@WebServlet("/UserFrontControllers")
public class UserFrontControllers extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI UserFrontController.java");
		System.out.println(contextPath + "<-- contextPath UserFrontController.java");
		System.out.println(command + "<-- command UserFrontController.java");
		System.out.println("----UserFrontController.java ----- ");
		System.out.println();
		ActionForward forward = null;
		UserAction action = null;

		if (command.equals("/user/UserLogin.us")) {//�α��� ���
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./user_login.jsp");
		} else if (command.equals("/user/UserJoin.us")) {//ȸ������  ���
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./user_join.jsp");
		} else if(command.equals("/user/main.us")){//����ȭ�� ���
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./main.jsp");
		} else if(command.equals("/user/UserListAction.us")){
			action = new UserListAction();
			try{
				forward = action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		} else if (command.equals("/user/UserJoinAction.us")) {//ȸ������ �׼� ���
			
			action = new UserJoinAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/user/UserLoginAction.us")) {//�α��� �׼� ���
			action = new UserLoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
