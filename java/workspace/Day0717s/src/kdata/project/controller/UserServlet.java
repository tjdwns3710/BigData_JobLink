package kdata.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.service.NextPage;
import kdata.project.service.UserDetailService;
import kdata.project.service.UserListService;
import kdata.project.service.UserRegisterService;
import kdata.project.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
/*@WebServlet("*.kdata")*/
//contrller
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("User Servlet");		
		
		//1.URL별 분기-----------------------------------
		//---------------------------------------------
		//uri를 가져오는 함수
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String cmd = uri.substring(path.length() + 1);
		//어떤 기능을 결정하는것은 url로 구분함
		//System.out.println(uri);
		//System.out.println(path);
		//System.out.println(path.length());
		//System.out.println(cmd);
		UserService service = null;
		NextPage nextPage = null;
		//회원가입
		if(cmd.equals("register.kdata")) {
			System.out.println("회원가입");
			service = new UserRegisterService();
			nextPage = service.execute(request,response);
		}
		//회원리스트
		else if(cmd.equals("list.kdata")) {
			System.out.println("리스트");
			service = new UserListService();
			nextPage = service.execute(request,response);
		}
		//회원상세페이지
		else if(cmd.equals("detail.kdata")) {
			System.out.println("회원상세페이지");
			service = new UserDetailService();
			nextPage = service.execute(request,response);
		}
		//회원정보삭제
		else if(cmd.equals("delete.kdata")) {
			System.out.println("회원정보삭제");
		}
		//로그인
		else if(cmd.equals("login.kdata")) {
			System.out.println("로그인");
		}
		//로그아웃
		else if(cmd.equals("logout.kdata")) {
			System.out.println("로그아웃");
		}
		
		System.out.println(nextPage);
		//2. 다음페이지 -----------------------------------
		//----------------------------------------------
		if(nextPage == null) {
			System.out.println("Null을 반환하지마!");
		}
		else {
			if(nextPage.isRedirect()) {
				System.out.println("다음 페이지로 이동");
				response.sendRedirect(nextPage.getPageName());
			}
			else {
				request.getRequestDispatcher(nextPage.getPageName()).forward(request,response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
