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
		//1.��û �Ķ���� ó��
	
		//2. dbó��
		List<User> list = null;
		try {
			list = UserDAO.getInstance().selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. db��� ó��
		request.setAttribute("list", list);
		System.out.println(list.size());
		System.out.println(list);
		//4. �̵��� ���� ������ ó��
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/list.jsp");
		nextPage.setRedirect(false);
		System.out.println(nextPage);
		return nextPage;
	}

}
