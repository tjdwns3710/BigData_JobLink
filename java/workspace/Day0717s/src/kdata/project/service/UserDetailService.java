package kdata.project.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserDetailService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		
		User user = new User();
		try {
			user = UserDAO.getInstance().selectById(id);
			System.out.println(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. db결과 처리
		request.setAttribute("User", user);
		System.out.println(user.getProfile());
		System.out.println(user.getName());
		
		//4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/detail.jsp");
		nextPage.setRedirect(false);
		
		return nextPage;
	}

}
