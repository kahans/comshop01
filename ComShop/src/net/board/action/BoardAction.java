package net.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.action.ActionForward;

public interface BoardAction {
public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
