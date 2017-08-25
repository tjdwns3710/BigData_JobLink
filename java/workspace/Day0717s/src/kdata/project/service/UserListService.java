package kdata.project.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserListService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		//1.요청 파라미터 처리
	
		//2. db처리
		List<User> list = null;
		try {
			list = UserDAO.getInstance().selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. db결과 처리
		request.setAttribute("list", list);
		System.out.println(list.size());
		System.out.println(list);
		//4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/list.jsp");
		nextPage.setRedirect(false);
		System.out.println(nextPage);
		return nextPage;
	}

}
