package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.MemberDao;
import spms.vo.Member;

// 오류 처리 JSP 적용  
@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection) sc.getAttribute("conn");   
			
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			//memberList.jsp에서 삭제버튼 링크를 통해 보내지는 mno를 받기 위해서
			int no = Integer.parseInt(request.getParameter("no"));
			System.out.println(no+"삭제할 번호를 받아 왔나?");
			memberDao.delete(no);
			
			response.sendRedirect("list");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
			
		} 
	}
}
