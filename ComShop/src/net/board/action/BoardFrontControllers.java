package net.board.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.action.ActionForward;

/**
 * Servlet implementation class BoardFrontControllers
 */
@WebServlet("/BoardFrontControllers")
public class BoardFrontControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Board 경로
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI UserFrontController.java");
		System.out.println(contextPath + "<-- contextPath UserFrontController.java");
		System.out.println(command + "<-- command UserFrontController.java");
		System.out.println("----UserFrontController.java ----- ");
		System.out.println();
		ActionForward	forward = null;
		BoardAction		action 	= null;
		//경로 비교문
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

}
