package kdata.project.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.BoardDAO;

public class CommentsDeleteService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Ŀ��Ʈ ���� ����");
		String num = request.getParameter("commentsNum");
		int result = 0;
		
		try {
			result = BoardDAO.getInstance().deleteComments(Integer.parseInt(num));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		return null;
	}

}