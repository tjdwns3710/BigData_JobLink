package kdata.project.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserRegisterService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("UserRegisterService");
		
		String path = request.getServletContext().getRealPath("profile");
		System.out.println(path);
		
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest(request, path, 1024*1024*10,
													"UTF-8", new DefaultFileRenamePolicy() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = multi.getParameter("id");
		String pwd = multi.getParameter("pwd");
		String name = multi.getParameter("name");
		
		String fileSystemName = multi.getFilesystemName("file");
		String originalFileNmae = multi.getOriginalFileName("file");
		
		System.out.println(fileSystemName);
		
		//1.요청 파라미터 처리
	/*	String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String profile = request.getParameter("file");*/
		int result = 0;
		User user = new User();
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		user.setProfile(fileSystemName);
		
		
		//2. db처리
		/*UserDAO dao = UserDAO.getInstance();//new UserDAO();
		dao.insert();*/
		//위에꺼 한줄로
		
		try {
			result = UserDAO.getInstance().insert(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. db결과 처리
		System.out.println(result);
		//4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
		if(result != 0) {
			nextPage.setPageName("./user/login.jsp");
			nextPage.setRedirect(true);
		}
		else {
			request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
			nextPage.setPageName("./errors/error.jsp");
			nextPage.setRedirect(false);
		}
		//서블렛에 nextPage를 반환해줌
		return nextPage;
	}

}
