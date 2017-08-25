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
		
		//1.URL�� �б�-----------------------------------
		//---------------------------------------------
		//uri�� �������� �Լ�
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String cmd = uri.substring(path.length() + 1);
		//� ����� �����ϴ°��� url�� ������
		//System.out.println(uri);
		//System.out.println(path);
		//System.out.println(path.length());
		//System.out.println(cmd);
		UserService service = null;
		NextPage nextPage = null;
		//ȸ������
		if(cmd.equals("register.kdata")) {
			System.out.println("ȸ������");
			service = new UserRegisterService();
			nextPage = service.execute(request,response);
		}
		//ȸ������Ʈ
		else if(cmd.equals("list.kdata")) {
			System.out.println("����Ʈ");
			service = new UserListService();
			nextPage = service.execute(request,response);
		}
		//ȸ����������
		else if(cmd.equals("detail.kdata")) {
			System.out.println("ȸ����������");
			service = new UserDetailService();
			nextPage = service.execute(request,response);
		}
		//ȸ����������
		else if(cmd.equals("delete.kdata")) {
			System.out.println("ȸ����������");
		}
		//�α���
		else if(cmd.equals("login.kdata")) {
			System.out.println("�α���");
		}
		//�α׾ƿ�
		else if(cmd.equals("logout.kdata")) {
			System.out.println("�α׾ƿ�");
		}
		
		System.out.println(nextPage);
		//2. ���������� -----------------------------------
		//----------------------------------------------
		if(nextPage == null) {
			System.out.println("Null�� ��ȯ������!");
		}
		else {
			if(nextPage.isRedirect()) {
				System.out.println("���� �������� �̵�");
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
